# KMP算法

为了避免暴力求解，减少不必要扫描，提高效率

思想：发生不匹配的时候不是把指针完全回溯，而是尽可能地跳过已经匹配上的部分

原理：标记并记录模式串所有子串**后缀和前缀相同**的情况

详解：

若模式串前j个元素与匹配串的某子串匹配，且第j+1个元素不匹配，则一定有
$$
t_1t_2t_3...t_j = s_is_{i+1}s_{i+2}...s_{i+j-1}
$$
根据KMP算法，模式串在j处的子串的前缀(k个)与后缀相同，则有
$$
t_1t_2t_3...t_k = t_{k-1}t_{k-2}...t_{j}\\
t_{k-1}t_{k-2}...t_{j} = s_{(i+j-1)-(k-1)}s_{(i+j-1)-(k-2)}...s_{i+j-1}
$$
替换一下即可得到
$$
t_1t_2t_3...t_k = s_{(i+j-1)-(k-1)}s_{(i+j-1)-(k-2)}...s_{i+j-1}
$$
也就是说，指针i和j都不需要回溯到初始状态，从而省略了许多重复的扫描

两个动图解释：

![img](https://pic1.zhimg.com/v2-f29d822e4faf22542875de6c73fe07d0_b.webp)

![img](https://pic1.zhimg.com/v2-e66f7a92145c8e3ea8c87b5889fbaf54_b.webp)

KMP的难点在next数组的求解，就是在发生不匹配时指针应该如何移动

j是遍历模式串的index，另设置k用作遍历next数组的index

要考虑几种情况：

- pat[k] = pat[j]：也就是前缀与后缀的最后一个元素匹配成功，令next[j] = k，思考一下不难知道，这里的含义是当进行模式匹配的时候，如果j处匹配不成功，j应该回溯到k位置(因为k往前的子串一定是能够跟模式串匹配的)
- pat[k] != pat[j]：前缀与后缀的最后一个元素没有匹配成功，令k = next[k]，最难理解的部分，已知k往前的匹配串都已经遍历过了，子串的前后缀匹配信息已经记录下来了，所以这里的目的是希望从前缀(后缀)的子串里找到能相匹配的部分
- 特殊情况，next[0] = 0



next数组修正：

分析模式串"aaaab"即可



代码实现：

```c++
//next
int *getNext(string t)
{
    int *next = new int(t.length());
    next[0] = -1;
    int j = 0, k = -1;
    while(j < t.length() - 1)
    {
        if(k == -1 || t.at(k) == t.at(j))
        {
            j++;k++;
            //if(t.at(k) == t.at(j)) 
            //    next[j] = next[k];
            //else 
                next[j] = k;
        }
        else
            k = next[k];
    }
    return next;
}

//KMP
int kmp(string s, string t, int *next)
{
    int i = 0, j = 0;
    while(i < s.length() && (int)j < t.length())
    {
        if(j == -1 || s.at(i) == t.at(j))
        {
            i++;j++;
        }
        else
            j = next[j];
    }
    if(j == t.length())
        return i - j;
    else
        return -1; 
}
```



# 用牛顿迭代法求算术平方根的近似值

```java
public int mySqrt(int x)
{
    long r = x;
    while(r * r < x)
    	r = (r + x / r) / 2;
    return (int)r;
}
```


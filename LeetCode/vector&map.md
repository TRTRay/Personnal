[TOC]

# 有关C++STL标准库的一些用法

## vector(向量)

 ### 初始化

```C++
vector<int> temp1(size);	//未赋初值，大小为szie的向量
vector<int> temp2(size,init);	//初值都为init，大小为szie的向量
vector<int> temp3(vector);	//整体复制另一个向量
vector<int> temp4(vector.begin() + a, vector.begin() + b);	//局部复制另一个向量
vector<int> temp5(array, array + c);	//用一个数组对向量进行初始化
```

### 赋值/插入

```C++
vector.assign(size,value);
vector.assign(vector.begin() + a, vector.begin() + b);

vector.insert(index, value);
vector.insert(index, num, value);
vector.insert(index, array, array + c);

vector.push_back(value);	//在最后插入一个元素
```

### 删除/清空

```C++
vector.pop_back();	//删除向量的最后一个元素
vector.erase(vector.begin() + a, vector.begin() + b);	//不包括最后一个

vector.clear();	//清空
```

### 取值

```C++
vector[index];
vector.at(index);

vector.front();
vector.back();
```

### 其他

```C++
vector.begin();
vector.end();

vector.size();	//返回元素个数
vector.capacity();	//返回vector占用的内存能够容纳的元素数量
vector.empty();	//检查是否为空

vector.swap(vector);	//整体交换
vector1 == vector2;	//直接比较,！=,<=,>=,<,>
```

### 遍历

```C++
//Method 1
for(int i = 0;i < vector.size();i++)
	cout << vector.at(i) << " ";

//Method 2
for(vector<int>::iterator it = vector.begin();it != vector.end();it++)
    cout << *it << " ";
```



## map(图)

### 赋值/插入

```C++
map[key] = value;

pair<iterator, bool> insert(pair);	//返回插入位置和结果
map.insert(pair);	//插入键值对

map.insert(iterator, pair);
map.insert(iterator, pair_list);	//多值插入
```

### 删除

```C++
map.erase(iterator);	//返回指向下一个元素的迭代器
map.erase(iterator1, iterator2);	//不包括最后一个

map.clear();
```

### 取值

```C++
map[key];	//无关键字检查
map.at(key);	//有关键字检查，有可能会报错
```

### 其他

```C++
map.begin();
vector.end();

map.size();
map.empty();
map.swap(map2);

map.find(key);	//返回指向该键值的迭代器或返回指向end的迭代器

map1 == map2;	//只有当键值对的顺序和值完全相等才返回true
```

### 遍历

```C++
for(map<int, string>::iterator it = map.begin();it != map.end();it++)
    cout << it->first << " " << it->second << endl;
//迭代器it指向键值对，first域是键，second域是值
```








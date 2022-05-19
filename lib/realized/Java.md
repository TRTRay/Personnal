# Java



java常会用到的一些操作



## 文件读入





## 冒泡排序

```java
//从低到高一定有序
public void sort(Comparable[] arr) {
    if (arr.length >= 2) {
        for (int i = 1; i < arr.length; i++) { 
            Comparable x = arr[i];
            int j = i - 1; 
            while (j >= 0 &&  (arr[j].compareTo(x) > 0)) { 
                arr[j + 1] = arr[j];
                j--;
            } 
            arr[j + 1] = x;
        }
    } 
}
```





## 实现图的Comparator


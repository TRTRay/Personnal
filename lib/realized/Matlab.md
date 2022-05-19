# Matlab



matlab会用到的一些常用操作



## 复平面上的单位向量

```matlab
%生成某一方向上的单位向量：
%K也是一个复数
exp(1i * angle(K));

K = abs(K) * exp(1i * angle(K));
```



## 滤波器设计

现成的LPF，BPF，LPF

```matlab

```



## 矩阵中最小的元素所在的位置

```matlab
[R, C] = find(a == min(a(:)));
```





## 生成正弦信号

```matlab
f = 10;	%频率
fs = 1000;	%采样率
N = 500;	%采样点数
n = 0 : N - 1;
t = n / fs;	%时间序列
y = sin(2 * pi * f * t);
plot(y);	%画图

%在采样率不变的前提下，生成不同频率的正弦波只需要更改频率即可
```


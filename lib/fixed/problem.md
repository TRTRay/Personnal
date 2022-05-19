# java的多版本切换问题

**环境变量配置**

把JAVA_HOME改成对应版本的目录

**path变量对应目录下的可执行文件（更改/删除）**

如果在上面的目录没找到相应的可执行文件，会在后面的目录里查找



# Cmake编译源文件时遇到的报错

> CMake Error: CMake was unable to find a build program corresponding to "MinGW Makefiles".  CMAKE_MAKE_PROGRAM is not set.  You probably need to select a different build tool.

“CMAKE_MAKE_PROGRAM is not set”是指没找到mingw里面的mingw-ake程序（有可能改成make了），手动指定以下即可



# Cmake编译OpenCV

**如果Cmake编译的时候报错有“Mutex”关键字**，是指编译器（MinGW）不支持，重新装一个支持多线程的（posix-seh）版本



编译过程中底部报红，message 202是指没法翻墙下载ddl文件，参考下面这个，手动下文件放在.cash即可

[Win10+Clion+OpenCV+编译源码 - 知乎 (zhihu.com)](https://zhuanlan.zhihu.com/p/107887128)



缺失cmake文件的话，cmake文件的内容如下：

```cmake
set(FFMPEG_libavcodec_FOUND 1)
set(FFMPEG_libavformat_FOUND 1)
set(FFMPEG_libavutil_FOUND 1)
set(FFMPEG_libswscale_FOUND 1)
set(FFMPEG_libavresample_FOUND 1)

set(FFMPEG_libavcodec_VERSION 58.134.100)
set(FFMPEG_libavformat_VERSION 58.76.100)
set(FFMPEG_libavutil_VERSION 56.70.100)
set(FFMPEG_libswscale_VERSION 5.9.100)
set(FFMPEG_libavresample_VERSION 4.0.0)
```






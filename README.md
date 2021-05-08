# Jetty Examples

![Jetty://](http://www.eclipse.org/jetty/images/jetty-logo-80x22.png "Jetty")

* [Jetty官方文档](http://www.eclipse.org/jetty/)

## 使用Docker创建项目运行环境

创建镜像文件

``` bash
    $ docker build -t jetty-demo:1.0.0 .
```

运行镜像

``` bash
    $ docker container run -p 3333:8080 -it jetty-demo:1.0.0 /bin/bash
```


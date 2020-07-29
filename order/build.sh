#!/usr/bin/env bash

#打包
mvn clean package -Dmaven.test.skip=true -U

#build镜像
#本地构建 docker build -t springcloud/order .
docker build -t hub.c.163.com/springcloud/order .

#本地启动镜像：docker run -p 8761:8761 -d springcloud/eureka

#将镜像上传
docker push hub.c.163.com/springcloud/order
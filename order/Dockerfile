# 指定基础镜像
FROM hub.c.163.com/library/java:8-alpine
# 维护者信息
MAINTAINER XXX XXX@imooc.com
#将本地文件添加到容器中
ADD server/target/*.jar app.jar
# 指定于外界交互的端口
EXPOSE 8080
# 执行容器
ENTRYPOINT ["java", "-jar", "/app.jar"]
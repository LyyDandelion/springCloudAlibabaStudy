## nacos 配置项相关

复制多个nacos，修改application cluster文件

1.端口修改

    server.port=8849

2.配置mysql数据，运行数据库文件
    
    ### If use MySQL as datasource:
    spring.datasource.platform=mysql
    
    ### Count of DB:
    db.num=1
    
    ### Connect URL of DB:
    db.url.0=jdbc:mysql://127.0.0.1:3306/nacos?characterEncoding=utf8&connectTimeout=1000&socketTimeout=3000&autoReconnect=true&useUnicode=true&useSSL=false&serverTimezone=UTC
    db.user.0=root
    db.password.0=root

3.集群配置：
    
    192.168.10.21:8849
    192.168.10.21:8850
    192.168.10.21:8851

4.修改bin/startup

    set MODE="cluster"
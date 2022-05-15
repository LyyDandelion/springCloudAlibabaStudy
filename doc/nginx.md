## nginx 负载均衡配置
    
    upstream nacoscluster{
        server 127.0.0.1:8849;
        server 127.0.0.1:8850;
        server 127.0.0.1:8851;
    }

    server {
        listen       8847;
        server_name  localhost;

        #charset koi8-r;

        #access_log  logs/host.access.log  main;

        location /nacos/ {
            proxy_pass http://nacoscluster/nacos/;
        }
    ......
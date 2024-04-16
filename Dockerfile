FROM ubuntu
RUN apt-get update && apt-get install -y nginx
COPY main.html /var/www/html/
RUN ["nginx", "-g", "daemon off;"] 

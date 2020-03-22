sudo mvn clean install -DskipTests=true
sudo docker stop $(sudo docker ps -aq)
sudo docker rm -f $(sudo docker ps -aq)
#sudo docker rmi -f $(sudo docker images -aq)
sudo docker rmi -f mongo_app
sudo docker-compose up

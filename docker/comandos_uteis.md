# Comandos de Docker Úteis

```bash

# Inicia serviço docker
sudo service docker start

#checa status do serviço docker
sudo service docker status

# Lista todos os containers em execução
docker ps
docker container ls

## Lista todos os containers
docker container ls -a

# Executa um container
docker container run hello-world

# Eecutar um container em um terminal com interatividade
docker container run -ti ubuntu

# Sair do container, matando o processo entrypoint do container
CTRL + D

# Sair do container, mas sem finalizar a execução do processo entrypoint
CTRL + P + Q

# Se conectar a um container já em execução
docker container attach <ID_CONTAINER>

# Executar um container com o processo entrypoint rodando em background
docker run -d nginx

```

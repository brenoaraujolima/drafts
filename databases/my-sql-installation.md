## Instalação MySql-Server e MySql-Workbench em Linux Ubuntu 

Passos para instalação do MySql Server e MySql Workbench.

### Baixando pacote para configuração de repositório

`wget -c https://repo.mysql.com//mysql-apt-config_0.8.24-1_all.deb`

### Instalação do pacote do repositório recém baixado

`sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb`

### Atualizar lista de repositórios linux

`sudo apt update`

### Instalação do MySql-Server

`sudo apt install mysql-server`

Nesse processo insira a sua senha de root do mysql

### Script de configuração para instalção segura do mysql

`sudo mysql_secure_installation`

### Checar status do serviço do mysql

`sudo systemctl status mysql`

Se não estiver ativo, basta rodar

`sudo systemctl start mysql`

### Checar versão MySql

`mysql --version`

### Habilitar início automático do MySql

`sudo systemctl enable mysql`

### Instalação do MySql-Workbench

`sudo apt install mysql-workbench-community`

Se seu ubuntu for inferior ao 20.0, instale através do seguinte comando

`sudo apt install mysql-workbench`

### Testando se MySql esta funcionando

`sudo mysql -u root -p`




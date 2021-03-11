

# checkout

```bash
git clone https://github.com/keycloak/keycloak.git
cd keycloak
git branch 9.0.0
```



```shell
git clone https://github.com/redhat-developer/redhat-sso-quickstarts.git
cd redhat-sso-quickstarts
```



## Build + Deploy

```shell
mvn -Denforcer.skip=true -Dmaven.test.skip=true -Dwildfly.port=10090 -Dorg.slf4j.simpleLogger.defaultLogLevel=WARN clean package wildfly:deploy 
```

```sh
# $HOME/.m2/settings.xml
mvn -s /caminho/settings.xml
```

```shell
# usando variavel padrao do Spring para habilitar/desabilitar a autenticação
KEYCLOAK_ENABLED=true && mvn clean spring-boot:run
```



# Comandos

## Iniciar Servidor

```shell
${RHSSO_HOME}/bin/standalone.sh -b 0.0.0.0 -Djboss.socket.binding.port-offset=100
```



### JAVA Windows

```bash
set JAVA_HOME=c:\caminho
set MVN_HOME=c:\caminho
set PATH=%PATH%;%JAVA_HOME%\bin;%MVN_HOME%\bin
```



### Como aplicar Patch

```shell
$JBOSS_HOME/bin/jboss-cli.sh "patch apply /path/to/downloaded-patch.zip"
```



# Work from Home

1. Colocar para funcionar os exemplos básicos
   1. `js-console`
   2. `keycloak-springboot-microservice`
   3. `keycloak-custom-theme`
2. Alterar o projeto `keycloak-custom-theme` para usar o LOGIN do `springio19` [link](https://github.com/jovemfelix/keycloak-docker-demo/tree/master/idm-system/keycloak/themes/springio19/)
3. Alterar o fluxo de Autenticação de login para solicitar a autenticação usando **OTP** e validar o login com o mesmo!



# Requisitos

1. Ter uma conta Developer na Red Hat - http://developers.redhat.com/ (para registrar - ir até o final da página e buscar pelo botão **JOIN Developer**)
2. Fazer o Download do Produto [RH-SSO](https://access.redhat.com/jbossnetwork/restricted/listSoftware.html?downloadType=distributions&product=core.service.rhsso)
3. Baixar os Seguintes exemplos:
   1. https://github.com/keycloak/keycloak/releases/tag/9.0.3
   2. https://github.com/redhat-developer/redhat-sso-quickstarts/tree/7.4.x
   3. https://github.com/jovemfelix/rhsso-workshop-march-2021
4. Maven [3.6.x](https://maven.apache.org/download.cgi) + JDK [1.8](https://developers.redhat.com/content-gateway/file/java-1.8.0-openjdk-1.8.0.282-1.b08.dev.redhat.windows.x86_64.zip)
5. POSTMAN -https://portapps.io/app/postman-portable/



## Dicas

1. Build dos projetos usando o Maven  [settings.xml](https://gist.github.com/jovemfelix/53730f818c85c4fb506aace314573461)



## Referências

* Red Hat Single Sign-On **Component** [Details](https://access.redhat.com/articles/2342881)

* Red Hat Single Sign-On **Supported** [Configurations](https://access.redhat.com/articles/2342861)

* [How to secure microservices with Red Hat Single Sign-On, Fuse, and 3scale](https://access.redhat.com/jbossnetwork/restricted/listSoftware.html?downloadType=distributions&product=core.service.rhsso&version=7.3&productChanged=yes)

* How to secure your Microservices with Keycloak - [Thomas Darimont](https://www.youtube.com/watch?v=FyVHNJNriUQ&t=2567s)

* Mac [Client](https://gist.github.com/jovemfelix/2c24e07c10ae97be9635f12cd4862e90) of JWT.io

* Documentação do Produto [7.4](https://access.redhat.com/documentation/en-us/red_hat_single_sign-on/7.4/)

* Documentação do Keycloak https://www.keycloak.org/documentation.html lembrar de ver a versão correspondente ao produto **9.0**

* Tema Customizado [exemplo](https://github.com/jovemfelix/keycloak-bbd-theme)

* Leitura interessante - https://www.brunobrito.net.br/nunca-utilize-resource-owner-passowrd/

* Red Hat Developer [Register](https://developers.redhat.com/register)

* Fontes e Material do curso - https://github.com/jovemfelix/rhsso-workshop-march-2021

  


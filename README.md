

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



## Referências

* Red Hat Single Sign-On **Component** [Details](https://access.redhat.com/articles/2342881)
* Red Hat Single Sign-On **Supported** [Configurations](https://access.redhat.com/articles/2342861)

* Download do [RH-SSO](https://access.redhat.com/jbossnetwork/restricted/listSoftware.html?downloadType=distributions&product=core.service.rhsso&version=7.3&productChanged=yes)


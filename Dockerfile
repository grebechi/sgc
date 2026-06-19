# Usa a imagem oficial do Tomcat
FROM tomcat:9.0-jdk17

RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Copia o seu arquivo .war gerado pelo Jenkins para a pasta webapps do Tomcat
COPY target/*.war /usr/local/tomcat/webapps/webapp.war

# Expõe a porta padrão interna do Tomcat
EXPOSE 8080

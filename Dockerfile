# Usa una imagen base de Tomcat
FROM tomcat:9.0-jre11

# Copia el código de la aplicación al directorio de despliegue de Tomcat
COPY . /usr/local/tomcat/webapps/mi-aplicacion

# Construye el archivo WAR de la aplicación (asegúrate de que tu proyecto genere un archivo WAR)
RUN ./mvnw clean package
# RUN ./gradlew build (si usas Gradle)

# Expón el puerto en el que Tomcat escuchará (por defecto, el puerto 8080)
EXPOSE 8080

# Ejecuta Tomcat al iniciar el contenedor
CMD ["catalina.sh", "run"]
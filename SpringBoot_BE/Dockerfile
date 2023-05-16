# Selecciona la imagen base de Java 17
FROM adoptopenjdk:17-jre-hotspot

# Copia el archivo JAR al contenedor
COPY target/SpringBoot_BE-0.0.1-SNAPSHOT.jar /app/mi-aplicacion.jar

# Establece el directorio de trabajo
WORKDIR /app

# Ejecuta el comando para iniciar la aplicación
CMD ["java", "-jar", "mi-aplicacion.jar"]

# Use a imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR gerado para o diretório de trabalho
COPY target/contabil-0.0.1.jar contabil.jar

# Expõe a porta em que a aplicação estará rodando
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "contabil.jar"]
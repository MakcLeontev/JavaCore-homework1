FROM bellsoft/liberica-openjdk-alpine:11.0.16
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/main/Main.java
CMD java -classpath ./out main.Main
@echo off
IF NOT EXIST target\Calculate-1.0-SNAPSHOT-jar-with-dependencies.jar (
mvn clean compile assembly:single -q
java -jar target\Calculate-1.0-SNAPSHOT-jar-with-dependencies.jar %1 %2 %3
) else (
java -jar target\Calculate-1.0-SNAPSHOT-jar-with-dependencies.jar %1 %2 %3
)
PAUSE
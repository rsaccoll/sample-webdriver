1. Subir o container docker;
<pre>docker-compose up</pre>

2. Rodar os testes com gradle
<pre>./gradlew clean test -Ptest.scope=Sample -Pbrowser.name=chrome -Penvironment.name=local </pre>
## Stack

- Java 1.8;
- Gradle 5;
- Selenium;
- Junit Jupiter;
- TypeSafe;
- Gson;
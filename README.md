1. Subir o container docker;
<pre>docker-compose up</pre>

2. Rodar os testes com gradle
<pre>./gradlew clean test -Ptest.scope=Sample -Pbrowser.name=chrome -Penvironment.name=local </pre>
## Stack

- Java 11;
- Gradle 6;
- Selenium;
- Junit Jupiter;
- TypeSafe;
- Gson;

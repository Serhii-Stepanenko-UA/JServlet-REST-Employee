
ТЕХСТЕК

JDK
https://www.oracle.com/java/technologies/downloads/
(якщо встановлена, то Apache Tomcat має підтягнути встановлену)

Apache Tomcat
https://tomcat.apache.org/
(якщо Apache Tomcat вже встановлено, то можна скористатися встановленим)

Jakarta Servlet - стандартна технологія для взаємодії
з Інтернетом на платформі Jakarta EE.
https://projects.eclipse.org/projects/ee4j.servlet/releases/6.1

Jackson
https://github.com/FasterXML/jackson

MySQL 8
https://www.mysql.com/

Hibernate 6
https://hibernate.org/

Apache Maven WAR Plugin
https://maven.apache.org/plugins/maven-war-plugin/index.html

------------------------

JAVA ПРОЕКТ

(1) Налаштовуємо БД ( INFO/SQLs.sql ).
(2) Створюємо Maven-проект.
(3) Додаємо залежності ( pom.xml ).
(4) Формуємо та відповідно структуруємо
необхідний контент ( src/main ).

------------------------

РОЗГОРТАННЯ (ДЕПЛОЙ) ПРОЕКТУ

Запустимо Apache Tomcat.
Створюэмо секцію Git Bash.
В IDE внизу

Terminal >  <іконка-випадаючого-списку>  > Git Bash

В секції буде шлях до директорії поточного проекту

<your-base-path>/<your-project-name>

Переходимо до директорії, де розташовані файли запуску
та припинення роботи Apache Tomcat

$ cd <your-base-path>/apache-tomcat-<version>/bin
напр. cd /c/_APPs/apache-tomcat-10.1.31/bin

Виконуємо команду

$ ./startup.bat

УВАГА.
Запуск Apache Tomcat:
startup.bat - для Windows,
startup.sh - для MacOS/Linux.
Припинення Apache Tomcat:
shutdown.bat - для Windows,
shutdown.sh - для MacOS/Linux.

Окремо з'явиться інформаційне вікно,
де відображається інформація про роботу
Apache Tomcat та програми.

Можемо згорнути його.

В IDE відкриваємо бокову праворуч вкладку Maven.
Через меню вкладки відкриваємо вікно команд,
де послідовно знаходимо та подвійним кліком
запускаємо відповідні Maven-команди

mvn clean

mvn install

mvn war:war

В директорії проекту target, знаходимо файл
Your-Project-Name-1.0-SNAPSHOT.war та копіюємо його
у відповідну директорію Apache Tomcat, в файловій системі
комп'ютера

<your-base-path>/apache-tomcat-<version>/webapps

Через декілька секунд, в цій директорії, має з'явитися
тека Your-Project-Name-1.0-SNAPSHOT.
Apache Tomcat розархівував архівний файл проекту.

Тестуємо функціонал програми.

------------------------

РЕСУРСИ

https://javadoc.io/doc/jakarta.servlet/jakarta.servlet-api/latest/jakarta.servlet/module-summary.html
https://jakarta.ee/specifications/servlet/6.1/jakarta-servlet-spec-6.1#overview
https://jakarta.ee/specifications/servlet/6.1/jakarta-servlet-spec-6.1#request-handling-methods
https://jakarta.ee/specifications/servlet/6.1/jakarta-servlet-spec-6.1#request-uri-path-processing
https://www.baeldung.com/rest-versioning
https://www.baeldung.com/rest-http-put-vs-post
https://www.baeldung.com/jackson-object-mapper-tutorial
https://www.baeldung.com/java-dto-pattern


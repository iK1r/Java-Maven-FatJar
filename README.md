# Maven FatJar Homework

Навчальний проєкт: модуль 1, Maven + JSON + FatJar.

## Перед запуском

У файлі `src/main/java/org/example/App.java` заміни:
- `YOUR_NAME` на своє ім'я англійською;
- `YOUR_LAST_NAME` на своє прізвище англійською.

## Збірка (з кореня проєкту)

```powershell
mvn clean package
```

Результат: `target/myname.jar`. Команда `mvn package` теж створює FatJar.

## Запуск

```powershell
java -jar target/myname.jar
```

Для запуску точно командою `java -jar myname.jar` перейди в `target`:

```powershell
cd target
java -jar myname.jar
```

Очікуваний формат результату:

```json
{"name":"YOUR_NAME","lastName":"YOUR_LAST_NAME"}
```

Цей JAR містить Gson всередині. `maven-shade-plugin` збирає FatJar, а
`maven-checkstyle-plugin` перевіряє стиль за наданим ментором `checkstyle.xml`.

## GitHub

Публікуй цей проєкт в окремий публічний репозиторій. Папку `target` не додавай:
під час перевірки викладач створить JAR командою `mvn package`.

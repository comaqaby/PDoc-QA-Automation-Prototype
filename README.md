PandaDoc
=======

To run tests you need:
1. Unarchive PDoc-QA-Automation-Prototype.zip
2. Open windows command line go to folder with unzipped files.
3. Run command: "mvn clean compile test" (You need to install Maven and add it to path system variable). You can download Maven here: http://maven.apache.org/download.cgi)
4. Run command: "mvn -Dbrowser=chrome clean compile test" to run tests in chrome.
5. Run command: "mvn -Dbrowser=firefox -Dgroups=smoke clean compile test" to run smoke group tests in firefox.
5. After test passed run command: "mvn site". Go to "..\PDoc-QA-Automation-Prototype\target\site" and open "allure-maven-plugin.html" report file.

Optionally you can open pom.xml in IntelliJ IDEA and run tests from this IDE.
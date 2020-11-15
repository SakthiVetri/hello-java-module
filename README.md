# hello-java-module
Java Module Example

Add JavaFX module to your jdk installation

javac --module-path ~/java_modules/javafx-jmods-11.0.2 --add-modules javafx.controls hello/module/App.java

java --module-path ~/java_modules/javafx-sdk-11.0.2/lib --add-modules javafx.controls hello.module.App

javac --module-path ~/java_modules/javafx-jmods-11.0.2 --add-modules javafx.controls -d mods --module-source-path src src/hello/module-info.java src/hello/module/App.java

jar --create --file hello.jar --main-class hello.module.App -C mods/hello . 

java --module-path ~/java_modules/javafx-sdk-11.0.2/lib:. -m hello

jmod create --class-path hello.jar hello.jmod

jlink --module-path /Library/Java/JavaVirtualMachines/adoptopenjdk-13.jdk/Contents/Home/jmods:~/java_modules/javafx-sdk-11.0.2/lib:~/java_modules/javafx-jmods-11.0.2  --add-modules hello,javafx.controls --launcher runapp=hello --output dist 

Reference:
https://www.developer.com/java/data/what-is-a-custom-runtime-image-in-java-9.html

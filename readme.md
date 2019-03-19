# Gradle same dependency archive name problem

## Build
```
./gradlew bar:client:pTML baz:client:build // ensure local dependencies

./gradlew build
```

## Show problem
```
./gradlew :app:bootJar

java -jar app/build/libs/app-0.0.1-SNAPSHOT.jar

Exception in thread "main" java.lang.NoClassDefFoundError: com/example/foo/FooClient
        at java.base/java.lang.Class.getDeclaredMethods0(Native Method)
        at java.base/java.lang.Class.privateGetDeclaredMethods(Class.java:3167)
        at java.base/java.lang.Class.getDeclaredMethod(Class.java:2474)
        at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:47)
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:87)
        at org.springframework.boot.loader.Launcher.launch(Launcher.java:50)
        at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51)
Caused by: java.lang.ClassNotFoundException: com.example.foo.FooClient
        at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:471)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:588)
        at org.springframework.boot.loader.LaunchedURLClassLoader.loadClass(LaunchedURLClassLoader.java:93)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 7 more

```


## Show resolved artifacts with type
```
./gradlew :app:showSourceClasspath
```


# config

```
public static void main(String[] args) {
    Config config = new Config();
}
```

## using in your projects

### Gradle
```
repositories {
    maven { url 'https://jitpack.io' }
}
```

```
dependencies {
    implementation 'com.github.stzups:config:master-SNAPSHOT'
}
```

### Maven
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```
<dependency>
    <groupId>com.github.stzups</groupId>
    <artifactId>config</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```
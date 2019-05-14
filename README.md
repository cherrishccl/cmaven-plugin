# 自定义maven插件
* 创建maven项目
* 修改pom.xml的packaging为 `<packaging>maven-plugin</packaging>`
* 引入依赖
```
<dependency>
    <groupId>org.apache.maven</groupId>
    <artifactId>maven-plugin-api</artifactId>
    <version>3.5.0</version>
</dependency>
<dependency>
    <groupId>org.apache.maven.plugin-tools</groupId>
    <artifactId>maven-plugin-annotations</artifactId>
    <version>3.5</version>
    <scope>provided</scope>
</dependency>
```
* 创建类并继承 `AbstractMojo` 重写方法 `execute()`
    * 自定义配置参数 `@Parameter`
    * 自定义命令行参数 `@Parameter(property = "args")`

# springbootStudy
spring-boot学习

## Helloword
1. 创建一个spring-boot项目
2. 配置热部署，在pom.xml中添加
```
<!--热部署工具-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <!--<scope>true</scope>-->
        </dependency>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>
```
3. 使用springbootTest进行单元测试

## webStarter
一个web项目的使用示例
1. 使用@Valid+BindingResult进行参数校验
2. 利用@Configuration注解声明一个filter
3. 利用@Value注解获取properties中的值
4. 利用@RunWith(SpringRunner.class)进行单元测试


## JPA
1. 在application.properties文件中配置数据库信息
2. 接口继承JPARepository接口后即可使用JPARepository中常用的查询方法
3. 分页查询时页码是从0开始的，如：
```
int page=0,size=10;
Sort sort = new Sort(Sort.Direction.DESC, "id");
Pageable pageable = new PageRequest(page, size, sort);
```
4. 分页查询时建议使用Pageable参数作为方法的最后一个参数
5. 
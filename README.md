# spb-security-jpa

一、数据库

1、jpa的注解
    
    @Entity
    @Table(name="tb_role")
 在程序启动后，会自动创建空表，如果数据库中已经有表，会报错，冲突。
 
 2、插入数据的sql,见项目service目录下sql.txt
 
 二、报错：Circular view path
 
 是因为pom中没有加 thymeleaf 依赖
 
 三、抽离密码加密算法，拿到密码
 
 使用方法：
 
    new BCryptPasswordEncoder().encode("admin");
 
 详细见service目录下的Test-main函数

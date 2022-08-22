# SpringBoot 介绍


## Springboot简介

    SpringBoot 是用于简化Spring开发的框架
    整个Spring框架的整合
    J2EE一站式服务


## 微服务

    是一个架构风格
    一个应用应该是小型服务，通过http进行互通

## controller，service，dao关系

    controller是表述层，它的作用主要是架起了外界与业务层沟通的桥梁，移动端，前端在调用接口访问相关业务时，都会通过Controller，由Controller去调相关的业务层代码并把数据返回给移动端和前
    service是业务逻辑处理，
    dao是持久化层，如 mybatis

## starter 启动器

    springboot将所有的场景都抽取出来做成一个个starter（启动器），只需要在这些项目中引入这些starter 相关场景的所有依赖都会导入

## SpringBootApplication 

    SpringBootApplication 由一个个的配置组成如

    SpringBootConfiguration:表示该类是一个配置类
    EnableAutoConfiguration：开启自动配置功能，将主配置类所在包下的所有子包扫描到容器。底层调用 Import(AutoConfigurationPackages.Registrar.class)



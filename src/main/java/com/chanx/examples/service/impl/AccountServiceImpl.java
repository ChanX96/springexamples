package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Date;

/*
*  注解分类：
*           1. 用于创建对象的注解，同<bean>标签。
*               @Component：用于把当前类对象存入spring容器中。属性是value，用于指定<bean>的id。默认值是当前类名且首字母小写。
*               @Controller：一般用在表现层。
*               @Service：一般用在业务层。
*               @Repository：一般用在持久层。
*               后三个注解的作用与属性同Component相同。这三个注解时spring框架为我们提供的明确的三层使用的注解，使我们的三层对象更
*               加清晰。
*           2. 用于注入数据的注解，同<property>标签。
*               @Autowired：自动按照类型注入。只要容器中有唯一的bean对象类型和要注入的类型变量匹配，就可以注入成功。
*                           书写位置可以是成员变量上，也可以是方法上。使用注解方法时，set方法不是必要的。
*               @Qualifier：在按照类型的基础上再按照名称注入。再给类成员注入式不能单独使用，但是再给方法参数注入时可以。
*                           属性value，用于指定注入bean的id。
*               @Resource：直接按照bean的id注入。可以独立使用。
*                           属性name，用于指定bean的id。
*               以上三个注解都只能注入其他bean类型数据，而基本类型和String类型无法使用上述注解实现。
*               另外，集合类型的注入只能通过XML来实现。
*               @Value：用于注入基本类型和String类型数据。
*                           属性value，用于指定数据的值。可以使用spring的SpEL（spring中的el表达式）
*                           SpEL的写法：${表达式}
*           3. 用于改变作用范围的注解，同scope属性。
*               @Scope：用于指定bean的作用范围。
*                           属性value：指定范围的取值。常用取值：singleton prototype
*           4. 和生命周期相关的注解，同init-method和destroy-method。
*               @PreDestroy：用于指定销毁方法。
*               @PostConstruct：用于指定初始化方法。
* */
// 账户的业务层实现类
@Service("accountService")
public class AccountServiceImpl implements AccountService {

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao1")
    private AccountDao accountDao;

//    // 如果是经常变化的数据,并不适用于注入方式
//    private String name;
//    private Integer age;
//    private Date birthday;
//
//    public AccountServiceImpl(String name, Integer age, Date birthday) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//    }

    @PostConstruct
    public void init() {
        System.out.println("初始化方法执行了");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁方法执行了");
    }

    public void saveAccount() {
        accountDao.saveAccount();
//        System.out.println(name + " " + age + " " + birthday);
//        System.out.println("对象初始化了");
    }
}

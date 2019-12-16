package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.dao.impl.AccountDaoImpl;
import com.chanx.examples.service.AccountService;
import org.springframework.stereotype.Component;

import java.util.Date;

/*
*  注解分类：
*           1. 用于创建对象的注解，同<bean>标签。
*               @Component：用于把当前类对象存入spring容器中。属性是value，用于指定<bean>的id。默认值是当前类名且首字母小写。
*           2. 用于注入数据的注解，同<property>标签。
*           3. 用于改变作用范围的注解，同scope属性。
*           4. 和生命周期相关的注解，同init-method和destroy-method。
* */
// 账户的业务层实现类
@Component
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

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

    public void saveAccount() {
        accountDao.saveAccount();
//        System.out.println(name + " " + age + " " + birthday);
    }
}

package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.dao.impl.AccountDaoImpl;
import com.chanx.examples.service.AccountService;

import java.util.Date;

// 账户的业务层实现类
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    // 如果是经常变化的数据,并不适用于注入方式
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount() {
        accountDao.saveAccount();
        System.out.println(name + " " + age + " " + birthday);
    }
}

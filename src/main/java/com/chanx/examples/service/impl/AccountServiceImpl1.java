package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.service.AccountService;

import java.util.Date;

public class AccountServiceImpl1 implements AccountService {

//    private AccountDao accountDao = new AccountDaoImpl();

    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
//        accountDao.saveAccount();
        System.out.println(name + " " + age + " " + birthday);
    }
}

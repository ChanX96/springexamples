package com.chanx.examples.dao.impl;

import com.chanx.examples.dao.AccountDao;
import org.springframework.stereotype.Repository;

// 账户持久层实现类
@Repository("accountDao1")
public class AccountDaoImpl1 implements AccountDao {

    public void saveAccount() {

        System.out.println("保存了账户111111");
    }
}

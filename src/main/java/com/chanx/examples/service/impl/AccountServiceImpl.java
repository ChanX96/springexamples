package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.dao.impl.AccountDaoImpl;
import com.chanx.examples.service.AccountService;

// 账户的业务层实现类
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}

package com.chanx.examples.service.impl;

import com.chanx.examples.dao.AccountDao;
import com.chanx.examples.dao.impl.AccountDaoImpl;
import com.chanx.examples.service.AccountService;

import java.util.*;

public class AccountServiceImpl2 implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String, String> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(myProps);
        System.out.println(mySet);
        accountDao.saveAccount();
    }
}

package com.giggs13.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAOImpl
        implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }
}

package com.giggs13.aop.dao;

import com.giggs13.aop.Account;

public interface AccountDAO {

    void addAccount(Account account,
                    boolean vip);

    boolean doWork();
}

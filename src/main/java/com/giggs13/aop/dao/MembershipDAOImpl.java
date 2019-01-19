package com.giggs13.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAOImpl
        implements MembershipDAO {

    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");

        return true;
    }
}

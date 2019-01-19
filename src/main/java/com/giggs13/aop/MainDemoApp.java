package com.giggs13.aop;

import com.giggs13.aop.dao.AccountDAO;
import com.giggs13.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = context.getBean(AccountDAO.class);
        accountDAO.addAccount();

        MembershipDAO membershipDAO = context.getBean(MembershipDAO.class);
        membershipDAO.addSillyMember();

        context.close();
    }
}

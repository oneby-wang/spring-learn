package com.oneby.service;

import com.oneby.dao.AccountDao;
import com.oneby.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName AccountService
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/24 21:03
 * @Version 1.0
 */
@Service
//@Transactional
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfer(String srcAccountName, String destAccountName, int money) {
        accountDao.tranfer(srcAccountName, money);
        int i = 10 / 0; // 手动制造异常
        accountDao.tranfer(destAccountName, -money);
        System.out.println(srcAccountName + " 向 " + destAccountName + " 转账 " + money + " 元");
    }

}

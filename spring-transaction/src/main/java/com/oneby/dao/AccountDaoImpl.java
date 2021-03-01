package com.oneby.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/23 23:58
 * @Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    // 注入 JdbcTemplate 对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int tranfer(String accountName, int money) {
        // 创建 SQL 语句
        String sql = "update t_accounts set account_balance = account_balance - ? where account_name = ?";

        // SQL 语句参数
        Object[] args = {money, accountName};

        // 执行 SQL 语句
        int insertRows = jdbcTemplate.update(sql, args);
        return insertRows;
    }
}

package com.oneby.dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/22 11:28
 * @Version 1.0
 */
@Repository
public class OrderDao {

    public void sell() {
        System.out.println("DAO 层操作：商品库存减一");
    }

}

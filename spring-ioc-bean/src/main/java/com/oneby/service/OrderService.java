package com.oneby.service;

import com.oneby.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/21 22:17
 * @Version 1.0
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public void sell() {
        orderDao.sell();
        System.out.println("Service 层操作：出售一件商品");
    }

}

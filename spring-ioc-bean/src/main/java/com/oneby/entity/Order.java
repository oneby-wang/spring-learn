package com.oneby.entity;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/21 21:50
 * @Version 1.0
 */
public class Order {

    private String name;

    public Order() {
        System.out.println("第一步：执行无参数构造创建 bean 实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：调用 setter 方法为属性赋值");
    }

    //  init-method 初始化方法
    public void initMethod(){
        System.out.println("第四步：执行 init-method 初始化方法");
    }

    //  destroy-method 销毁方法
    public void destroyMethod(){
        System.out.println("第七步：执行 destroy-method 初销毁方法");
    }

}

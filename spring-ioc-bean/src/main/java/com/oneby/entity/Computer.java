package com.oneby.entity;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/13 23:09
 * @Version 1.0
 */
public class Computer {

    String computerId;
    String computerName;

    public Computer() {
    }

    public Computer(String computerId, String computerName) {
        this.computerId = computerId;
        this.computerName = computerName;
    }

    public String getComputerId() {
        return computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerId='" + computerId + '\'' +
                ", computerName='" + computerName + '\'' +
                '}';
    }
}

package cn.morethink.shop.entity;

import java.io.Serializable;

/**
 * @author 李文浩
 * @date 2017/12/22
 */
public class Commodity implements Serializable {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

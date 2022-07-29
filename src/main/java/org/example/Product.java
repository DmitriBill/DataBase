package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "productss")
public class products {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer price;
    @OneToMany (mappedBy = "products", cascade = CascadeType.ALL)
    private List<Orders> Orders = new ArrayList<>();

    public products () {}
    public products (String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public List<Orders> getOrderss() {
        return Orderss;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setOrderss(List<Orders> Orderss) {
        this.Orderss = Orderss;
    }

    public void addOrders (Orders Orders) {
        Orderss.add(Orders);
    }

    @Override
    public String toString() {
        return "products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
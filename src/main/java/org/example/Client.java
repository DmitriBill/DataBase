package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class clients {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    @OneToMany (mappedBy = "clients", cascade = CascadeType.ALL)
    private List<Orders> Orderss = new ArrayList<>();

    public clients () {}
    public clients (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setOrderss(List<Orders> Orderss) {
        this.Orderss = Orderss;
    }

    public void addOrders (Orders Orders) {
        Orderss.add(Orders);
    }

    @Override
    public String toString() {
        return "clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
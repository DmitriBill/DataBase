package org.example;

import javax.persistence.*;

@Entity
@Table (name = "Orderss")
public class Orderss {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "clients_id")
    private clients clients;
    @ManyToOne
    @JoinColumn (name = "products_id")
    private products products;

    public Orders () {}
    public Orders (clients clients, products products) {
        this.clients = clients;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public clients getclients() {
        return clients;
    }

    public products getproducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setclients(clients clients) {
        this.clients = clients;
    }

    public void setproducts(products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "clients - " + this.clients.getName() + " bought " + " products - " + this.products.getName();
    }
}
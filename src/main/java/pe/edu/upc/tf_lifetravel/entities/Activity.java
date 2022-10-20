package pe.edu.upc.tf_lifetravel.entities;

import javax.persistence.*;

@Entity
@Table(name="activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String description;
    private Float price;
    private String date;

    @ManyToOne
    @JoinColumn(name="destination_id", nullable = false)
    private Destination destination;

    public Activity() {
    }

    public Activity(String name, String description, Float price, String date, Destination destination) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.date = date;
        this.destination = destination;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}


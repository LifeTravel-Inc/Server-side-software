package pe.edu.upc.tf_lifetravel.entities;

import javax.persistence.*;

@Entity
@Table(name = "h_reviews")
public class HotelReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String date;
    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable=false)
    private Hotel hotel;

    public HotelReview() {
    }

    public HotelReview(String user, String date, Hotel hotel) {
        this.user = user;
        this.date = date;
        this.hotel = hotel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}

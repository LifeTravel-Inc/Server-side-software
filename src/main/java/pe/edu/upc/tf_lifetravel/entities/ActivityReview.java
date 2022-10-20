package pe.edu.upc.tf_lifetravel.entities;

import javax.persistence.*;

@Entity
@Table(name="a_reviews")
public class ActivityReview {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String date;

    @ManyToOne
    @JoinColumn(name="activity_id", nullable=false)
    private Activity activity;

    public ActivityReview() {
    }

    public ActivityReview(String user, String date, Activity activity) {
        this.user = user;
        this.date = date;
        this.activity = activity;
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

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}

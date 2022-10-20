package pe.edu.upc.tf_lifetravel.entities;

import javax.persistence.*;

@Entity
@Table(name="destinations")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name="agency_id", nullable=false)
    private Agency agency;

    public Destination() {
    }

    public Destination(Long id, String name, Agency agency) {
        this.id = id;
        this.name = name;
        this.agency = agency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }
}

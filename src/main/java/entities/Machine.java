package entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@NamedNativeQuery(name = "findBetweenDateNative", query = "select * from machine where dateAchat between :d1 and :d2", resultClass = Machine.class)
@NamedQuery(name = "findBetweenDate", query = "from Machine where dateAchat between :d1 and :d2")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @ManyToOne
    private Salle salle;

    public Machine(String ref, Date dateAchat, Salle salle) {
        this.ref = ref;
        this.dateAchat = dateAchat;
        this.salle = salle;
    }
    public Machine() {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setRef(String s) {
    }

    public void setDateAchat(Date date) {
    }

    public void setSalle(Salle salle) {
    }

    // Constructeurs, getters et setters
}
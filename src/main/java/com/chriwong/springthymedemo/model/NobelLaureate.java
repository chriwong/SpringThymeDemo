package com.chriwong.springthymedemo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="laureate")
public class NobelLaureate {

    @Id
    private Long id;
    private String firstname;
    private String surname;
    private String motivation;
    private short share;

    @ManyToMany(mappedBy = "laureates")
    private List<NobelPrize> prizes = new ArrayList<>();;


    protected NobelLaureate() { }


    public NobelLaureate(Long id, String firstname, String surname, String motivation, short share, List<NobelPrize> prizes) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.motivation = motivation;
        this.share = share;
        this.prizes = prizes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public short getShare() {
        return share;
    }

    public void setShare(short share) {
        this.share = share;
    }
}

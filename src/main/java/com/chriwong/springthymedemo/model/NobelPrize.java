package com.chriwong.springthymedemo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="prize")
public class NobelPrize {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int year;
    private String category;

    @ManyToMany
    @JoinTable(
        name ="prize_laureate",
        joinColumns = @JoinColumn(name = "prize_id"),
        inverseJoinColumns = @JoinColumn(name = "laureate_id")
    )
    private List<NobelLaureate> laureates = new ArrayList<>();


    protected NobelPrize() { }


    public NobelPrize(int year, String category, List<NobelLaureate> laureates) {
        this.year = year;
        this.category = category;
        this.laureates = laureates;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<NobelLaureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<NobelLaureate> laureates) {
        this.laureates = laureates;
    }
}

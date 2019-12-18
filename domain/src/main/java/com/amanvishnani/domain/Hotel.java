package com.amanvishnani.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int classification;
    private boolean isOpen;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassification() {
        return classification;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

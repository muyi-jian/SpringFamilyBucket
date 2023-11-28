package com.yj.spring6.bean;

import java.util.List;

/**
 * @author YangJian
 * @date 2023/11/28 20:54
 * @description
 */
public class P {
    private String species;
    private List<Animal> animals;

    public P() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "P{" +
                "species='" + species + '\'' +
                ", animals=" + animals +
                '}';
    }
}

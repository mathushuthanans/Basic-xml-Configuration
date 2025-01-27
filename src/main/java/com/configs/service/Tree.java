package com.configs.service;

public class Tree {
    // biology information
    private String name;
    private String family;
    private String species;
    private String region;
    private String uses;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getUses() {
        return uses;
    }
    public void setUses(String uses) {
        this.uses = uses;
    }

    @Override
    public String toString() {
        return "Tree [name=" + name + ", family=" + family + ", species=" + species + ", region=" + region + ", uses="
                + uses + "]";
    }
    

    

}

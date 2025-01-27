package com.configs.service;

import java.util.Scanner;

public class Details {
    private Tree tree;

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
        
    }
    public void askDetails(){
        System.out.println(tree.toString());;
    }
    public void write(Scanner sc){
        
        
        System.out.print("Enter the Name of the Tree: ");
        tree.setName(sc.nextLine());

        System.out.print("Enter the Name of the Family: ");
        tree.setFamily(sc.nextLine());

        System.out.print("Enter the Species: ");
        tree.setSpecies(sc.nextLine());

        System.out.print("Enter the Regions: ");
        tree.setRegion(sc.nextLine());

        System.out.print("Enter the Uses: ");
        tree.setUses(sc.nextLine());
    
    }
    
}

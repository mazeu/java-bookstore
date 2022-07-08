package br.com.mazeu.bookstore.model.service;

import java.util.*;

public class CuponsManager {
    private Set<String> cupons;

    public CuponsManager(){
        this.cupons = new HashSet<>();

        cupons.addAll(Arrays.asList("CUP74","CUP158","CUP14","CUP52","CUP21","CUP221","CUP91","CUP327","CUP410","CUP275","CUP484","CUP207","CUP96","CUP119","CUP174","CUP291","CUP1","CUP115","CUP222","CUP272"));

    }

    public boolean trustCupom(String cupom){
        return this.cupons.contains(cupom);
    }
}

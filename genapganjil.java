package com.company;

public class genapganjil {

    public static void main(String[] args) {
	// write your code here
        int bilangan = 13;

        String result = (bilangan % 2 == 0) ? "Genap" : "Ganjil";
        System.out.print("Angka "+String.valueOf(bilangan)+" adalah "+result);
    }
}

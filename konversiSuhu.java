package com.company;

        import java.util.Scanner;

        public class konversiSuhu {

            public static void main(String[] args) {
                double celcius,farenheit,reamur;
                Scanner input=new Scanner(System.in);
                System.out.println("Masukan Suhu Temperatur Dalam Celcius :  ");

                celcius = input.nextInt();
                farenheit = celcius*9/5+32;
                reamur = celcius*4/5;
                double Celcius = celcius;

                System.out.println("Hasil Konversi Suhu Celcius ke Celcius : "+celcius);
                System.out.println("Hasil Konversi Suhu Celcius ke Farenhit : "+farenheit);
                System.out.println("Hasil Konversi Suhu Celcius ke Reamur : "+reamur);
            }

        }

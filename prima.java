package com.company;

        import java.util.Scanner;

        public class prima {
            public static void main(String[] args){
                boolean isbilanganprima = true;
                Scanner input = new Scanner(System.in);
                System.out.println("input angka :  ");
                int angka = input.nextInt();
                //mengambil nilai input user atau pengguna dan disimpan ke variable angka

                for (int index=2; index<=angka/2; index++){
                    //looping dari index 2, jika indexkurang dari sama dengan angka dibagi 2
                    //berarti bilangan prima yang bernilai true
                    if (angka%index ==0){
                        //jika bilangan atau nilai habis di bagi atau sama dengan 0
                        //berarti bukan bilangan prima
                        isbilanganprima =false;
                        break;
                    }
                }
                if (isbilanganprima){
                    System.out.println(angka+" : adalah bilangan prima ");
                    //menampilkan output jika hasil adalah bilangan prima
                }
                else{
                    System.out.println(angka+" : bukan termasuk bilangan prima ");
                    //menampilkan output jika hasil bukan bilangan prima
                }
            }
        }
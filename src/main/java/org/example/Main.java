package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }

    //Palidrom Sayıyı Bulma
    public static boolean IsPalindrome(int sayi) {
        int sayiabs=Math.abs(sayi);
        String sayiString = Integer.toString(sayiabs);
        String reverse = "";

        for (int i = 0; i < sayiString.length(); i++) {
            reverse = sayiString.charAt(i)+reverse;
        }
        return sayiString.equals(reverse);
    }

    //Mükemmel Sayıyı Bulma
    public static boolean isPerfectNumber(int sayi) {

        int num = sayi;
        int toplam = 0;//put your value here

        if (sayi<=0) {
            return false;
        }
        for (int i = 1; i < (num / 2) + 1; i++) {

            if ((num % i) == 0) {

                toplam += i;


            }

        }
        return toplam==sayi;

    }
}


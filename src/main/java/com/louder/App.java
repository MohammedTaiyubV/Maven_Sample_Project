package com.louder;

class Fact {
    public static void main(String[] args) {

        int n = 5, fact = 1, temp = n;

        while (n > 1) {
            fact *= n--;
        }

        System.out.println(temp + " Factorial is : " + fact);
    }
}

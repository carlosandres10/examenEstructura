package com.upchiapas.examen.models;

import java.util.Stack;

public class Cadena {

    private String palabra;

    public Cadena(String palabra) {this.palabra = palabra;}

    public void proceso() {
        Stack<Character> pila = new Stack<Character>();


        for (int i = 0; i < palabra.length(); i++) {
            pila.push(palabra.charAt(i));
        }

        String letra = "";
        String simbolo = "";
        String auxPila = "";
        while (!pila.isEmpty()) {
            auxPila = auxPila + pila.pop();

            if (auxPila.equals("+") || auxPila.equals("-") || auxPila.equals("*") || auxPila.equals("/")) {
                simbolo += auxPila;
            } else {
                letra += auxPila;
            }
            auxPila = "";
        }
        System.out.print(simbolo);
        System.out.print(letra);
    }
}

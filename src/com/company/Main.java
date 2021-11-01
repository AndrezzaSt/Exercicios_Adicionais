package com.company;

import java.util.*;

import com.company.Elevador;

public class Main {

    public static void Teste_Elevador() {
        Elevador elevador = new Elevador(0, 10, 6, 0);
        //quando o contator chegar em 6 deve apresentar capacidade maxima.
        for (int i = 0; i < 10; i++) {
            elevador.Entra();
        }
        //quando o contator chegar em 6 deve apresentar que o elevador está vazio.
        for (int i = 0; i < 10; i++) {
            elevador.Sai();
        }
        //quando o contator chegar em 11 deve apresentar que o elevador já está no ultimo andar.
        for (int i = 0; i < 11; i++) {
            elevador.Sobe();
        }
        //quando o contator chegar em 11 deve apresentar que o elevador já está no primeiro andar.
        for (int i = 0; i < 11; i++) {
            elevador.Desce();
        }
    }

    public static String String_Rep(String str, int n) {
        str = str.repeat(n);
        System.out.println(str);
        return str;
    }

    /*
     * Escreva um método em Java que recebe duas strings A e B e retorna
        quantas ocorrências de B ocorrem em A.
        A-> “abcd abc aabc baa abcaa”
        B -> “aa”
        “aa”' aparece 3 vezes em “abcd abc aabc baa abcaa”
     */
    public static void strB_ocurrences_in_strA(String A, String B) {
        String temp[] = A.split(" ");
        int count = 0;

        for (int i = 0; i < temp.length; i++) {
            if (B.equals(temp[i]))
                count++;
        }
        System.out.println("The string is: " + B);
        System.out.println("A palavra " + A + " ocorre " + count + " vezes na string acima");
    }

    public static void main(String[] args) {
        //Teste_Elevador();

        //Número fornecido 7: PHPPHPPHPPHPPHPPHPPHP
        String_Rep("PHP", 7);
        strB_ocurrences_in_strA("batatinha", "batatinha 1 2 3");
    }

}


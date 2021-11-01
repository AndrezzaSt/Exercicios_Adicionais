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


    public static void strB_ocurrences_in_strA(String A, String B) {
        int count = ( B.split(A, -1).length ) - 1;
        System.out.println("Frase: " + B);
        System.out.println("A palavra " + A + " ocorre " + count + " vezes na string acima");
    }

    public static void triplas_sum(int[] nums, int sum ){
        for (int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for( int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == sum) {
                        System.out.print("( " + nums[i] + ", " + nums[j] + ", " + nums[k] + " )");
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        Teste_Elevador();
        //Número fornecido 7: PHPPHPPHPPHPPHPPHPPHP
        String_Rep("PHP", 7);
        //A palavra aa ocorre 3 vezes na string acima
        strB_ocurrences_in_strA("aa", "abcd abc aabc baa abcaa");
        //as triplas somadas devem resultar na soma
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        triplas_sum(nums, 7);
    }

}


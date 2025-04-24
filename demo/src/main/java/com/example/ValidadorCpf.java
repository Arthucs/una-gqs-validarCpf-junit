package com.example;
import java.util.Scanner;

public class ValidadorCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu CPF");
        String cpf = sc.nextLine();

        if (ValidaCpf(cpf)) {
            System.out.println("Bem vindo(a)!");
        }
        else {
            System.out.println("Tente novamente mais tarde.");
        }
    }

    public static boolean ValidaCpf(String cpf) {
        return cpf != null && cpf.length() == 11 && cpf.matches("\\d{11}");
    }
}
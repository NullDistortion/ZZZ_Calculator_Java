package dev.zzz.calculator.preview;

import dev.zzz.calculator.info.Character;

import java.util.Scanner;

public class Preview {
    static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
         Character character = new Character();
         System.out.println("personaje");
         character.setName(sc.nextLine());
         character.setAtack(sc.nextDouble());
         System.out.println(character.toString());
     }
}
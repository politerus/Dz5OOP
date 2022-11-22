package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        ArrayList friends = new ArrayList<>();
        int frends = 5;

        for (int i=0; i<frends;i++){
        System.out.println("Введите имена друзей еще " +(frends-i)+" раз");
        String name = input.nextLine();
        friends.add(name);


    }
        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
 }
}



/*Використовуючи Intelij IDEA, створити клас Friends.
За допомогою методів ArrayList додати масив імена друзів.
 Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
 */
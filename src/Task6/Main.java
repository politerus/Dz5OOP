package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Тамара Павловна");
        teachers.add("Людмила Степановна");
        teachers.add("Ольга Ивановна");
        teachers.add("Лариса Сергеевна");
        Collections.sort(teachers);
        String [] array = new String[teachers.size()];
        teachers.toArray(array);

        System.out.println("Мои учителя "+teachers);
        System.out.println("Индекс лучшего учителя : "+ Arrays.binarySearch(array,"Людмила Степановна"));
        System.out.println("Индекс худшего учителя : "+Arrays.binarySearch(array,"Ольга Ивановна"));
    }
}

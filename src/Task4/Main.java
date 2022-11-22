package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList listOfNumbers = new ArrayList(Collections.nCopies(10, 1));
        System.out.println(listOfNumbers);
        Iterator iterator = listOfNumbers.iterator();

        for (int i = 0; iterator.hasNext();iterator.next(), i++) {
            int counter= (int) listOfNumbers.get(i);
            listOfNumbers.set(i,++counter);
        }
        System.out.println(listOfNumbers);
    }
}

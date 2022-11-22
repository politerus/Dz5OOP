package Task3;

import Task2.Zoo;

import java.util.ArrayList;

public class Delete  {
    public static void main(String[] args) {
        Zoo.main(args);
        System.out.println("Длина Начального масива  "+Zoo.zooMass.size());
        System.out.println(Zoo.zooMass);
        ArrayList temp1 = new ArrayList (Zoo.zooMass.subList(0,Zoo.zooMass.size()-3));
        System.out.println("Длина масива после скоращения трех животных : "+temp1.size());
        System.out.println(temp1);
        ArrayList temp2 = new ArrayList (Zoo.zooMass.subList(0,Zoo.zooMass.size()-5));
        System.out.println("Длина масива после скоращения пяти животных : "+temp2.size());
        System.out.println(temp2);
        ArrayList temp3 = new ArrayList (Zoo.zooMass.subList(0,Zoo.zooMass.size()-7));
        System.out.println("Длина масива после скоращения семи животных : "+temp3.size());
        System.out.println(temp3);


    }
}

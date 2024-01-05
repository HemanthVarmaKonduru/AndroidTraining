package CollectionsPractice;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<String>() ;
        Names.add("Hemanth");
        Names.add("Mahesh");
        Names.add("Shanmukh");
        Names.add("Pradeep");
        System.out.println(Names);
        for (int i=0; i< Names.size();i++){
            System.out.println(Names.get(i));
        }
        Names.add("Kranthi");
        System.out.println(Names);
        Names.remove("Hemanth");
        System.out.println(Names);
        Names.add(0,"Hemanth");
        System.out.println(Names);
        System.out.println(Names.contains("Mahesh"));


    }
}

package CollectionsPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExamples {
    public static void main(String[] args) {
        HashSet<String> Dishes = new HashSet<String>();
        Dishes.add("Biryai");
        Dishes.add("Paneer");
        Dishes.add("Dosa");
        Dishes.add("Idli");
        Dishes.add("Rasmalai");
        Dishes.add("Punugulu");
        for (String Items: Dishes ){
            System.out.println(Items);
        }
        Dishes.remove("Punugulu");
        System.out.println(Dishes);
        Iterator<String> Items1 = Dishes.iterator();
        while (Items1.hasNext()){
            System.out.println(Items1.next());
        }
    }
}

//Set: Collection of unique values, meaning it does not allow duplicates
//Treeset: Will sort the elements
//in a set it is mot indexed so a .get method wiil not work here


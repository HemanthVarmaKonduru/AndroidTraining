package CollectionsPractice;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> Restaurants = new LinkedList<String>();
        Restaurants.add("Hyderabadi house");
        Restaurants.add("Bawarchi");
        Restaurants.add("AnTeRa");
        Restaurants.add("Nawab's");
        Restaurants.add("Mehfil");
        for (int i=0;i< Restaurants.size();i++){
            System.out.println(Restaurants.get(i));
        }
        Restaurants.addFirst("Meridian");
        Restaurants.addLast("Alpha Cafe");
        System.out.println(Restaurants);
        Restaurants.removeLast();
        System.out.println(Restaurants);
        Restaurants.pop();
//        Here Pop is following in LIFO order
        System.out.println(Restaurants);

    }
}

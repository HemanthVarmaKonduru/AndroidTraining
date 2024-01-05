package CollectionsPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<String,String> Hotels = new HashMap<String, String>();
        Hotels.put("Meridian", "Kukatpally");
        Hotels.put("Bawarchi", "Crossroads");
        Hotels.put("Mehfil", "Dilshuknagar");
        Hotels.put("Nawab", "Ameerpet");
        Hotels.put("Nayab", "Charminar");
        System.out.println(Hotels);
        for (String key: Hotels.keySet()){
            System.out.println(key + " "+ Hotels.get(key));
        }
        for (Map.Entry hotels: Hotels.entrySet()){
            System.out.println(hotels.getKey()+ " "+ hotels.getValue());
        }
        System.out.println(Hotels.keySet());
        System.out.println(Hotels.values());
//        Hashmap does not guarantee the order of elements and using LinkedHashmap we can get the order
        HashMap<String,String> Hotels1 = new LinkedHashMap<String, String>();
        Hotels1.put("Meridian", "Kukatpally");
        Hotels1.put("Bawarchi", "Crossroads");
        Hotels1.put("Mehfil", "Dilshuknagar");
        Hotels1.put("Nawab", "Ameerpet");
        Hotels1.put("Nayab", "Charminar");
        System.out.println(Hotels1);
        for (String key: Hotels1.keySet()){
            System.out.println(key + " "+ Hotels1.get(key));
        }
        for (Map.Entry hotels1: Hotels1.entrySet()){
            System.out.println(hotels1.getKey()+ " "+ hotels1.getValue());
        }
        System.out.println(Hotels1.keySet());
        System.out.println(Hotels1.values());

    }
}

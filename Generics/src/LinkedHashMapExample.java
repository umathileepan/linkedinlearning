import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args){
        //Linked Has Map will display in insertion order but if you would like to see in access order
        //then need to give 3 arguments in the following constructor and 3rd argument must be true
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>();
        phonebook.put("Uma" , 678678);
        phonebook.put("Thileepan", 989867);
        phonebook.put("Emma", 567845);
        phonebook.put("Uma", 934593);
        phonebook.put(null, 000);
        System.out.println(phonebook);

        for(Map.Entry<String,Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

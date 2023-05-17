import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args){

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Uma" , 678678);
        phonebook.put("Thileepan", 989867);
        phonebook.put("Emma", 567845);
        phonebook.put("Uma", 934593);
        phonebook.put(null, 000);
        System.out.println(phonebook);

        if(phonebook.containsKey("Thileepan")){
            phonebook.remove("Thileepan");
        }
        System.out.println(phonebook);
        //phonebook.clear();
        System.out.println("Uma's number: " + phonebook.get("Uma"));

        System.out.println("\nList of contacts in phonebook: ");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

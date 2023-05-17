import java.util.HashMap;

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
    }
}

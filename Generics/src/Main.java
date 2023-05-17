import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        static Character[] charArray = {'h','e','l','l','o'};
        static Integer[] intArray = {1,2,3,4,5};
        static Boolean[] boolArray = {true,false,true};
        public static <T> List<T> arrayToList(T[] array, List<T> list){
            for(T object: array){
                list.add(object);
            }
            return list;
        }

    private static void printShoppingList(String... items){
        System.out.println("SHOPPING LIST");
        for(int i = 0; i < items.length; i++) {
            System.out.println(i + 1  + ". " + items[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        //Linked List Example
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Cat");
        myList.add("Dog");
        myList.add(1,"Pig");
        System.out.println(myList);
        myList.remove("Dog");
        System.out.println(myList);

        //Varargs Practise
        String item1 = "Apple";
        String item2 = "Banana";
        String item3 = "Pears";
        String[] shopping = {"Bread","Milk","Butter","Eggs"};
        printShoppingList("Bread","Milk","Butter","Eggs","No need to create an array to pass","You can pass directly","Varargs can handle no item, one item or many items");
        Varargs.printShoppingList(item1,item2);
        Varargs.printShoppingList(shopping);
        //Without Generics: every element needed to be cast.
        List names = new ArrayList<>();
        names.add("Uma");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);


        //With Generics: no need to cast
        List<String> names2 = new ArrayList();
        names2.add("Thileepan");
        String name2 = names2.get(0);
        System.out.println("Last name: " + name2);

        List<Character> charList =  arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());

        System.out.println(charList);
        System.out.println(intList);
        System.out.println(boolList);
    }
}
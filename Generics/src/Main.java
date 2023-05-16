import java.util.ArrayList;
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

    public static void main(String[] args) {
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
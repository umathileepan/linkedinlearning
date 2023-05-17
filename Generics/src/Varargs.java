import java.sql.SQLOutput;

public class Varargs {
    public static void printShoppingList(String string1,String string2){
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
        System.out.println();
    }

    public static void printShoppingList(String string1,String string2,String string3){
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
        System.out.println("3. " + string3);
        System.out.println();
    }

    public static void printShoppingList(String[] items){
        System.out.println("SHOPPING LIST");
        for(int i = 0; i < items.length; i++) {
            System.out.println(i + 1  + ". " + items[i]);
        }
        System.out.println();
    }
}

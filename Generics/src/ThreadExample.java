import java.sql.SQLOutput;

public class ThreadExample extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println(i + ") " + this.getName());
            i++;
        }
    }
}

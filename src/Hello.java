import java.time.*;
import java.time.format.DateTimeFormatter;

public class Hello{

    LocalTime time = LocalTime.now();

    void greeting(){
        if(time.getHour() < 12){
            System.out.println("Good Morning");
        }else if(time.getHour() >=12 && time.getHour() < 18){
            System.out.println("Good Afternoon. Just ate an apple.");
        }else{
            System.out.println("Good Evening. Let's do some shopping");
        }
    }

    public static void main(String[] args){

        Hello hello = new Hello();
        hello.greeting();
    }
}
package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate a;
        a = LocalDate.of(2000,10,10);
        System.out.println(new Person("Paolo",a));
    }
    
}

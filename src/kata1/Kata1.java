package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate a = LocalDate.of(1999,8,10);
        System.out.println(new Person("Paolo",a));
    }
    
}

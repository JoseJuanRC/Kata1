package kata1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Person {
    
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Period period = Period.between(birthday,LocalDate.now());
        return period.getYears();
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + ",age="+ getAge()+ '}';
    }
    
}

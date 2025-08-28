import java.util.Objects;
import java.time.LocalDate;

public class Person {
    private int age;
    private String name;
    private LocalDate date;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
        this.date = LocalDate.now();
    }

    // no arg constructor needed by jackson in order to create an empty object
    public Person() {
        this.name = "default";
        this.age = 0;
        this.date = LocalDate.now();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        String d = "" + this.date;
        return d;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }



}


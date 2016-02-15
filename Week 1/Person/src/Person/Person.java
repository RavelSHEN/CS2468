package Person;
import java.util.Scanner;

/**
 * Created by RavelShen on 18/1/2016.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(){
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        return "Person(" + "Name: " + name + ", age: " + age + ", gender: " + gender + ")";
    }

    public static void main(String[] args){
        Person fred = new Person("Fred", 20, "Male");
        System.out.println(fred.toString());
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the person1's (Name, age, gender(Male/Female):)");
        Person p1 = new Person();
        p1.setName(sc.next());
        p1.setAge(sc.nextInt());
        p1.setGender(sc.next());
        System.out.println("Person1:" + p1.toString());
        System.out.println();

        System.out.println("Please input the person2's (Name, age, gender(Male/Female):)");
        Person p2 = new Person();
        p2.setName(sc.next());
        p2.setAge(sc.nextInt());
        p2.setGender(sc.next());
        System.out.println("Person2:" + p2.toString());
        System.out.println();

        System.out.println("We set person2=person1");
        p2 = p1;
        System.out.println("Person1:" + p1.toString());
        System.out.println("Person2:" + p2.toString());
    }
}

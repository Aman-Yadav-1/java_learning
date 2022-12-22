// Constructor & Usage of this keyword
package DS.OOPS;

public class construct {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] says hi");
        }

        // if we forget to add constructor, java provides our class a default constructor

        Person(){
            //constructor
        }
        Person(int age,String name){
            // parameterized constructor
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String [] args){
        Person p1 = new Person(10, "A");
        p1.saysHi();
    }
}


/*  Stages :- 
    1. Space Allocation
    2. Parsing
    3. Constructor
        : same name as function
        : new is used, constructor sets properties
        : Default constructor is there if no constructor given
 */
package PepCoding.OOPS;

public class noswap {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] says hi");
        }
    }
    public static void main(String [] args){
        
        // a new object has been created as p1

        Person p1 = new Person();
        p1.age = 10;
        p1.name= "A";
        // p1.saysHi();

        //another object is created as p2

        Person p2 = new Person();
        p2.age= 20;
        p2.name = "B";
        // p2.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap1(p1,p2);
        p1.saysHi();
        p2.saysHi();
    }
    public static void swap1(Person psn1,Person psn2){
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }
}

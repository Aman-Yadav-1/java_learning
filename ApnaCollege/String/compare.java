package ApnaCollege.String;

//we use compareTo coz when == is used there are times, 
// when == fails a lot of test_cases

public class compare {
    public static void main(String [] args){
        String name = "tony";
        String name2 = "tony";

        // 1. s1>s2 : +ve value
        // 2. s1=s2 : 0
        // 3. s1<s2 : -ve value

        if(name.compareTo(name2)==0){ 
            System.out.println("Equal to each other");
        }
        else{
            System.out.println("Not equal");
        }

    }
}

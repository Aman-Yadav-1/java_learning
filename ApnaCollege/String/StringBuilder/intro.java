package ApnaCollege.String.StringBuilder;

public class intro {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("tuny");
        System.out.println(sb);
        
        sb.setCharAt(0,'s'); //replace character at 0 index with given new char
        System.out.println(sb);

        sb.insert(2,'n'); // inset new value at index 2
        System.out.println(sb);

        sb.delete(2,3); // deletes from index:2 to 3
        System.out.println(sb);

        sb.append("deol"); //adds at last
        System.out.println(sb);
        
        System.out.println(sb.length());
    }
}

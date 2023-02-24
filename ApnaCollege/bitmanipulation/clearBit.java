package ApnaCollege.bitmanipulation;

public class clearBit {
    public static void main(String [] args){
        int n = 5;
        int i = 2;
        int bm = 1<<i;

        bm=~bm;
        int newNum = bm & n;
        System.out.println(newNum);
    }
}

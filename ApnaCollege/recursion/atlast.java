package ApnaCollege.recursion;
//move elements to last of string

public class atlast {
    public static void moveAll(String str, int idx, int count, String new_str){
        if(idx == str.length()){
            for(int i = 0;i < count;i++){
                new_str += 'x';
            }
            System.out.println(new_str);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAll(str, idx+1, count, new_str);
        }
        else{
            new_str += currChar;
            moveAll(str, idx+1, count, new_str);
        }
    }
    public static void main(String [] args){
        String str = "axbcxxd";
        moveAll(str, 0, 0, "");
    }
}

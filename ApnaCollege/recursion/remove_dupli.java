package ApnaCollege.recursion;

public class remove_dupli {
    public static boolean [] map = new boolean[26];

    public static void removeDupli(String str, int idx, String new_str){
        if(idx == str.length()){
            System.out.println(new_str);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDupli(str, idx+1, new_str);
        }
        else{
            new_str += currChar;
            map[currChar - 'a'] = true;
            removeDupli(str, idx+1, new_str);
        }
    }
    public static void main(String [] args){
        String str = "abbccdda";
        removeDupli(str, 0, "");
    }
}

package gfg_java.Arrays.Problems;

public class vowel_consonant {
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        for(int i=0;i<s.length();i++){
        int ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else if(ch>='a'&& ch<='z'){
                c++;
            }
        }
        if(v>c){
            System.out.print("Yes");
        }
        else if(c>v){
            System.out.print("No");
        }
        else{
            System.out.print("Same");
        }
        
        System.out.println();
    }
}

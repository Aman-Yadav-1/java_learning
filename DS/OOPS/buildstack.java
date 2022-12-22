// building a normal stack using OOPs concepts
package DS.OOPS;

public class buildstack {
    public static class customStack{
        int [] data;
        int tos;
        public customStack(int cap){
            data = new int[cap];
            tos = -1;
        }
        int size(){
            return tos+1;
        }
        void display(){
            for(int i = tos;i >= 0;i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        void push(int val){
            if(tos == data.length - 1){
                System.out.println("Stack Overflow");
            }
            else{
                tos++;
                data[tos] = val;
            }
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                int val = data[tos];
                tos--;
                return val;
            }
        }
        int top(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return data[tos];
            }
        }
    }
}
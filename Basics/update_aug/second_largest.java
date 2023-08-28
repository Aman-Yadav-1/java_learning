public class second_largest {
    public static void main(String [] args){
        int arr[] = { 100, 96, 69, 88, 77, 22, 10, 19};
        int largest = 0;
        int second_largest = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest){
                second_largest = arr[i];
            }
        }
        System.out.println("\nlargest is: " + largest);
        System.out.println("second largest is: " + second_largest);
    }
}

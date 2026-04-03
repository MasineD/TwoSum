import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] data = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        twoSum(data, target);
    }

    public static void twoSum(int [] data, int target){
        if(data.length<2 || data.length> 10000){
            System.out.println("Length of "+data.length+" is out of range");
            return;
        }
        if(target < -1000000000 || target > 1000000000){
            System.out.println("Target "+target+" is out of range");
            return;
        }
        for(int i = 0; i<data.length-1;i++){
            for(int j = i + 1;j < data.length;j++){
                if(data[i] < -1000000000 || data[i] > 1000000000){
                    System.out.println("Element "+data[i]+" is out of range");
                    return;
                }
                else if((data[i] + data[j]) == target){
                    System.out.println("["+i+","+j+"]");
                    return;
                }
            }
        }
        System.out.println("No two elements sum up to the target.");
    }
}
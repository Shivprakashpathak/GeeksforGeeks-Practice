import java.util.Scanner;
class Solution {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[]=new int[size];
        
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int missing = missingNum(arr);
        System.out.print(missing);
    }

    public static int missingNum(int arr[]) {
        int n = arr.length + 1;
        long totaSum =(long) n*(n+1)/2;
        long arraySum=0;
        for(int i =0;i<arr.length;i++){
            arraySum+=arr[i];
            
        }
        return (int)(totaSum - arraySum);
        
    }
}

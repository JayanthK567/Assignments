import java.util.Arrays;
public class Padovan {
    public static void main(String[] args){
        int n = 10;
        long[] arr = new long[n+1];
        for(int i=0; i<=n;i++){
            if(i<=2){
                arr[i] = 1;
            } else {
                arr[i] = arr[i-2] + arr[i-3];
            }
        }
        System.out.println(Arrays.toString(arr));
    }    
}

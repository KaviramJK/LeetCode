package Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr={9};
        int len=arr.length;
        int carry=1;
        for(int i=len-1;i>=0;i--){
            if(arr[i]+carry>9){
                arr[i]=0;
                carry=1;
            }
            else{
                arr[i]=arr[i]+carry;
                carry=0;
                break;
            }
        }
        if(carry==1){
            arr=new int[arr.length+1];
            arr[0]=1;
        }

    }
}

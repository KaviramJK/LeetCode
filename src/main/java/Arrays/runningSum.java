package Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(runningSum(arr));
    }

    public static int[] runningSum(int arr[]){
        int res[]=new int[arr.length];
//        if(arr.length==1){
//            return arr;
//        }
        res[0]=arr[0];
        for(int i=1;i< res.length;i++){
               res[i]=res[i-1]+arr[i];
        }
        return res;
    }
}

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {

    public static void main(String[] args) {
        int numRowa=1;
        System.out.println(pascal(numRowa));
    }

    public static List<Integer> pascal(int numRows){
       List<List<Integer>> res=new ArrayList<List<Integer>>(numRows);
       for(int i=1;i<=numRows+1;i++){
           List<Integer> row=new ArrayList<>();
           for(int j=0;j<i;j++){
               if(j==0||j==i-1){  //1==3-1 1=2
                   row.add(1);
               }else{
                   row.add(res.get(i-2).get(j-1)+res.get(i-2).get(j));
               }

           }

          res.add(row) ;
       }
       return res.get(numRows);
    }


}

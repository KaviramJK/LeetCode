package Arrays;

public class maxProfit {
    public static void main(String[] args) {
        int[] prices={2,4,1};
        System.out.println(profit(prices));
        int max=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        System.out.println(max);
    }
    public static int profit(int prices[]){
        int sum = 0;
        int j = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[j] && prices[i]-prices[j]>sum){
                sum = prices[i] - prices[j];
            }else if(prices[i] < prices[j])
                j=i;
        }

        return sum;
    }
}

package collect;

public class Stocks {
	public static void main(String[] args) {
      int[] array = {100, 180, 260, 310, 40, 535, 695};
      
      int maxprofit = Integer.MIN_VALUE;
      int mintobuy = Integer.MAX_VALUE;
      
      for(int i=0;i<array.length;i++) {
    	 if(array[i] < mintobuy ) {
    		 mintobuy = array[i];
    	 }
    	 else {
    		 maxprofit = Math.max(maxprofit, array[i]- mintobuy);
    	 }
      }
      System.out.println(maxprofit + " " + mintobuy);
	}
}

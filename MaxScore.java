package LiKou;

public class MaxScore {
    public static void main(String[] args) {

    }
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int sum1 = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < cardPoints.length;i++){
            if(i >= cardPoints.length-k){
                sum += cardPoints[i];
            }
            else{
                sum += cardPoints[i];
                sum1 += cardPoints[i];
            }
        }
        max= Math.max(max,sum-sum1);
        for(int i = cardPoints.length-k;i < cardPoints.length;i++){
            sum1 = sum1 + cardPoints[i] - cardPoints[i-cardPoints.length+k];
            max = Math.max(max,sum-sum1);
        }
        return max;
    }
}

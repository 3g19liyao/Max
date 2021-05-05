package LiKou;


public class KthGrammar {
    public static void main(String[] args) {
        System.out.print(digui(3,4));

    }
    //public static int kthGrammar(int N, int K) {
        //5,0,4
       // digui(N,K%2,K);
    //}
    public static int digui(int N,int K){

        String arr = "abc";
        char a = 'a';
        boolean contains = arr.contains(String.valueOf(a));
        System.out.print(arr.indexOf(String.valueOf(a)));
        System.out.print(contains);
        if(N == 1){
            return 0;
        }
        int num = digui(--N,(K+1)/2);
        if(K%2 == 1){
            if(num == 0){
                return 0;
            }else{
                return 1;
            }

        }else{
            if(num == 0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

}

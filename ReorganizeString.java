package LiKou;

public class ReorganizeString {
    public static void main(String[] args) {

        System.out.println(reorganizeString(""));
    }

    public static String reorganizeString(String S) {
        char[] chars = S.toCharArray();
        int[] arr = new int[26];
        for(int i = 0;i < chars.length;i++){
            char a = chars[i];
            arr[a - 'a']++;
        }
        int max = 0,maxIndex = 0;
        for(int i = 0;i < 26;i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        if(max > (S.length()+1)/2){
            return "";
        }
        char[] res = new char[S.length()];
        int index = 0;
        while(arr[maxIndex]-- > 0){
            res[index] = (char) (maxIndex+'a');
            index += 2;
        }
        for(int i = 0;i < 26;i++){
            while(arr[i]-- > 0){
                if(index >= S.length()){
                    index = 1;
                }
                res[index] = (char) (i+'a');
                index += 2;
            }
        }
        return String.valueOf(res);
    }

}

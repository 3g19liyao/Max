package LiKou;

import java.util.*;

public class FindLeastNumOfUniqueInts {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr,3));
    }
    public static int findLeastNumOfUniqueInts (int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int res = 0;
        int num = 0;
        for(int i : arr){
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else{
                map.put(i,1);
            }
        }
        for(Integer key :map.keySet()){
            num++;
            int value = map.get(key);
            list.add(value);
        }
        Collections.sort(list);
        for(Integer v : list){
            if(k>=v){
                res++;
                k -= v;
            }else {
                return list.size()-res;
            }
        }
        return list.size()-res;
    }
}

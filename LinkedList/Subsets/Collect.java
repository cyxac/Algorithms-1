import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Collect {
    public static List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        List<Integer> first = new LinkedList<Integer>();
        list.add(first);
        for(int i: S){
            int size = list.size();
            for(int j=0;j<size;j++){
                List<Integer> temp = new LinkedList<Integer>();
                for(int k:list.get(j)){
                    temp.add(k);
                }
                temp.add(i);
                list.add(temp);
                //System.out.println("size"+size+" j"+j);
            }
            //System.out.println(i);
        }
        return list;
    }
    public static void main(String[] args){
        int[] array = {7,2,2,4,5,6,7,9,0,1};
        List<List<Integer>> list = subsets(array);
        for(List<Integer> i : list){
            for(Integer x: i){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}

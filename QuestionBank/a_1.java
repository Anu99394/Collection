//1_a• An array is given with 1 and -1, 1 means adding one step above g
//        round level and -1 means reducing one step. We have to tell if
//        we are above or below ground level at any time t. ground level is zero.

package QuestionBank;
import java.util.*;

public class a_1 {
    public static void main(String[] args) {
        int arr[]={1,-1,1,-1,-1,-1,1,1,1,1};
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            map.put(i,sum);
        }

        for(Integer key:map.keySet())
            System.out.println(key+" "+map.get(key));
    }
}

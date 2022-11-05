
//  10 elemanlı tam sayı dizisini ArrayList<Integer> sayilar, listine çeviren java kodunu yazınız.

import java.util.Arrays;
import java.util.ArrayList;

public class arrayListExample {
   
    public static void main(String[] args)
    {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7 ,8 ,9};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
  
        for (int i = 0; i < arr.length; i++){
            arrayList.add(arr[i]);
        }

        System.out.print(arrayList);
    }
}

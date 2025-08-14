import java.util.ArrayList;
//import java.util.*;

public class ArrayListBasics {
    public static void swapNum(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    //Brute force approach---
    public static int containerWithMostWater(ArrayList<Integer> height){     
        int maxWater = 0;
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater= ht * width;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }
    //2 pointer Approach---------
    public static int CWMW(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0, rp =height.size()-1;
        while(lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);

            // if(height.get(lp) < height.get(rp)){
            //     lp++;
            // } else{
            //     rp--;
            // }
            ht =  height.get(lp) < height.get(rp) ? lp++ : rp--;// Just another way of if else 😅
        }
        return maxWater;
    }
    public static boolean  pairSum(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp +1;
        int rp = bp;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%list.size();
            }else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Float> list3 = new ArrayList<>();
        //ArrayList<Boolean> list4 = new ArrayList<>();

        //Add operation 
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(1, 10);
        /* 
        System.out.println(list1);

        // Get operation
        list2.add("sanoj");
        list2.add("Lalmani");
        list2.add("Anil");

        System.out.println(list2.get(1));
    
        //Remove operation
        list1.remove(1);
        System.out.println(list1);
        
        //Set operation
        list1.set(2, 11);
        System.out.println(list1);

        //Contains operation;
        System.out.println(list1.contains(6));
        System.out.println(list2.contains("sanoj"));

        System.out.println(list1.size());
        for(int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i));
        }
        */
        // for(int i = list1.size()-1; i >= 0; i--){
        //     System.out.print(list1.get(i)+" ");
        // }
        //--------------Maximum -------------------------------
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i< list1.size(); i++){
        //     // if( max < list1.get(i)){
        //     //     max = list1.get(i);
        //     // }
        //     max = Math.max(list1.get(i), max);
        // }
        // System.out.println("Maximum number of the list is :" +max);
       
        //---------Sorting using predefined function --------------
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(4);
        // list.add(6);
        // list.add(3);

        // Collections.sort(list);//Ascending order..BY DEFAULT
        // System.out.println(list);

        // Collections.sort(list, Collections.reverseOrder());//Descending order..
        // System.out.println(list);
        
        //----------------Swap element---------------------------------

        // int idx1 = 1, idx2 = 2;
        // System.out.println(list);
        // swapNum(list, idx1, idx2);
        // System.out.println(list);
        //--------------Multi dimensional ArryList------------------------

        // ArrayList<ArrayList> mainList = new ArrayList<>();//Here the inner Arraylist can be any type ..

        // ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();//Here the inner ArrayList should be only in integer type..
        // ArrayList<Integer> list1 = new ArrayList<>();

        // list1.add(1);          list1.add(4);
        // list1.add(2);          list1.add(3);
        // mainList2.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(1);          list2.add(3);
        // list2.add(2);          list2.add(4);
        // mainList2.add(list2);

        // System.out.println(mainList2);

        // ArrayList<String> list3 = new ArrayList<>();
        // list3.add("Gym");          list3.add("Saonj");
        // list3.add("Neet");          list3.add("Lalmani");
        // mainList.add(list3);
        // mainList.add(list2);
        // mainList.add(list1);

        // System.out.println(mainList);

        //---------NEsted loop for multiDimensional -----------------
        // for(int i = 0; i < mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j = 0; j < currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        //-----------Container with most water --------------------
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
      
        // //System.out.println(containerWithMostWater(height));
        // System.out.println(CWMW(height));
    
        //-----------pair sum ----------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(pairSum(list, 16));
      
    }
}

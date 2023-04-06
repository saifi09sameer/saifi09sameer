package com.example.C12Sprint5MC1.service;

import java.util.HashMap;
import java.util.Map;

public class FindIndexNew {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,20,1,32,42,55,99,22,11,33,44,10,32,76,89,64,5,3,9,65,23,98,9,5,99};
        int target = 149;
        Map<String,Integer> value = getValues(arr,target);

        for (Map.Entry<String,Integer> OneValue:value.entrySet()) {
            System.out.println(OneValue.getKey()+" "+OneValue.getValue());
        }

    }
    public static Map<String ,Integer> getValues(int arr[],int target){
        Map<String,Integer> map = new HashMap<>();
        for (int index = 0; index < arr.length; index++) {
            for (int index1 = index+1; index1<arr.length; index1++){
                if ((arr[index]+arr[index1])==target){
                    String key = ""+index+" + "+index1+" = ";
                    map.put(key,target);
                }
            }
        }
        return map;
    }

}

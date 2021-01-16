package com.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        Iterator<Integer> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            int key = keys.next();
            if(map.get(key)== 1) {
                result = key;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int num [] = {4,1,2,1,2};
        int a = singleNumber(num);

        System.out.println(a);

    }

}



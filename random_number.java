package com.glc;

import java.util.HashSet;
import java.util.Random;

public class random_number{
    public static void main(String[] args) {
        Random random = new Random();
        Object[] values = new Object[20];
        HashSet<Integer> hashSet = new HashSet<Integer>();
        
        // 生成随机数字并存入HashSet
        while(hashSet.size() < values.length){
            hashSet.add(random.nextInt(100) + 1);
        }
        
        values = hashSet.toArray();
        
        // 遍历数组并打印数据
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
    }
}
package com.glc;

import java.util.Random;

public class random_number2 {
    public static void main(String[] args) {
        int values[] = new int[100];   
        int temp1,temp2,temp3;   
        Random r = new Random();   
        
        for(int i = 0;i < values.length;i++){
            values[i] = i + 1;
        }
        
        //随机交换values.length次   
        for(int i = 0;i < values.length;i++){   
            temp1 = Math.abs(r.nextInt()) % (values.length-1); //随机产生一个位置   
            temp2 = Math.abs(r.nextInt()) % (values.length-1); //随机产生另一个位置   
            
            if(temp1 != temp2){
                temp3 = values[temp1];   
                values[temp1] = values[temp2];   
                values[temp2] = temp3;
            } 
        }   
        
        // 遍历数组并打印数据
        for(int i = 0;i < 100;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
    }
}
package com.glc;

import java.util.ArrayList;
import java.util.Random;

public class random_number_arraylist {
    public static void main(String[] args) {
        Object[] values = new Object[20];
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < values.length;i++){
            int number = random.nextInt(100) + 1;
            
            if(!list.contains(number)){
                list.add(number);
            }
        }
        
        values = list.toArray();
        
        // �������鲢��ӡ����
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
    }
}
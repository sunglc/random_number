package com.glc;

import java.util.Random;

/**
 * ʹ������ʵ��
 */
public class random_number_array {
    public static void main(String[] args) {
        int[] values = new int[20];
        Random random = new Random();
        
        for(int i = 0;i < values.length;i++){
            int number = random.nextInt(100) + 1;
            
            for(int j = 0;j <= i;j++){
                if(number != values[j]){
                    values[i]=number;
                }                              
            }
        }
        
        // �������鲢��ӡ����
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
    }
}

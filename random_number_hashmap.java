package com.glc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Map.Entry;

public class random_number_hashmap {
    public static void main(String[] args) {
        int n = 0;
        Object[] values = new Object[20];
        
        Random random = new Random();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        
        // ����������ֲ�����HashMap
        for(int i = 0;i < values.length;i++){
            int number = random.nextInt(100) + 1;
            hashMap.put(number, i);
        }
        
        // ��HashMap��������
        values = hashMap.keySet().toArray();
        
        // �������鲢��ӡ����
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
        
//        Iterator iter = hashMap.entrySet().iterator();
//        // ����HashMap
//        while (iter.hasNext()) {
//            Entry<Integer, Integer> entry = (Entry)iter.next();
//            int key = entry.getKey();
//            n++;
//            
//            System.out.print(key + "\t");
//            
//            if(n % 10 == 0){
//                System.out.println("\n");
//            }
//        }
    }
}
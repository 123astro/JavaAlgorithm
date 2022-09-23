package com.benjamin;

import java.util.ArrayList;
import java.util.List;

public class FlippingBits {

    public static void flippingBits(long n) {
        String binary = Long.toBinaryString(n);
        String padding = String.format("%32s", binary).replace(' ', '0');
        System.out.println(padding);
        List<Character> biNumList = new ArrayList<>();
        for (char ch: padding.toCharArray()) {
            biNumList.add(ch);
        }
        System.out.println(biNumList);
        for(int i = 0; i < biNumList.size(); i++){
            if(biNumList.get(i) == '0')
                biNumList.set(i, '1');
            else{
                biNumList.set(i, '0');
            }
        }
        System.out.println(biNumList);
        StringBuilder sb = new StringBuilder();
        for (Character ch : biNumList){
            sb.append(ch);
        }
        System.out.println(sb);
        String sb2 = sb.toString();
        Long decimal = Long.parseLong(sb2, 2);
        System.out.println(decimal);
    }
}



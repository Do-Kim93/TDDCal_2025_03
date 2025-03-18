package org.example;

import java.util.Arrays;

//10 + 5 * 2 문제는 곱하기를 먼저 해야한다 그리고 더하기
//먼저 곱하고 그 곱한 값을 지역 변수에 저장해 놨다가 더하기 연사자랑 연산하기
public class Calc {
    public static int run(String exp) {
        boolean dd = exp.contains("*");
        exp = exp.replace("- ", "+ -");
        String[] bits;
        if (dd) {
            bits = exp.split(" \\* ");
            System.out.println(Arrays.toString(bits));
            int[] nums = new int[bits.length];
            int sum = 1;
            for (int i = 0; i < bits.length; i++) {
                String l = bits[i];
                try {
                    nums[i] = Integer.parseInt(bits[i]);
                    sum *= nums[i];
                    System.out.println(sum);
                }catch(NumberFormatException e){
//                    boolean ab = l.contains("+");
                    bits = exp.split(" \\+ ");
                    int[] nums1 = new int[bits.length];
                    for (int k = 0; k < bits.length; k++) {
                        nums1[k] = Integer.parseInt(bits[k]);
                        sum += nums1[k];
                    }
            }
            }
            return sum;
        } else {
            bits = exp.split(" \\+ ");
            int[] nums = new int[bits.length];
            int sum = 0;
            for (int i = 0; i < bits.length; i++) {
                nums[i] = Integer.parseInt(bits[i]);
                sum += nums[i];
            }
            return sum;

        }

//       throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
    }
}


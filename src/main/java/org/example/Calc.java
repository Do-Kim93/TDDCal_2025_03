package org.example;

public class Calc {
    //필요없는 코드 싹다 제거
    public static int run(String exp) {
        boolean dd = exp.contains("*");
        exp = exp.replace("- ", "+ -");
        String[] bits;
        if (dd) {
            bits = exp.split(" \\* ");
            int[] nums = new int[bits.length];
            int sum = 1;
            for (int i = 0; i < bits.length; i++) {
                nums[i] = Integer.parseInt(bits[i]);
                sum *= nums[i];
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


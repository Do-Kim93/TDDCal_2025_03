package org.example;

public class Calc {
    public static int run(String exp){

//        String[] bits = exp.split(" \\+ ");//그냥 더하기만 하는 코드


//        int a = Integer.parseInt(bits[0]);
//        int b = Integer.parseInt(bits[1]);

//        return a+b;
        String[] bits = exp.split(" ");


        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[2]);
        if(bits[1].equals("+")){
            return a+b;
        }else if(bits[1].equals("-")){
            return a-b;
        }
        throw new RuntimeException("Error : 해석불가한 값이 들어왔습니다.");
    }
    static int run2(String exp){
        String[] bits = exp.split(" - ");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        return a-b;
    }
}


package com.example.homework11;

import java.util.Random;

public class Problem {

    public int result;
    private final Random random = new Random();
    public  int getRandom(int min, int max){
        return (int) (Math.random() * (max - min)) + min;
    }

    public int getResult() {
        return result;
    }

    public int getNoiseResult(){
        return result + getRandom(-4, 4);
    }
    public String getproblem(){
        int a = getRandom(-50, 50);
        int b = getRandom(0, 50);
        String sign = getRandomSign();
        if (sign.equals("+")) {
            result = a + b;
        }
        else if (sign.equals("-")){
            result = a - b;
        }
       else if (sign.equals("*")) {
           result = a * b;
        }
       else {
            result = a / b;
        }
        return a + sign + b;
    }

    private String getRandomSign(){
        int q =  getRandom(1, 5);
        if (q == 1) {
            return "+";
        }
        else if (q == 2) {
            return "-";
            }
        else if (q == 3)  return "*";
        else return "/";

    }
}

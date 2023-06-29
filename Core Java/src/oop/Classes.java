package oop;
class Compute{
    public int add(int... a){
        int sum = 0;
        for (int j : a){
            sum += j;
        }
        return sum;
    }

    public int mul(int... a){
        int sum = 1;
        for (int j : a){
            sum *= j;
        }
        return sum;
    }

    public float div(int numerator, int denominator){
        return numerator / (float)denominator;
    }

    public int sub(int... a){
        int sum = a[0]*2;
        for (int j : a){
            sum -= j;
        }
        return sum;
    }

    public int pow(int base, int exponent){
        int total = 1;
        for(int i=0; i<exponent; i++){
            total *= base;
        }
        return  total;
    }
}


public class Classes {
    public static void main(String[] args) {
        Compute obj = new Compute();

        int s1 = obj.add(10,20,30,40,50);
        System.out.println(s1);             // 150
        int s2 = obj.sub(50,10,5);
        System.out.println(s2);             // 35
        int s3 = obj.mul(10,10,5);
        System.out.println(s3);             // 500
        int s4 = obj.pow(3,3);
        System.out.println(s4);             // 27
        float ans = obj.div(10,3);
        System.out.println(ans);             // 3.3333333

    }
}

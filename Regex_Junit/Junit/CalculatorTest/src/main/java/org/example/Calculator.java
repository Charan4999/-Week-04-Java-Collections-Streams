package Junit;

public class Caluclator {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int mul(int a,int b) {
        return a*b;
    }
    public int div(int a,int b) {
        if(b==0) {
            System.out.print("Cannot divide with zero");
        }
        return a/b;
    }
}

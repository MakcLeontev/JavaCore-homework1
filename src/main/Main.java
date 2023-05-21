package main;
import otherclass.Firstclass;
import otherclass.Secondclass;
public class Main {
    public static void main(String[] args) {
        int result = Firstclass.add(2, 3);
        System.out.println(Secondclass.decorate(result));
        result = Firstclass.sub(2, 3);
        System.out.println(Secondclass.decorate(result));
        result = Firstclass.mul(2, 3);
        System.out.println(Secondclass.decorate(result));
        result = Firstclass.div(2, 3);
        System.out.println(Secondclass.decorate(result));



    }
}
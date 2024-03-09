package calculator;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("*",4,7));
        Foo foo = new Foo() {
            @Override
            public double plus(int a, int b) {
                return 0;
            }

            @Override
            public double minus(int a, int b) {
                return 0;
            }
        };
    }
}

class Calculator{
    Map<String, Calculate> map = new HashMap<>();

    public Calculator(){
        fill();
    }

    private void fill(){
        map.put("+", new Addition());
        map.put("-", (b) -> (b[0] - b[1]));
        map.put("*", (b) -> (b[0] * b[1]));
    }

    public double add (int a, int b){
        return a + b;
    }

    public double substract(int a, int b){
        return  a - b;
    }

    public double mult (int a, int b){
        return a * b;
    }

    public double calculate (String operator, int a, int b){
        return map.get(operator).calculate(a, b);
    }
}

class Addition implements Calculate {

    @Override
    public double calculate(double... args) {
        if (args.length < 2) {
            throw new RuntimeException("Мало");
        }
        return args[0] + args[1];
    }
}
interface Calculate{
    double calculate(double ... args);
}

interface Foo{
    double plus (int a, int b);
    double minus (int a, int b);
}
public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //Деление на 0, b = 0
        int c = calc.devide.apply(a, b);
        //C помощью тернарного оператора реализовал, что при делителе = 0 вернется 0.
        calc.println.accept(c);
    }
}

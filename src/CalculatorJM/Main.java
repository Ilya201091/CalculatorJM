package CalculatorJM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите формулу через пробел. Пример '2 + 2'");
        Scanner scr = new Scanner(System.in);

        String formula = scr.nextLine();
        Formula formula1 = new Formula(formula);
        LimitCalculator limitCalculator = new LimitCalculator(formula);
    }
10

}

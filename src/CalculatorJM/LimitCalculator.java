package CalculatorJM;

public class LimitCalculator {
    private int a;
    private int b;

    public LimitCalculator(String formula){
        String [] arr = formula.split(" ");
            try {
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[2]);
                if (a >= 1 && a <= 10 && b >= 1 && b <= 10){

                    if(arr[1].equals("+")){
                        System.out.println(a + b);
                    }
                    else if(arr[1].equals("-")){
                        System.out.println(a - b);
                    }
                    else if (arr[1].equals("/")){
                        double c = a;
                        double d = b;
                        System.out.println(c / d);
                    }
                    else if(arr[1].equals("*")){
                        System.out.println(a * b);
                    }

                }
                else {
                    System.out.println("Некорректные данные");
                }
            }
            catch (Exception exception){
                System.out.println("Некорректный формат");
            }



    }
}

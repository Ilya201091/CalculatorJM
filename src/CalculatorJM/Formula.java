package CalculatorJM;

public class Formula {
    private int a;
    private int b;

    public Formula(String formula){
        String [] arr = formula.split(" ");
        IsRoman theRoman = new IsRoman();
        boolean isRoman  = false;
        boolean isArabic = false;
        try {
            a = theRoman.romanToArabic(arr[0]);
            b = theRoman.romanToArabic(arr[2]);
            isRoman = true;
        }
        catch (NumberFormatException exception){
            try {
                a = Integer.parseInt(arr[0]);
                b = Integer.parseInt(arr[2]);
                isArabic = true;
            }
            catch (RuntimeException e){
                System.out.println("Неверный формат");;
            }

        }

        try {
            if (isArabic || isRoman){

                if(arr[1].equals("+")){
                    if(isRoman){
                        System.out.println(theRoman.romeResult(a + b));
                    }
                    else {
                        System.out.println(a + b);
                    }

                }
                else if (arr[1].equals("-")){
                    if(isRoman){
                        System.out.println(theRoman.romeResult(a - b));
                    }
                    else {
                        System.out.println(a - b);
                    }
                }
                else if(arr[1].equals("*")){
                    if(isRoman){
                        System.out.println(theRoman.romeResult(a * b));
                    }else {
                        System.out.println(a * b);
                    }

                }
                else if(arr[1].equals("/")){
                    if(isRoman){
                        System.out.println(theRoman.romeResult(a / b));
                    }
                    else {
                        System.out.println(a / b);
                    }
                }
                else {
                    System.out.println("Введен неизвестный символ");
                }
            }
        }
        catch (Exception e){
            System.out.println("Ошибка рассчета");
        }

    }
}

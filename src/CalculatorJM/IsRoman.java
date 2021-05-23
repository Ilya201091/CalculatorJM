package CalculatorJM;

import java.util.TreeMap;

public class IsRoman {

    private static final TreeMap<Integer, String> map = new TreeMap();

    private static char formatRoman(char a){
        switch (a){
            case 'М':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new NumberFormatException("Введен неверный формат");
        }
    }

    public int romanToArabic(String number){
        int result = 0;
        for (int i = 0; i < number.length() - 1; i++){
            if(formatRoman(number.charAt(i)) < formatRoman(number.charAt(i+1))){
                result -= formatRoman(number.charAt(i));
            }
            else {
                result += formatRoman(number.charAt(i));
            }
        }
        result += formatRoman(number.charAt(number.length() -1));
        return result;
    }

    public String romeResult(int result) {
        int temp = map.floorKey(result);
        if (temp == result) {
            return map.get(result);
        } else {
            String var = map.get(temp);
            return var + romeResult(result - temp);
        }
    }

        static {
            map.put(1000, "M");
            map.put(500, "D");
            map.put(100, "C");
            map.put(50, "L");
            map.put(10, "X");
            map.put(5, "V");
            map.put(1, "I");
            map.put(900, "CM");
            map.put(400, "CD");
            map.put(90, "XC");
            map.put(40, "XL");
            map.put(9, "IX");
            map.put(4, "IV");
        }
    }

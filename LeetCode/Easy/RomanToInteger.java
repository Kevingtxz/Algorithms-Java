public class RomanToInteger{
    private static int valueLetter(char roman){
        switch(roman) {
            case 'M':
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
                return -1;
        }
    }

    public static int romanToInt(String s) {
        int result = 0, last = 0;
        for(short i = (short) (s.length()-1); i > -1; i--){
            if(valueLetter(s.charAt(i))>=last)
                result += valueLetter(s.charAt(i));
            else
                result -= valueLetter(s.charAt(i));
            last = valueLetter(s.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }
}

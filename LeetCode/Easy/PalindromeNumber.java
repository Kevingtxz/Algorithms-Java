public class PalindromeNumber{    
    private static short countDigits(int x, short count) {
        if(x/10 > 0) {
            count++;
            return countDigits(x/10, count);
        }
        return count;
    }

    private static int elevation(int elevator, short count_index) {
        if(count_index != 0)
            return elevation(elevator*10, (short) (count_index-1));
        return elevator;    
    }

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        short count = countDigits(x, (short) 0);
        while(count>0){
            if(x%10!=x/elevation(10, (short) (count-1)))
                return false;
            x = x%elevation(10, (short) (count-1))/10;
            count-=2;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean result = isPalindrome(-121);
        System.out.println(result);
    }
}
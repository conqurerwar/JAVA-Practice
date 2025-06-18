public class reverse_no {

    public static void main(String[] args) {
        int x = 235;
        int temp;
        int rev=0;
        while(x!= 0)
        {
            temp = x%10;
            rev = rev*10+temp;
            x = x/10;
        }
        System.out.println(rev);
    }
}

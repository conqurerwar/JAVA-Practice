class Rev
{
    int reverse(int n,int rev)
    {
        if(n == 0)
        {
            return rev;
        }
        int temp = n%10;
        rev = rev*10+temp;
        return reverse(n/10, rev);
    }
}
public class reverse_no2 {
    public static void main(String[] args) {
        int n;
        int rev = 0;
        Rev r1 = new Rev();
        int reversed = r1.reverse(235, 0);
        System.out.println(reversed);
    }
}

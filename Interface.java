

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n)
    {
        int sum=0;
        if(n==0)return 0;
        if(n==1)return 1;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            sum+=i;
        }
        return sum;
    }
}


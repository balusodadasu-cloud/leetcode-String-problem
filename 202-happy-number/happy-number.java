class Solution {
    static int sumSq(int n)
     {
       int s=0;
         while(n!=0)
         {
           int r=n%10;
            s+=r*r;
             n/=10;
         }
       return s;
 }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=sumSq(n);

        while(fast!=1 && slow!=fast) 
        {
            slow=sumSq(slow);          
            fast=sumSq(sumSq(fast));    
        }
        return fast==1;
    }
}
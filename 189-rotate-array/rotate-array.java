class Solution {
    public void rotate(int[] a, int k) {
         int n=a.length;
        k=k%n;
        int[] r=new int[n];

         for(int i=0;i<k;i++)
            r[i]=a[n-k+i];



          for(int i=0;i<n-k;i++)
            r[i+k]=a[i];
            
          for (int i=0;i<n; i++)
            a[i]=r[i]; 
    }
}
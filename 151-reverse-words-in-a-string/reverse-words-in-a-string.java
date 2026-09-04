class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            String t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
        return String.join(" ",a);
        
    }
}
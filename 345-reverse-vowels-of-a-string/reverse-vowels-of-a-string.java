class Solution {
    public String reverseVowels(String s) {
        char[] sb=s.toCharArray();
       int left=0;
       int rigth=s.length()-1;
       while(left<rigth)
        {
         while(left<rigth && sb[left]!='a' && sb[left]!='e' && sb[left]!='i' && sb[left]!='o' && sb[left]!='u'&& sb[left] != 'A' && sb[left] != 'E' && sb[left] != 'I' && sb[left] != 'O' && sb[left] != 'U')
          {
            left++;
           }
         while(left<rigth&& sb[rigth]!='a' && sb[rigth]!='e' && sb[rigth]!='i' && sb[rigth]!='o' && sb[rigth]!='u'&& sb[rigth] != 'A' && sb[rigth] != 'E' && sb[rigth] != 'I' && sb[rigth] != 'O' && sb[rigth] != 'U')
          {
              rigth--;
          }
          {
            char t=sb[left];
            sb[left]=sb[rigth];
            sb[rigth]=t;
              left++;
              rigth--;
         }
        }
       return new String(sb); 
    
    }
}
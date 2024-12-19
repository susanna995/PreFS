public class OptimizedPalindromesInAStringWithDuplicates {

    public static int CountPalcen(String s)
    { int count=0;
        int n=s.length();
        for (int i = 0; i <n; i++) {
            count+=PalCount(s,i,i);
            count+=PalCount(s,i,i+1);
        }
return count;
    }
    public static int PalCount(String s,int l,int r)
    {
        int c=0;
        if(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            c++;
            l--;
            r++;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(CountPalcen("abcdef"));
    }
}

public class PalindromesInAStringWithDuplicates {
    public static boolean checkPal(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1= sb.toString();
//        System.out.println(s1);
        if(s.equals(s1))
        {
            return true;
        }
        return false;
    }
    public static int CountPal(String s)
    {
        int c=0;
        int n=s.length();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <=n; j++) {
                if(checkPal(s.substring(i,j)))
                {
                    System.out.println(s.substring(i,j));
                    c++;
                }
            }

        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(CountPal(""));

    }
}

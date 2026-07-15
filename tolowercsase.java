public class tolowercsase {

    public String toLowerCase(String s) {
        char [] a= s.toCharArray();
        for (int i = 0 ; i <= a.length-1;i++)
        {if (a[i]>= 'A' && a[i] <= 'Z')
            a[i]= (char) (a[i]+32);
            
        }
        return new String(a);
    }
}


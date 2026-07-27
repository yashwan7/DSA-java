
public class assigncookies {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0; // child
int j = 0; // biskate
int count = 0 ;
Arrays.sort(g);
Arrays.sort(s);
while (i < g.length && j < s.length) {
    
    if (g[i] <= s[j]) {
        count++;
        i++;
        j++;
    } else {
        j++;
    }
} return count ;
  }  }


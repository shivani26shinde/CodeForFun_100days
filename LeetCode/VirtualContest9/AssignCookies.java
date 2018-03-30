// Leetcode --> Q.455 --> Assign Cookies

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int max = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int start1 = 0;
        int start2 = 0;
        while(start1 < g.length && start2 < s.length){
            if(g[start1] <= s[start2]){
                max++;
                start1++;
            }
            start2++;
        }
        return max;
    }
}
// LeetCode --> Q.836 --> Rectangle Overlap

class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if(rec1[2] < rec2[0] || rec1[3] < rec2[1]){
            return false;
        }
        int Lx = Math.max(rec1[0], rec2[0]);
        int Ly = Math.max(rec1[1], rec2[1]);
        int Rx = Math.min(rec1[2], rec2[2]);
        int Ry = Math.min(rec1[3], rec2[3]);
        int L = Lx-Rx;
        int B = Ly-Ry;
        return (L*B > 0) ? true : false;
    }
}

/*

Input: 

[206110757,199595273,851054072,983256382]
[-898677230,-47320317,-858614307,736177810]

Output:

false

*/
// LeetCode --> Q.812 --> Largest Triangle Area

class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        double area = 0;
        for(int i=0;i<points.length-2;i++){
            for(int j=i+1;j<points.length-1;j++){
                for(int k=j+1;k<points.length;k++){
                    int[] p1 = points[i];
                    int[] p2 = points[j];
                    int[] p3 = points[k];
                    double a = Math.sqrt((Math.pow(p2[0]-p1[0], 2))+(Math.pow(p2[1]-p1[1], 2)));
                    double b = Math.sqrt((Math.pow(p3[0]-p2[0], 2))+(Math.pow(p3[1]-p2[1], 2)));
                    double c = Math.sqrt((Math.pow(p1[0]-p3[0], 2))+(Math.pow(p1[1]-p3[1], 2)));
                    double p = (a+b+c)/2;
                    double val1 = p-a;
                    double val2 = p-b;
                    double val3 = p-c;
                    double total = p*val1*val2*val3;
                    double val = Math.sqrt(total);
                    if(val > area){
                        area = val;
                    }
                }
            }
        }
        return area;
    }
}
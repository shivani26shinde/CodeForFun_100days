// LeetCode --> Q.812 --> Largest Triangle Area

class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        double area = 0;
        for(int i=0;i<points.length-2;i++){
            int[] p1 = points[i];
            int[] p2 = points[i+1];
            int[] p3 = points[i+2];
            double a = Math.sqrt((Math.pow(p2[0]-p1[0], 2))+(Math.pow(p2[1]-p1[1], 2)));
            double b = Math.sqrt((Math.pow(p3[0]-p2[0], 2))+(Math.pow(p3[1]-p2[1], 2)));
            double c = Math.sqrt((Math.pow(p1[0]-p3[0], 2))+(Math.pow(p1[1]-p3[1], 2)));
            double p = (a+b+c)/2;
            if(p > max){
                max = p;
                double val1 = p-a;
                double val2 = p-b;
                double val3 = p-c;
                double total = p*val1*val2*val3;
                area = Math.sqrt(total);
            }
        }
        return area;
    }
}
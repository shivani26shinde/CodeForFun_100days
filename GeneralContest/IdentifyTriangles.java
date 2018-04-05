// Contest --> Q1 --> Identify Triangles

static int triangle(int a, int b, int c) {
	int sum1 = a+b;
	int sum2 = b+c;
	int sum3 = a+c;
	if(a < 1 || b < 1 || c < 1){
		return 0;
	}
	if(sum1 < c || sum2 < a || sum3 < b){
		return 0;
	}
	if(a == b && b == c){
		return 1;
	}
	return 2;
}

// Contest --> Q2 --> Encode Data

static int[] delta_encode(int[] array) {
	if(array.length == 0){
		return new int[0];
	}
	List<Integer> list = new ArrayList<>();
	list.add(array[0]);
	for(int i=1;i<array.length;i++){
		int diff = array[i] - array[i-1];
		if(diff > 127 || diff < -127){
			list.add(-128);
		}
		list.add(diff);
	}
	int[] arr = new int[list.size()];
	for(int i=0;i<arr.length;i++){
		arr[i] = list.get(i);
	}
	return arr;
}

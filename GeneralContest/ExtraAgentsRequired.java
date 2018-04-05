// Contest --> Q3 --> Count additional agents required

static int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
	int[] startArray = new int[callsTimes.length];
	int[] endArray = new int[callsTimes.length];
	for(int i=0;i<callsTimes.length;i++){
		startArray[i] = callsTimes[i][0];
		endArray[i] = callsTimes[i][1];
	}
	Arrays.sort(startArray);
	Arrays.sort(endArray);
	int start1 = 0;
	int start2 = 0;
	int num = 0;
	while(start1 < startArray.length && start2 < endArray.length){
		if(startArray[start1] < endArray[start2]){
			num++;
			start1++;
		}
		else{
			num--;
			start2++;
		}
	}
	if(num >= noOfCurrentAgents){
		return 0;
	}
	return noOfCurrentAgents-num;
}

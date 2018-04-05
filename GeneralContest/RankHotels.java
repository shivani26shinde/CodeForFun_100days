// Contest --> Q4 --> Rank Hotels 

static int[] sort_hotels(String keywords, int[] hotel_ids, String[] reviews) {
	HashSet<String> set = new HashSet<>();
	HashMap<Integer, Integer> map = new HashMap<>(); 
	String[] str = keywords.split(" ");
	for(int i=0;i<str.length;i++){
		set.add(str[i].toLowerCase());
	}
	int val = 0;
	for(int i=0;i<hotel_ids.length;i++){
		if(map.containsKey(hotel_ids[i])){
			val = map.get(hotel_ids[i]);
			String[] strOne = reviews[i].split("\\W+");
			System.out.println("Con   "+Arrays.toString(strOne));
			for(int j=0;j<strOne.length;j++){
				if(set.contains(strOne[j].toLowerCase())){
					val++;
				}
			}
			System.out.println(val);
			map.put(hotel_ids[i], val);
		}
		else{
			val = 0;
			String[] strTwo = reviews[i].split("\\W+");
			System.out.println("NonCon   "+Arrays.toString(strTwo));
			for(int j=0;j<strTwo.length;j++){
				if(set.contains(strTwo[j].toLowerCase())){
					val++;
				}
			}
			map.put(hotel_ids[i], val);
			System.out.println(val);
		}
	}
	for(Integer i : map.keySet()){
		System.out.println(i+"  "+map.get(i));
	}
	return new int[0];
}

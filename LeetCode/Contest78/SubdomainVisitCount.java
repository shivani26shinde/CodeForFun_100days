// LeetCode --> Q.811 --> Subdomain Visit Count

class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<cpdomains.length;i++){
            String[] array = cpdomains[i].split(" ");
            int num = Integer.parseInt(array[0]);
            String str = array[1];
            int start = 0;
            int len = str.length();
            while(start < len){
                if(map.containsKey(str)){
                    int val = map.get(str);
                    map.put(str, val+num);
                }
                else{
                    map.put(str, num);
                }
                String[] arr = str.split("\\.", 2);
                if(arr.length > 1){
                    str = arr[1];
                }
                start = start + arr[0].length() + 1;
            }
        }
        for(String s: map.keySet()){
            int value = Integer.valueOf(map.get(s));
            String listStr = value + " " + s;
            list.add(listStr);
        }
        return list;
    }
}
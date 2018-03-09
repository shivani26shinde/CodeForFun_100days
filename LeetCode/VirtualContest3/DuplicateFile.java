// LeetCode --> Virtual Contest --> Question 3 --> Find Duplicate File in System

class DuplicateFile {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> list = new ArrayList<>();
        List<List<String>> listFinal = new ArrayList<>();
        StringBuilder sb;
        HashMap<String, Integer> map = new HashMap<>();
        int val = 0;
        for(int i=0;i<paths.length;i++){
            List<String> temp = Arrays.asList(paths[i].split(" "));
            for(int j=1;j<temp.size();j++){
                String s = temp.get(j);
                String fileName = s.replaceAll("\\d","");
                if(!map.containsKey(fileName)){
                    List<String> lst = new ArrayList<>();
                    sb= new StringBuilder();
                    sb.append(temp.get(0));
                    sb.append("/");
                    sb.append(temp.get(j));
                    lst.add(sb.toString());
                    map.put(fileName, val);
                    list.add(lst);
                    val++;
                }
                else{
                    List<String> lst = list.get(map.get(fileName));
                    sb= new StringBuilder();
                    sb.append(temp.get(0));
                    sb.append("/");
                    sb.append(temp.get(j));
                    lst.add(sb.toString());
                    map.put(fileName, val);
                    list.remove(map.get(fileName));
                    list.add(map.get(fileName), lst);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i).size() > 1){
                listFinal.add(list.get(i));
            }
        }
        return listFinal;
    }
}
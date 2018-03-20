// LeetCode --> Q.802 --> Find Eventual Safe States

class SafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //<Integer> setTemp = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            Set<Integer> set = new HashSet<>();
            set.add(i);
            boolean val = Traverse(i, graph, set);
            if(val == true){
                list.add(i);
            }
        }
        return list;
    }
    public boolean Traverse(int start, int[][] graph, Set<Integer> set){
        //System.out.println(start);
        int[] array = graph[start];
        if(array.length == 0){
            return true;
        }
        boolean val = false;
        for(int j=0;j<array.length;j++){
            if(!set.contains(array[j])){
                set.add(array[j]);
                val = Traverse(array[j], graph, set);
                //set.remove(array[j]);
            }
            else{
                val = false;
            }
        }
        return val;
    }
}
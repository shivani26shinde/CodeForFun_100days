// LeetCode --> Q.797 --> All paths from source to target

class SourceTarget {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int len = graph.length-1;
        temp.add(0);
        CreateList(0, len, graph, list, temp);
        return list;
    }
    
    public void CreateList(int start, int len, int[][] graph, List<List<Integer>> list, List<Integer> temp){
        
        if(start == len){
            List<Integer> l = new ArrayList<>(temp);
            list.add(l);
            return;
        }
        int[] array = graph[start];
        for(int j=0;j<array.length;j++){
            temp.add(array[j]);
            CreateList(array[j], len, graph, list, temp);
            temp.remove(temp.size()-1);
        }
    }
}
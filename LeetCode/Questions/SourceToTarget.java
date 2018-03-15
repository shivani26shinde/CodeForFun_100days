// LeetCode --> Q.797 --> All paths from source to target

class SourceToTarget{
    public static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int len = graph.length-1;
        temp.add(0);
        CreateList(0, len, graph);
        return list;
    }
    
    public void CreateList(int start, int len, int[][] graph){
        
        if(start == len){
            List<Integer> l = new ArrayList<>(temp);
            list.add(l);
            return;
        }
        int[] array = graph[start];
        for(int j=0;j<array.length;j++){
            temp.add(array[j]);
            CreateList(array[j], len, graph);
            temp.remove(temp.size()-1);
        }
    }
}
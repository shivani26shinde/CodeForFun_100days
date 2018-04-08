// Sort Log File using Comparator

import java.util.*;
public class SortLogFileComparator
{
    public static List<String> reorderLines(int logFileSize, List<String> logfile)
    {
        HashMap<String,String> map = new HashMap<>();
        List<String> intList = new ArrayList<>();
        HashMap<String, String> nameMap = new HashMap<>();
        List<Line> list = new ArrayList<>();
        for(int i=0;i<logFileSize;i++) {
            String str = logfile.get(i);
            String[] array = str.split(" ");
            String key = array[1];
            String val = array[0];
            nameMap.put(val, str);
            if (key.matches("-?\\d+(\\.\\d+)?")) {
                intList.add(val);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int k = 1; k < array.length; k++) {
                    sb.append(array[k]);
                }
                String temp = sb.toString();
                list.add(new Line(val, temp));
            }
        }
        Collections.sort(list, new CustomCompare());
        List<String> returnList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String id = list.get(i).getId();
            returnList.add(nameMap.get(id));
        }
        for(int i=0;i<intList.size();i++){
            String stTemp = intList.get(i);
            returnList.add(nameMap.get(stTemp));
        }
        return returnList;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("g1 Act car", "zo4 4 7", "ab1 off KEY dog", "a8 act zoo", "g0 Act car"));
        List<String> ans = reorderLines(5, list);
        System.out.println(Arrays.toString(ans.toArray()));
    }
}

class CustomCompare implements Comparator<Line>{

    @Override
    public int compare(Line o1, Line o2) {
        System.out.println(o1.getValue()+"  "+o2.getValue());
        if(o1.getValue().matches(o2.getValue())){
            return o1.getId().compareTo(o2.getId());
        }
        return o1.getValue().compareTo(o2.getValue());
    }
}
class Line{
    String id;
    String value;
    Line(String id, String value){
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
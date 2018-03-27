// Sort Log File

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.SortedMap;

public class SortLogFile
{
    public List<String> reorderLines(int logFileSize, List<String> logfile) 
	{
		TreeMap<String, TreeSet<String>> map = new TreeMap<>();
		List<String> intList = new ArrayList<>();
		HashMap<String, String> nameMap = new HashMap<>();
		for(int i=0;i<logFileSize;i++){
		    String str = logfile.get(i);
		    String[] array = str.split(" ");
		    String key = array[1];
		    String val = array[0];
		    nameMap.put(val, str);
		    if(key.matches("-?\\d+(\\.\\d+)?")){
		        intList.add(val);
		    }
		    else{
		        StringBuilder sb = new StringBuilder();
		        for(int k=1;k<array.length;k++){
		            sb.append(array[k]);
		        }
		        String temp = sb.toString();
		        if(map.containsKey(temp)){
		            TreeSet<String> setTemp = map.get(temp);
		            setTemp.add(val);
		            map.put(temp, setTemp);
		        }
		        else{
		            TreeSet<String> setTempNew = new TreeSet<>();
		            setTempNew.add(val);
		            map.put(temp, setTempNew);
		        }
		    }
		}
		List<String> returnList = new ArrayList<>();
		for(String s: map.keySet()){
		    TreeSet<String> setTemp = map.get(s);
		    for(String st: setTemp){
		        returnList.add(nameMap.get(st));
		    }
		}
		for(int i=0;i<intList.size();i++){
		    String stTemp = intList.get(i);
		    returnList.add(nameMap.get(stTemp));
		}
		return returnList;
	}
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GridTextMatching {
    public static TreeMap<String,int[]> map = new TreeMap<>();
    public static Set<String> set = new HashSet<>();
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.isEmpty()){
                break;
            };
            list.add(str);
            len++;
        }
        char[][] array = new char[len][len];
        for(int i=0;i<len;i++){
        	char[] chr = list.get(i).toCharArray();
            array[i]=chr;
        }
        while(sc.hasNextLine()){
            String str = sc.next();
            set.add(str);
            map.put(str, new int[2]);
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                CreateWords(i, j, array, new StringBuilder(), len);
            }
        }
        for(String s : set){
            int[] arr = map.get(s);
            arr[0] = -1;
            arr[1] = -1;
            map.put(s, arr);
        }
        for(String s: map.keySet()){
            int[] arr = map.get(s);
            System.out.println(s+" "+arr[0]+" "+arr[1]);
        }
    }
    public static void CreateWords(int x, int y, char[][] array, StringBuilder sb, int n){
        if(x < 0 || x == n || y < 0 || y == n){
            return;
        }
        if(y<n){
        	Right(x,y,array,sb,n);
        }
        if(y>=0){
        	Left(x,y,array,sb,n);
        }
        if(x>=0){
        	Up(x,y,array,sb,n);
        }
        if(x<n){
        	Down(x,y,array,sb,n);
        }
        if(x>=0 && y<n){
            UpRight(x,y,array,sb,n);
        }
        if(x>=0 && y>=0){
            UpLeft(x,y,array,sb,n);
        }
        if(x<n && y>=0){
            DownLeft(x,y,array,sb,n);
        }
        if(x<n && y<n){
            DownRight(x,y,array,sb,n);
        }
    }
    public static void Right(int x, int y, char[][] array, StringBuilder sb, int n){
    	sb = new StringBuilder();
        for(int i=y;i<n;i++){
            sb.append(array[x][i]);
            if(set.contains(sb.toString())){
                int[] arr = map.get(sb.toString());
                arr[0] = x;
                arr[1] = y;
                map.put(sb.toString(), arr);
                set.remove(sb.toString());
                return;
            }
        }
    }
    public static void Left(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        for(int i=y;i>=0;i--){
                sb.append(array[x][i]);
                if(set.contains(sb.toString())){
                    int[] arr = map.get(sb.toString());
                    arr[0] = x;
                    arr[1] = y;
                    map.put(sb.toString(), arr);
                    set.remove(sb.toString());
                    return;
                }
        }
    }
    public static void Up(int x, int y, char[][] array, StringBuilder sb, int n){
    	sb = new StringBuilder();
        for(int i=x;i>=0;i--){
                sb.append(array[i][y]);
                if(set.contains(sb.toString())){
                    int[] arr = map.get(sb.toString());
                    arr[0] = x;
                    arr[1] = y;
                    map.put(sb.toString(), arr);
                    set.remove(sb.toString());
                    return;
                }
        }
    }
    public static void Down(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        for(int i=x;i<n;i++){
            sb.append(array[i][y]);
            if(set.contains(sb.toString())){
                    int[] arr = map.get(sb.toString());
                    arr[0] = x;
                    arr[1] = y;
                    map.put(sb.toString(), arr);
                    set.remove(sb.toString());
                    return;
            }
        }	
    }
    public static void UpRight(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        int i=x;
        int j=y;
        while(i>=0 && j<n){
            sb.append(array[i][j]);
            if(set.contains(sb.toString())){
                    int[] arr = map.get(sb.toString());
                    arr[0] = x;
                    arr[1] = y;
                    map.put(sb.toString(), arr);
                    set.remove(sb.toString());
                    return;
            }
            i--;
            j++;
        }	
    }
    public static void UpLeft(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        int i=x;
        int j=y;
        while(i>=0 && j>=0){
            sb.append(array[i][j]);
            if(set.contains(sb.toString())){
                int[] arr = map.get(sb.toString());
                arr[0] = x;
                arr[1] = y;
                map.put(sb.toString(), arr);
                set.remove(sb.toString());
                return;
            }
            i--;
            j--;
        }	
    }
    public static void DownLeft(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        int i=x;
        int j=y;
        while(i<n && j>=0){
            sb.append(array[i][j]);
            if(set.contains(sb.toString())){
                int[] arr = map.get(sb.toString());
                arr[0] = x;
                arr[1] = y;
                map.put(sb.toString(), arr);
                set.remove(sb.toString());
                return;
            }
            i++;
            j--;
        }	
    }
    public static void DownRight(int x, int y, char[][] array, StringBuilder sb, int n){
        sb = new StringBuilder();
        int i=x;
        int j=y;
        while(i<n && j<n){
            sb.append(array[i][j]);
            if(set.contains(sb.toString())){
                int[] arr = map.get(sb.toString());
                arr[0] = x;
                arr[1] = y;
                map.put(sb.toString(), arr);
                set.remove(sb.toString());
                return;
            }
            i++;
            j++;
        }
    }
}
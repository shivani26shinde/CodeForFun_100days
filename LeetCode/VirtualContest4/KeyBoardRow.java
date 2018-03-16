// LeetCode --> Q.500 --> Keyboard row

class KeyBoardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int k = 1;
        Character[] elements1 = {'Q','q','W','w','E','e','R','r','T','t','Y','y','U','u','I','i','O','o','P','p'};
        HashSet<Character> set1 = new HashSet<>(Arrays.asList(elements1));
        Character[] elements2 = {'A','a','S','s','D','d','F','f','G','g','H','h','J','j','K','k','L','l'};
        HashSet<Character> set2 = new HashSet<>(Arrays.asList(elements2));
        Character[] elements3 = {'Z','z','X','x','C','c','V','v','B','b','N','n','M','m'};
        HashSet<Character> set3 = new HashSet<>(Arrays.asList(elements3));;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.length()>0){
                if(set1.contains(word.charAt(0))){
                    k=1;
                    while(k<word.length()){
                        if(!set1.contains(word.charAt(k))){
                            break;
                        }
                        else{
                            k++;
                        }
                    }
                    if(k == word.length()){
                        list.add(word);
                    }
                }
                else if(set2.contains(word.charAt(0))){
                    k=1;
                    while(k<word.length()){
                        if(!set2.contains(word.charAt(k))){
                            break;
                        }
                        else{
                            k++;
                        }
                    }
                    if(k==word.length()){
                        list.add(word);
                    }
                }
                else if(set3.contains(word.charAt(0))){
                    k=1;
                    while(k<word.length()){
                        if(!set3.contains(word.charAt(k))){
                            break;
                        }
                        else{
                            k++;
                        }
                    }
                    if(k==word.length()){
                        list.add(word);
                    }
                }
            }
        }
        String[] array = new String[list.size()];
        array = list.toArray(array);
        return array;
    }
}
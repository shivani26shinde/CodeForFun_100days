// LeetCode --> Q.482 --> License Key Formatting

class LicenseKeyFormat {
    public String licenseKeyFormatting(String S, int K) {
        if(S.indexOf('-') < 0){
            return "";
        }
        String[] array = S.split("-", 2);
        String str = array[1];
        StringBuilder sb = new StringBuilder();
        StringBuilder sbOne = new StringBuilder();
        String strOne = array[0].toUpperCase();
        sb.append(strOne);
        String[] arr = str.split("-");
        for(int i=0;i<arr.length;i++){
            sbOne.append(arr[i].toUpperCase());
        }
        str = sbOne.toString();
        int start = 0;
        while(start < str.length()){
            sb.append("-");
            if(start+K < str.length()){
                strOne = str.substring(start,start+K);
            }
            else{
                strOne = str.substring(start,str.length());
            }
            sb.append(strOne);
            start = start+K;
        }
        return sb.toString();
    }
}
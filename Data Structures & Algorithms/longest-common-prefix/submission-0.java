class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String ans="";
        Arrays.sort(strs);
        char[] str1=strs[0].toCharArray();
        char[] str2=strs[n-1].toCharArray();
            for(int i=0;i<str1.length;i++){
                if(str1[i]==str2[i]){
                    ans+=str1[i];
                }
                else{
                    return ans;
                }
            }
     return ans;
    }
}
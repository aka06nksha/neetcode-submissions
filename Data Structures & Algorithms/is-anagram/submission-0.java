class Solution {
    public boolean isAnagram(String s, String t) {
       int[] freqS=new int[256];
       int[] freqT=new int[256];
       
       for(char ch:s.toCharArray()){
         freqS[ch]++;
       }
       for(char ch:t.toCharArray()){
          freqT[ch]++;
       }
       for(int i=0;i<256;i++){
        if(freqS[i]!=freqT[i]){
            return false;
        }
       }
       return true;
    }
}

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
         for(String s:strs){
           sb.append(s.length());
           sb.append('#');
           sb.append(s);
         }
         return sb.toString();
    }

    public List<String> decode(String str) {
       List<String> ans=new ArrayList<>();
       int i=0;
          while(i<str.length()){
            String s="";
            int k=str.indexOf('#',i);
            int len=Integer.parseInt(str.substring(i,k));
             for(int j=k+1;j<k+len+1;j++){
                s+=str.charAt(j);
             }
             ans.add(s);
             i=k+len+1;
          }
          return ans;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replace(" ","");
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        System.out.println(st);
        int n=st.length();
        int i=0,j=n-1;
        while(i<=j){
            char ch1=st.charAt(i);
            char ch2=st.charAt(j);
            System.out.print(ch1+" "+ch2);
            if(ch1!=ch2)
              return false;
            i++;
            j--;
        }
        return true;
    }
}

// Last updated: 8/11/2026, 2:16:05 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Scanner sc=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        Stack<Character> tst=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if(!st.isEmpty())
                st.pop();
            }
            else
              st.push(ch);

        }
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if(!tst.isEmpty())
                tst.pop();
            }
            else
            tst.push(ch);
        }
        if(st.equals(tst))
        return true;
        else
        return false;
    }
}
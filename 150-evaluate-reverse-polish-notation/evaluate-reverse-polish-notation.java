class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++)
        {   if(tokens[i].equals("+")){
                
               int num1=ans.remove(ans.size()-1);
               int num2=ans.remove(ans.size()-1);
               int sum=num1+num2;
                ans.add(sum);

            }
             else if(tokens[i].equals("-")){
                int num1=ans.remove(ans.size()-1);
               int num2=ans.remove(ans.size()-1);
               int sum=num2-num1;
                ans.add(sum);
            }
            else if(tokens[i].equals("/")){
                int num1=ans.remove(ans.size()-1);
               int num2=ans.remove(ans.size()-1);
               int sum=num2/num1;
                ans.add(sum);
            }
            else if(tokens[i].equals("*")){
               int num1=ans.remove(ans.size()-1);
               int num2=ans.remove(ans.size()-1);
               int sum=num1*num2;
                ans.add(sum);
            }
            else{
             ans.add(Integer.parseInt(tokens[i]));
            }
        }
         
        int ans1=ans.remove(ans.size()-1) ;
        return ans1;
    }
}
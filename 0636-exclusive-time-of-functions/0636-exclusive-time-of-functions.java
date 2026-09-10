import java.util.*; 
class Solution 
{ 
    public int[] exclusiveTime(int n, List<String> logs)
    {
         int[] result = new int[n];
         Stack<Integer> stack = new Stack<>();
        int previousTime = 0; 
        for (String log : logs)
        { 
            String[] parts = log.split(":");
             int id = Integer.parseInt(parts[0]);
             String type = parts[1]; 
            int time = Integer.parseInt(parts[2]); 
            if (type.equals("start"))
             {
                 if (!stack.isEmpty()) 
                 { 
                 result[stack.peek()] += time - previousTime; 
                 } 
                 stack.push(id);
                 previousTime = time; 
                 }
             else 
             {
                 result[stack.peek()] += time - previousTime + 1;
                  stack.pop(); 
                  previousTime = time + 1; 
                  }
                   }
                   
             return result; 
             }
         }
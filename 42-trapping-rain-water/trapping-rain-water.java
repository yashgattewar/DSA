import java.util.*;
class Solution {
    public static int trap(int[] height) {
        int left=0;
        int right= height.length-1;
        int rightmax=0;
        int leftmax=0;
        int water=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                        water +=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];

                }
                else{
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String args[]){
        Scanner sr = new Scanner(System.in);
        int n=0;
          System.out.println("enter the size of an array:");
        n=sr.nextInt();
        int height[]=new int[n];
        int ans=0;
      
        System.out.println("enter numbers in array");
        for(int i=0;i<n;i++){
            height[i]=sr.nextInt();
        }
        ans=trap(height);
        System.out.println(ans);

    }
}
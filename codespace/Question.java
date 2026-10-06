import java.util.Scanner;
class  solution {
	public int[] Twosum (int[] nums,int target){
		int[] arr = new int[2];
		for (int i=0 ; i<nums.length;i++){
			for (int j=0 ; j<nums.length;j++){
				if (nums[i]+nums[j]==target){
					arr[0]=i;
					arr[1]=j;
					break;
				}
				
			}
			
		}
		return arr;
	}
}
class Question{
	public int removeelement (int[] nums,int val){
		int k=0;
		for ( int i=0;i<nums.length;i++){
			if (nums[i]!=val){
				nums [k]=nums[1];
				k++;
			}
		}
		return k;
	}
}
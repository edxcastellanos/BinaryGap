
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		
		System.out.println("The maximum binary gap is: "+s.solution(529));
	}

	public int solution(int n){
		int maxBinaryGap = 0;
		
		String strBinaryN = Integer.toBinaryString(n);
		
		System.out.println("The number (in decimal format) you want to know the Gap is: "+ n);
		System.out.println("The number converted to Binary format you want to know the Gap is: "+ strBinaryN);
		
		int intAux= 0;
		for(int i=0; i<strBinaryN.length(); i++){
			if(strBinaryN.charAt(i) == '1'){
				if(intAux >= maxBinaryGap){
					maxBinaryGap = intAux;
				}
				intAux = 0;
			}else if(strBinaryN.charAt(i)== '0'){
				intAux++;
			}
		}
		return maxBinaryGap;
	}
}

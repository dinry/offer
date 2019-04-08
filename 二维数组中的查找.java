package sword2offer;

public class offer1_solution {
	public boolean Find(int target, int [][] array) {
		if(array.length==0||array[0].length==0)
			return false;
		int rows=array.length-1;
		int cols=array[0].length-1;
		int i=0;
		int j=cols;
		while(i<=rows && j>=0) {
			if(array[i][j]<target) {
				i++;
			}else if(array[i][j]>target){
				j--;
			}else {
				return true;
			}
		}
		return false;
	}
}


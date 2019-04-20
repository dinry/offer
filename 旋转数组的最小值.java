package sword2offer;
//旋转数组的最小值
//二分法查找
public class offer6 {
	public static int minNumberInRotateArray(int[] array) {
		if(array.length==0) {
			return 0;
		}
		if(array[0]<array[array.length-1]) {
			return array[0];
		}
		int start=1;
		int end=array.length-1;
		while(start+1!=end) {
			int mid=(start+end)/2;
			if(array[mid]>array[start]) {
				start=mid;
			}else if(array[mid]<array[end]) {
				end=mid;
			}else {
				start++;
			}
		}
		return array[end];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int c=minNumberInRotateArray(a);
		System.out.print(c);

	}

}

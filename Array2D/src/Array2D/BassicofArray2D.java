package Array2D;

public class BassicofArray2D {
	public static void  fun(int[][] arr2d)
	{

	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            arr2d[i][j]=2*i+j;
	        }
	    }
	}
	public static void main(String[] args) 
	{ 
	    int[][] arr = new int[2][2]; 
	    fun(arr);
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            System.out.print(arr[i][j]+" " );
	        }
	    }
	} 


//	public static void main(String[] args) {
//		int [][] arr2d = new int [3][4];
//		System.out.println(arr2d[2][1]);
//		
//		arr2d[2][1] = 12;
//		System.out.println(arr2d[2][1]);
//
//	}

}

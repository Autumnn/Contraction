import java.io.*;

class Sample{

	public long[][] Result;

	public void category(long[] Original_Data, long mean){

	int Length = Data.length();
	public long[] Data = Original_Data;
	public long[] A = new long[Length];
	public long[] B = new long[Length];
	Result = new long[Length][Length];


	for(int i=0; i<Length; i++){
		if(Data[i] > 0)
		{
			A[i] = Data[i];
			B[i] = 0;
		}else if(Data[i] < 0)
		{
			A[i] = 0;
			B[i] = Data[i];
		}else{
			Result[i][i] = 0;
		} 
	}

	// The first run to find an exactly equal user.
	for(int i=0; i<Length; i++){
		if(A[i] != 0) {
			for(int j=0; j<Length; j++){
				if((B[j] != 0)&&(A[i] == (-B[j]))){
					Result[i][j] = A[i];
					Result[j][i] = B[j];
					A[i] = 0;
					B[j] = 0;
				}
			}
		}
	}

	// The second run: two users pay for one.
	  		


	}
}
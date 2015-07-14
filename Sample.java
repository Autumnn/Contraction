import java.io.*;

class Sample{

	public long[][] Result;

	public void category(long[] Original_Data, long mean){

	int Length = Data.length;
	long[] Data = Original_Data;
	long[] A = new long[Length];
	long[] B = new long[Length];
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
	for(int i=0; i<Length; i++){
		if(A[i] != 0) {
			for(int j=0; j<Length; j++){
				if((B[j] != 0)&&(A[i] > (-B[j]))){
					long d = A[i] + B[j];
					for(int k=0; k<Length; k++){
						if(d == (-B[k])){
							Result[i][j] = -B[j];
							Result[i][k] = -B[k];
							Result[j][i] = B[j];
							Result[k][i] = B[k];
							A[i] = 0;
							B[j] = 0;
							B[k] = 0;
						}
					}
				}else if((B[j] != 0)&&(A[i] < (-B[j]))){
					long d = A[i] + B[j];
					for(int k=0; k<Length; k++){
						if(d == (-A[k])){
							Result[i][j] = A[i];
							Result[k][j] = A[k];
							Result[j][i] = -A[i];
							Result[j][k] = -A[k];
							A[i] = 0;
							B[j] = 0;
							A[k] = 0;
						}
					}
			}
		}
	}		


	}
}
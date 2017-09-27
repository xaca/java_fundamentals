import java.util.*;
public class Magica{

	public static void main(String[] args) {
		int m[][] = {{2,3,5,0,1,5},{0,0,1,2,6,7},{2,2,3,3,4,2},{3,3,1,6,2,1},{4,2,3,4,2,1},{5,6,3,1,1,0}};
		int sumas_cols[] = new int[m.length];
		int suma_filas = 0;

		for (int i=0; i<m.length ;i++ ) {
			for (int j=0;j<m[0].length ;j++ ) {
				System.out.print(m[i][j]+" ");
				suma_filas += m[i][j];
				sumas_cols[i] += m[j][i];
			}
			System.out.print("= "+suma_filas);
			System.out.println("");
			suma_filas = 0;
		}
		System.out.println(Arrays.toString(sumas_cols));
	}

}
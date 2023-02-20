
public class Matriz {
	
	int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] matriz2 = {{9,8,7},{6,5,4},{3,2,1}};
	int[][] matrizResultado = new int[3][3];
	int mayor;
	
	public void imprimeMatrices(int[][] matriz) {
		for(int i = 0; i<matriz.length;i++) {
			for(int j = 0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
	  public static void multiplicarMatriz(int matrizResultado[][], int matriz1[][], int matriz2[][]){
		     for(int i = 0; i < matriz1.length; i++){
		            for (int j = 0; j<matriz2[0].length; j++){
		                for (int k = 0; k <matriz1[0].length; k++){  
		                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j]; 
		                }
		            }
		        }
		    }
	  public static void sumarMatriz(int matrizResultado[][], int matriz1[][], int matriz2[][]){
		     for(int i = 0; i < matriz1.length; i++){
		            for (int j = 0; j<matriz2[0].length; j++){
		                for (int k = 0; k <matriz1[0].length; k++){  
		                    matrizResultado[i][j] = matriz1[i][k] + matriz2[k][j]; 
		                }
		            }
		        }
		    }
		public void encuentraMayor(int[][] matriz) {
			int mayor = 0;
			for(int i = 0; i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					if (matriz[i][j] < matriz[i+1][j]) {
						mayor = matriz  [i+1][j];
					}
				}
			}
			System.out.println(mayor);
		}
		public void multiplicarEscalar(int[][] matriz, int escalar) {
			for(int i = 0; i<matriz.length;i++) {
				for(int j = 0;j<matriz[i].length;j++) {
					matrizResultado[i][j] = matriz[i][j] * escalar;
				}
				//System.out.println();
			}
		}
	
}

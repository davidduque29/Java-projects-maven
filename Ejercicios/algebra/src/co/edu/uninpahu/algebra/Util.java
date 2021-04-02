package co.edu.uninpahu.algebra;

public class Util {

	public static Number determinante(Number matriz[][]) throws Exception {
		//Si no es una matriz cuadrada no tiene sentido sacar el determinante
		Number retorno = null;
		if (matriz.length!=matriz[0].length) {
			throw new Exception("La matriz no es cuadrada, por consiguiente no tiene determinante");
		}
		//2x2
		if (matriz.length==2 && matriz[0].length==2) {
			retorno = (matriz[0][0].doubleValue()*matriz[1][1].doubleValue()) - (matriz[0][1].doubleValue()*matriz[1][0].doubleValue());
		} else {
			//recorre la primera fila
			retorno = 0;
			for (int i=0;i<matriz[0].length;i++) {
				retorno = retorno.doubleValue()+matriz[0][i].doubleValue()*(cofactorIJ(matriz, 0, i)).doubleValue();
			}
		}
		if (retorno!= null && retorno.longValue()==retorno.doubleValue()) {
			return retorno.longValue();
		}
		return retorno;
	}

	public static Number[][] menorIJ(Number matriz[][],int fila,int columna) throws Exception{
		Number menorIJ[][] = new Number[matriz.length-1][matriz[0].length-1];
		//se valida que la fila y columna a quitar sean validas
		if (fila<matriz.length && columna<matriz[0].length) {
			for (int i=0;i<matriz.length;i++) {
				for (int j=0;j<matriz[i].length;j++) {
					if (i<fila && j<columna) {
						menorIJ[i][j]=matriz[i][j];
					} else if (i<fila && j>columna) {
						menorIJ[i][j-1]=matriz[i][j];
					} else if (i>fila && j<columna) {
						menorIJ[i-1][j]=matriz[i][j];
					} else if (i>fila && j>columna) {
						menorIJ[i-1][j-1]=matriz[i][j];
					}
				}
			}
		} else {
			throw new Exception("Los indices suministrados estan por fuera del tamanio de la matriz");
		}
		return menorIJ;
	}

	public static Number cofactorIJ(Number matriz[][],int fila,int columna) throws Exception {
		Number cofactorIJ = Math.pow(-1, ((fila+1)+(columna+1)))*(determinante(menorIJ(matriz, fila, columna)).longValue());
		if (cofactorIJ.longValue()==cofactorIJ.doubleValue()) {
			return cofactorIJ.longValue();
		}
		return cofactorIJ.doubleValue();
	}

	public static void mostrarMatriz(Object matriz[][]) {
		for (int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("pos1: "+matriz[1]);
		}
	}

	/**
	 * Metodo que soluciona sistema de ecuaciones lineales
	 * @param matriz la matriz de coeficientes del sistema de ecuaciones
	 * @param resultados el array de resultados ordenado 
	 * @return el array con los valores que solucionan el sistema
	 * @throws Exception 
	 */
	public static Number[] reglaCramer(Number matriz[][], Number resultados[]) throws Exception {
		Number det = determinante(matriz);
		Number[] retorno = new Number[matriz[0].length];
		if (det.doubleValue()!=0) {
			for (int i=0;i<retorno.length;i++) {
				Double aux=determinante(cambiarColumna(matriz, resultados, i)).doubleValue()/det.doubleValue();
				System.out.println(aux);
				retorno[i]=aux;
			}
		} else {
			System.out.println("El determinante del sistema es cero, el sistema no tiene solucion o tiene infinitas soluciones");
		}
		return retorno;
	}

	public static Number[][] cambiarColumna(Number matriz[][], Number array[], int indiceColumna) throws Exception{
		Number retorno[][] = new Number[matriz.length][matriz[0].length];
		if (matriz.length!=array.length) {
			throw new Exception("El array de solucion no corresponde con el tamanio de la matriz indicada");
		}
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				if (j==indiceColumna) {
					retorno[i][indiceColumna]=array[i];
				} else {
					retorno[i][j]=matriz[i][j];
				}
			}
		}
		return retorno;
	}
	public static void inputLetras(java.awt.event.KeyEvent evt) {
		char c=evt.getKeyChar();
                if (c<'0' || c>'9') evt.consume();
	}
 
}

package unico;

import java.util.Arrays;

public class Ej_05 {

	public static void main(String[] args) {
		Integer [] datos = {5,3,6,3,5,7};
		System.out.println(Arrays.toString(datos));
		for(int i=0; i< datos.length; i++) {
			
			for(int j=i+1; j< datos.length; j++) {
				
				if(datos[i] == datos[j]) {
					datos[j] = null;
				}
				}
			}
		System.out.print(Arrays.toString(datos));
	}

}

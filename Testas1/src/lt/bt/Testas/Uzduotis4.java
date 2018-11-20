package lt.bt.Testas;

public class Uzduotis4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 5, 7, 34, 1, 3, 6, 8, 8, 5};
		for (int i = 0; i < array.length-1; i++){
			
            for (int j = i+1; j < array.length; j++){
            	
                if ((array[i] == array[j]) && (i != j)){
                	System.out.println("Duplicate Element: "+ array[j]);
                }
            }
        }
	}
}
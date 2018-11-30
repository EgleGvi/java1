package lt.bt.paveldimumas;

public class Farm {

	private Animal[] animalArray;
	
	public Farm(Animal[] animalArray) {
		// TODO Auto-generated constructor stub
		
		this.animalArray=animalArray;
	}

	@Override public String toString() {
		String sound = "";
		for (int i=0; i < animalArray.length; i++) {
			sound = sound + animalArray[i].toString();
		}
	      return sound;
	    }
}

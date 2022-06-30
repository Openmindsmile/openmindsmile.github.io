
public class Test1 {

	int[] deck = new int[45];
	int[] lotto = new int[6];
	
	void initialization() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i+1;
			
		}
		
	}
	
	void mix() {
		for(int i=0; i<100 ; i++) {
			int n = (int)(Math.random()*45);
			
			int tmp = deck[0];
			deck[0] = deck[n];
			deck[n] = tmp;
		}
		
	}
	
	void extract() {
		
		for(int j = 0 ; j < 6 ; j++)
			lotto[j] = deck [j];
		
	}

	


void order() {
	boolean b = true;
	while(b) {
		b = false;
		for(int i = 0 ; i<lotto.length-1; i++) {
			
			if(lotto[i] > lotto[i+1]) {
				int temp = lotto[i];
				lotto[i] = lotto[i+1];
				lotto[i+1] = temp;
				b = true;
				
			}
			
		}
		
		
	}
	
}


}
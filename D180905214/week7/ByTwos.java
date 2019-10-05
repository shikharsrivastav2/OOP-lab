public class ByTwos implements Series {

	private int k;
	
	public void setStart (int strt) {
		k = strt;
	}

	public int getNext () {
		k += 2;
		return k;
	}
	
	public void reset () {
		k = 0;
	}

}
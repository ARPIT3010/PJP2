package PJP2.Week2.FeeCalc;


public class Transaction implements Comparable{
	int eId;
	int cId;
	String sId;
	String tType;
	String tDate;
	int value;
	boolean mark;
	int charges;

	@Override
	public int compareTo(Object obj) {

		Transaction transaction=(Transaction)obj;
		int cIdCompare = this.cId - transaction.cId;
		int chargesCompare = this.charges -  transaction.charges;
		int tTypeCompare = this.tType.compareTo(transaction.tType);
		int tDateCompare = this.tDate.compareTo(transaction.tDate);
		if(cIdCompare == 0) {
			if(tTypeCompare == 0) {
				if(tDateCompare == 0)
					return chargesCompare;
				else
					return tDateCompare;
			}
			else {
				return tTypeCompare;
			}
		}
		else {
			return cIdCompare;
		}
	}

		
	@Override
	public String toString() {
		return cId + "," + tType + "," + tDate + "," + ""  + "," + charges + "\n" ;
	}	
		

	

}

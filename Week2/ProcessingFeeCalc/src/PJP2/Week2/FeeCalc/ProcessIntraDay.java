package PJP2.Week2.FeeCalc;



public class ProcessIntraDay extends Transaction {

	

	public ProcessIntraDay(int eId, int cId, String sId, String tType, String tDate,
			int value) {
		
		this.eId=eId;
		this.cId=cId;
		this.sId=sId;
		this.tType=tType;
		this.tDate=tDate;
		this.value=value;
		this.charges=10;
		
	}

}

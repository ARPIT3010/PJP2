package PJP2.Week2.FeeCalc;



public class ProcessNormal extends Transaction {
	//calculate charges if the it is a normal transaction 
	public ProcessNormal(int eId, int cId, String tType, String tDate, int value, boolean mark) {
		this.eId=eId;
		this.cId=cId;
		this.tType=tType;
		this.tDate=tDate;
		this.value=value;
		this.mark=mark;
		
		if(mark)
		{
			charges=500;
		}
		else
		{
			if(tType.equals("sell") || tType.equals("withdraw"))
			{
				charges=100;
			}
			else
			{
				charges=50;
			}
		}
		
	}

}

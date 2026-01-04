package encapsulation;


class vizag{
	
	private int snak;
	private String brideg;
	private String cmr;
	
	public int getSnak() {
		return snak;
	}
	public void setSnak(int snak) {
		this.snak = snak;
	}
	public String getBrideg() {
		return brideg;
	}
	public void setBrideg(String brideg) {
		this.brideg = brideg;
	}
	public String getCmr() {
		return cmr;
	}
	public void setCmr(String cmr) {
		this.cmr = cmr;
	}

	
}

public class Encapsulationreadandwriteclass {

	public static void main(String[] args) {
		vizag obj= new vizag();
		obj.setSnak(40);
	    System.out.println(obj.getSnak());
		obj.setBrideg("Glass Bridge");
		System.out.println(obj.getBrideg());
		obj.setCmr("central");
		System.out.println(obj.getCmr());
		

	}

}

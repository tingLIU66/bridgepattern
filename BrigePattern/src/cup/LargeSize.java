package cup;

public class LargeSize extends Cups{
	
	protected float pricerate;
	
	

	public float getPricerate() {
		return pricerate;
	}



	public void setPricerate(float pricerate) {
		this.pricerate = pricerate;
	}



	@Override
	public String ChooseSize() {
		
		return "Large";
		
	}

	@Override
	public float pricerate() {
		
		return pricerate = 1.5f;
	}

}
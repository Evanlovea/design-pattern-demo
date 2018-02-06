package mediator_pattern;
//�����н�����
public class WTO extends Union {


	private China china;
	private UnitedStates us;
	public void setChina(China china) {
		this.china=china;
	}
	public void setUnitedStates(UnitedStates us) {
		this.us=us;
	}
	
	@Override
	public void sendMessage(String message, Country country) {
		if(country==china) {
			us.getMessage(message);
		}else {
			china.getMessage(message);
		}
		
	}

}

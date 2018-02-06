package mediator_pattern;

public class Client {
	public static void main(String args[]) {
		WTO wto=new WTO();
		China china=new China();
		UnitedStates uStates=new UnitedStates();
		china.setUnion(wto);
		uStates.setUnion(wto);
		wto.setChina(china);
		wto.setUnitedStates(uStates);
		china.sendMessage("中国是一个大国");
		uStates.sendMessage("美国也是一个大国");
	}
}

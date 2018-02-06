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
		china.sendMessage("�й���һ�����");
		uStates.sendMessage("����Ҳ��һ�����");
	}
}

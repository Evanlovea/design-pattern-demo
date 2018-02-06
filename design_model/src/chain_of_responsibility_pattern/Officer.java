package chain_of_responsibility_pattern;
//���������� 
//���󳤹���
public abstract class Officer {
	protected String name;
	protected Officer officer;
	public Officer(String name) {
		this.name=name;
	}
	//��̶���
	public void setOfficer(Officer officer) {
		this.officer=officer;
	}
	//����Ȩ��
	public abstract void handleMission(Mission mission);
}

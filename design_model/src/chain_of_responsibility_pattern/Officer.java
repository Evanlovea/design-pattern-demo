package chain_of_responsibility_pattern;
//抽象处理者类 
//抽象长官类
public abstract class Officer {
	protected String name;
	protected Officer officer;
	public Officer(String name) {
		this.name=name;
	}
	//后继对象
	public void setOfficer(Officer officer) {
		this.officer=officer;
	}
	//处理权限
	public abstract void handleMission(Mission mission);
}

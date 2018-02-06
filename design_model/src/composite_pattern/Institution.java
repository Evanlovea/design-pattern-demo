package composite_pattern;

import java.util.ArrayList;

//容器构建角色
 class Institution extends Unit {
    private ArrayList list=new ArrayList();
    private String name;
    public Institution(String name) {
    	this.name=name;
    }
    public void add(Unit unit) {
    	list.add(unit);
    }
	@Override
	public void handleFiles() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"接收并下发公文：");
		for(Object obj:list) {
			((Unit)obj).handleFiles();
		}
	}

}

package composite_pattern;

import java.util.ArrayList;

//����������ɫ
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
		System.out.println(this.name+"���ղ��·����ģ�");
		for(Object obj:list) {
			((Unit)obj).handleFiles();
		}
	}

}

package composite_pattern;
//Ҷ�ӹ���
class Office extends Unit {
    private String name;
    public Office(String name) {
    	this.name=name;
    }
	public void handleFiles() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"������");
	}

}

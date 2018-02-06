package composite_pattern;
//叶子构件
class Office extends Unit {
    private String name;
    public Office(String name) {
    	this.name=name;
    }
	public void handleFiles() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"处理公文");
	}

}

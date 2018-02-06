package composite_pattern;
//创建属性结构
public class Client {
	public static void main(String args[]) {
		//创建对象北京总部，湖南分部，长沙，湘潭教学点
		Institution bjHeadquarters,hnSubSchool,csTeachingPost,xtTeachingPost;
		//创建对象各教务/行政办公室
		Unit jwOffice,jwoffice1,jwoffice2,jwoffice3,xzoffice,xzoffice1,xzoffice2,xzoffice3;
		//实例化对象
		bjHeadquarters=new Institution("北京总部");
		hnSubSchool=new Institution("湖南分校");
		csTeachingPost=new Institution("长沙教学点");
		xtTeachingPost=new Institution("湘潭教学点");
		jwOffice=new Office("北京教务办公室");
		jwoffice1=new Office("湖南教务办公室");
		jwoffice2=new Office("长沙教务办公室");
		jwoffice3=new Office("湘潭教务办公室");
		xzoffice=new Office("北京行政办公室");
		xzoffice1=new Office("湖南行政办公室");
		xzoffice2=new Office("长沙行政办公室");
		xzoffice3=new Office("湘潭行政办公室");
		//进行组合
		bjHeadquarters.add(jwOffice);
		bjHeadquarters.add(xzoffice);
		bjHeadquarters.add(hnSubSchool);
		hnSubSchool.add(csTeachingPost);
		hnSubSchool.add(jwoffice1);
		hnSubSchool.add(xzoffice1);
		hnSubSchool.add(xtTeachingPost);
		csTeachingPost.add(jwoffice2);
		csTeachingPost.add(xzoffice2);
		xtTeachingPost.add(xzoffice3);
		xtTeachingPost.add(jwoffice3);
		bjHeadquarters.handleFiles();
	}
}

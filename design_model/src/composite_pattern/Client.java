package composite_pattern;
//�������Խṹ
public class Client {
	public static void main(String args[]) {
		//�������󱱾��ܲ������Ϸֲ�����ɳ����̶��ѧ��
		Institution bjHeadquarters,hnSubSchool,csTeachingPost,xtTeachingPost;
		//�������������/�����칫��
		Unit jwOffice,jwoffice1,jwoffice2,jwoffice3,xzoffice,xzoffice1,xzoffice2,xzoffice3;
		//ʵ��������
		bjHeadquarters=new Institution("�����ܲ�");
		hnSubSchool=new Institution("���Ϸ�У");
		csTeachingPost=new Institution("��ɳ��ѧ��");
		xtTeachingPost=new Institution("��̶��ѧ��");
		jwOffice=new Office("��������칫��");
		jwoffice1=new Office("���Ͻ���칫��");
		jwoffice2=new Office("��ɳ����칫��");
		jwoffice3=new Office("��̶����칫��");
		xzoffice=new Office("���������칫��");
		xzoffice1=new Office("���������칫��");
		xzoffice2=new Office("��ɳ�����칫��");
		xzoffice3=new Office("��̶�����칫��");
		//�������
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

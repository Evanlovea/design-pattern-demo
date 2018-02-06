package flyweight_pattern;

public class SharingByte {
   private String content;
   private Color color;
   private Size size;
   public SharingByte(String content) {
	   this.content=content;
   }
   public void setColor(Color color) {
	   this.color=color;
   }
   public void setSize(Size size) {
	   this.size=size;
   }
   public void display() {
	   System.out.println("����"+this.content+"����ɫ"+this.color.getColor()+",��С"+this.size.getSize());
   }
   
}

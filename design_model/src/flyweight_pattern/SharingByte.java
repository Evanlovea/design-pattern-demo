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
	   System.out.println("内容"+this.content+"，颜色"+this.color.getColor()+",大小"+this.size.getSize());
   }
   
}

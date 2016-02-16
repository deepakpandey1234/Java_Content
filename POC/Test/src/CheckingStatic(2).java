
public class CheckingStatic {
int id;
String clgname;
static String clgID="456";
CheckingStatic(int i, String s){
	id=i;
	clgname=s;
}
void display(){
	System.out.println(id+""+clgname+""+clgID);
}

public static void main(String[] args) {
	CheckingStatic c=new CheckingStatic(1, "ABC");
	c.clgID="600";
	CheckingStatic c1=new CheckingStatic(2, "DEF");
	c1.clgID="1700";
	c.display();
	c1.display();
}
}

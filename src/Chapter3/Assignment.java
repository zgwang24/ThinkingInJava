package Chapter3;

class Tank{
	int level;
}
public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 89;
		t2.level = 47;
		System.out.println("t1.level:" + t1.level + " t2.level:" + t2.level);
		// ÒýÓÃ
		// t1 = t2;
		t1.level = t2.level; 
		System.out.println("t1.level:" + t1.level + " t2.level:" + t2.level);
		t1.level = 100;
		System.out.println("t1.level:" + t1.level + " t2.level:" + t2.level);
	}
}

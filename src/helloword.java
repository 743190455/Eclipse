
// Fig 2-6 Welcome4.java
import javax.swing.JOptionPane;

class A {
	String Name;

	public void setName() {
		Name = "北京";

	}

}

public class helloword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World !";
		String str2 = "Lihaitao";
		String str3 = "wangjie";
		// System.out.print("Hello World");
		// A a = new A();
		/*
		 * a.Name = "中华人民共和国";
		 */
		// a.setName();
		// String str = a.Name;
		// System.out.print(str);
		String Number;
		Number = JOptionPane.showInputDialog("Enter Number");
		int Number1;
		Number1 = Integer.parseInt(Number);
		if (Number1 > 100)
			JOptionPane.showMessageDialog(null, str + '\n' + Number + '\n' + str2);
		if (Number1 < 100) {
			int sum = 0;
			for (int num = Number1; num <= 100; num += 2)
				sum += num;

			JOptionPane.showMessageDialog(null, str + '\n' + sum + '\n' + str3);
		}
		System.exit(0);

	}

}

package FormatTest;

public class FormatTest1 {

	public static void main(String[] args) {
		String name ="�ȴ���";
		int score  =100;
		
		System.out.println(name+"���� ������ "+ score+"�Դϴ�.");
		String s = String.format("%s���� ������ %d�Դϴ�.", name,score);
		System.out.printf("%s %d",name,score);
	}
}

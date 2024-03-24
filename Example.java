import java.util.*;

class Example {
	public static void main(String args[]) {
		int x = 100;
		{
			int y = 200;
			x++;
			y++;
			System.out.println(x + " " + y); // 101 201
		}

		{
			int y = 200;
			x++;
			y++;
			System.out.println(x + " " + y);// 102 201
		}
		{
			int y = 200;
			x++;
			y++;
			System.out.println(x + " " + y);// 103 201
		}
		{
			int y = 200;
			x++;
			y++;
			System.out.println(x + " " + y);// 104 201
		}
	}
}

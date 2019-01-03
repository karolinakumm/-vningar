
public class Övn3_17 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);//10
		System.out.println(++b);//21
		System.out.println(++a + ++a);//12+13
		System.out.println(b++ + b++);//21+22
		System.out.println(b-- + b--);//23+22
		System.out.println(b++ + a++ - c-- + c--);//21+13-30+29
	}

}

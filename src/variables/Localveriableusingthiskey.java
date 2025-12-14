package variables;


class Demo {
    int x = 20;

    void show() {
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
    }
}

public class Localveriableusingthiskey {

	public static void main(String[] args) {
		
        new Demo().show();
	}

}

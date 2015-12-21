import java.util.ArrayList;
//D0240009
public class Question {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz p = new problem("a+b=?");
		p.showquiz();
	}

}

interface quiz {
	abstract void showquiz();
}

class problem implements quiz {
	String description;
	public problem(String desc) {
		this.description = desc;
	}
	public void showquiz() {
		System.out.println("sentence");
	}
}

class paper implements quiz {
	ArrayList<quiz> q = new ArrayList<quiz>();
	
	public void showquiz() {
		System.out.println("sentence2");
	}
}
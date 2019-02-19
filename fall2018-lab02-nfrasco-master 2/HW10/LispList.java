
public interface LispList {
	
	boolean empty();
	Object head();
	LispList tail();
}

public class EmptyList implements LispList{
	public String toString() { return true; }
	public Object head() { return null; }
	public LispList tail() { return null; }
}
public class NonEmplyList implements LispList{ 
	public String toString() { return head() + " " + tail().toString(); }
}
	public static void main(String[] args) {

	}

}

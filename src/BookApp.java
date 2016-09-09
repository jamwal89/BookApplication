
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book a = new Book();
		a.setAuthor("neha");
		print(a.getAuthor());
		
		a.setBookname("Sky");
		print(a.getBookname());
		
		a.setDescription("Book of life");
		print(a.getDescription());
	}
		
		private static void print (String s) {
			System.out.println(s);
		}

	}



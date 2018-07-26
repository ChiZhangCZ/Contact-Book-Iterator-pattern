package contactIterator;

public class ContactIteratorTest {
	
	public static void main(String[] args) {
		
		ContactPage cp = new ContactPage();
		cp.addContact(new Contact("Cory","Jackson","0161 755 3171"));
		cp.addContact(new Contact("Andrew","Cole","07856 783 567"));
		cp.addContact(new Contact("Aaron","Smith","0161 902 2321"));
		cp.addContact(new Contact("Chris","Hunter","07929 345 221"));
		
		Iterator i = cp.getIterator("C");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

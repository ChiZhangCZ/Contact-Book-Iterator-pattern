package contactIterator;

import java.util.ArrayList;

public class ContactPage{
	
	private ArrayList<Contact> contacts = new ArrayList<Contact>(); 
	
	
	
	public void addContact(Contact contact) {
		
		contacts.add(contact);
		
	}
	
//	public Iterator getIterator() {
//		return new ContactIterator();
//	}
//	
//	private class ContactIterator implements Iterator{
//		
//		private int index;
//		
//		public boolean hasNext(){
//			if(index < contacts.size()) {
//				return true;
//			}
//			return false;
//		}
//		
//		public Contact next() {
//			return contacts.get(index++);
//		}
//		
//	}

	
	
	public Iterator getIterator( String firstNameStart) {
		return new ContactIterator(firstNameStart);
	}
	
	private class ContactIterator implements Iterator{
		
		private String firstNameStart;
		private int index;
		
		public ContactIterator(String firstNameStart) {
			this.firstNameStart = firstNameStart;
		}

	    @Override
	    public boolean hasNext() {
		    while(index < contacts.size()) {
		    	if(contacts.get(index).getFirstName().startsWith(firstNameStart)) {
		    		return true;
		    	}
		    	index++;
		    }
		    return false;
	    }

	    @Override
	    public Contact next() {
		 
		    return contacts.get(index++);
	    }
		
	}

	
	
}


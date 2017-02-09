package seedu.addressbook.data.person;

/**
 * Super class of address, email and phone
 * contain two common attributes namely value and isPrivate
 * @author benwong
 *
 */
public class Contact {
	
	public final String value;
	private boolean isPrivate;
	
	public Contact(String value, boolean isPrivate) {
		this.value = value;
		this.isPrivate = isPrivate;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}

}

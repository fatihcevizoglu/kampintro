
public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPaswword());
	}
	
	public void adds(User[] users) {
		for(User user : users) {
			add(user);
		}
	}

}

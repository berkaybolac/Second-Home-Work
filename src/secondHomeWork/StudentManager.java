package secondHomeWork;

public class StudentManager extends UserManager{
	
	public void Add(User user)
	{
		System.out.println("Sn. " + user.getName() + " hoş geldiniz." );
	}
	
	public void Delete(User user)
	{
		System.out.println("Sn. " + user.getName() + " kaydınız silinmiştir..." );
	}
	
	public void GetAll(User[] users)
	{
		for(User user: users)
		{
			System.out.println(user.getName() +  " Listelenmiştir.");
		}
	}
	
	
	public void Update(User user)
	{
		System.out.println("Sn. " + user.getName() + " kaydınız güncellenmiştir..." );
	}
	
	public void GetById(User user)
	{
		System.out.println(user.getID() + " .ID 'li kayıt." );
	}
	
	public void SearchUserByProperty(User user)
	{
		System.out.println(user.getName() + " adlı kayıt bulunmuştur." );
	}

}

class  LibraryRunner{
	
	
	public static void main(String[] a){
		Library library = new Library();
		
		
		Book book = new Book();
		
		book.title = "Java: The Complete Reference";
		book.author = "Herbert Schildt";
		book.category ="Programming";
			
		
		Member member = new Member();
		member.name = "sneha";
		member.email = "sneha@gmail.com";
		member.phoneNumber = 7865435678L;
		
	
		Member member1 = new Member();
		
		member1.name = "komala";
		member1.email = "komala@gmail.com";
		member1.phoneNumber = 7865435978L;
		
		Member javaMembers[] = {member,member1};
		book.members = javaMembers;
		
		Book book1 = new Book();
		
		book1.title = "Atomic Habits";
		book1.author = "James Clear";
		book1.category ="Self-Help";
		
		Member member2 = new Member();
		
		member2.name = "Dileep";
		member2.email = "Dileep@gmail.com";
		member2.phoneNumber = 7865235978L;
		
		
		Member member3 = new Member();
		
		member3.name = "Pradeep";
		member3.email = "Pradeep@gmail.com";
		member3.phoneNumber = 7805235978L;
		
		Member atomicHabitsMembers[] = {member2,member3};
		book1.members = atomicHabitsMembers;
		
		Book booksOfLibrary[] = {book,book1};
		library.books = booksOfLibrary;
		
		
		library.getLibraryDetails();
		
		
		
		
		
		
	}


}
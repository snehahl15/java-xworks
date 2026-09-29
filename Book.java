class Book{
	
	String title;
    String author;
    String category;
    Member members[];
	
	
	public void getBookDetails(){
		
		System.out.println("----------------------------");
        System.out.println("BOOK DETAILS");
        System.out.println("----------------------------");
		
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("Book Category:"+category);
		
		
		
		
		for( Member member:members){
			member.getMemberDetails();
			
			
			
		}
	}

}
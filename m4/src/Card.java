class Card {
	private String Title;
	private String Author;
	private String Subject;

	public Card(String Title,String Author,String Subject) {
	
		this.Title=Title;
		this.Author=Author;
		this.Subject=Subject;

	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getSubject() {
		return Subject;
	}
    public void setSubject(String subject) {
	    Subject = subject;
} 

}


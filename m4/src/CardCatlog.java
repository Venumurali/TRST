import java.util.Scanner;

class CardCatlog
{

	Card Cards[];
	Card CardbyTitle[];
	Card Author[];
	Card subject[];
	int Cardcount=0;

	CardCatlog(){
		Cards=new Card[10];
		CardbyTitle=new Card[10];
		Author=new Card[10];
        subject=new Card[10];
	    Cardcount=0;
	}
public void addCard(Card d){
   
	if (Cardcount==0)
	{
			Cards[0]=d;
			CardbyTitle[0]=d;
			Author[0]=d;
		    subject[0]=d;
	}
	else{
		Cards[Cardcount]=d;
		SetCardbyTitlelist(d);
	}
    Cardcount++;
}
public void SetCardbyTitlelist(Card d){
	int f=0;
	for(int i=0;i<Cardcount;i++){
		int j=Cardcount-1;
		if(CardbyTitle[i].getTitle().compareTo(d.getTitle())>0){
			while(j>=i){
			CardbyTitle[j+1]=CardbyTitle[j];
			display();
			j--;
			}
			CardbyTitle[i]=d;
			f=1;

			break;
		}
	}

	if(f==0);
		  CardbyTitle[Cardcount]=d;
}

public void del(String title){
	  for(int i=0;i<Cardcount;i++){
		if(CardbyTitle[i].getTitle().compareTo(title)==0)
		{   int j=i;
			while(j<Cardcount-1){
			CardbyTitle[j]=CardbyTitle[j+1];
			j++;
			}
			break;
	  }

	}
	Cardcount--;
}

public void display(){
	for(int i=0;i<Cardcount;i++)
	System.out.println(Cards[i].getAuthor()+" "+CardbyTitle[i].getTitle()+" "+Cards[i].getSubject());
	// System.out.println("CardbyTitle");
	// for(int i=0;i<Cardcount;i++)
	// System.out.println(CardbyTitle[i].getTitle());
}
public static void main(String[] args){
	CardCatlog dt=new CardCatlog();
	Scanner sc=new Scanner(System.in);
	int ch;

	do{
		System.out.println("1.add book,2.display,3.delete");
		ch=sc.nextInt();
		switch(ch){
			case 1:
			  System.out.println("enter title");
			  String title=sc.next();
			  System.out.println("enter Author");
			  String author=sc.next();
              System.out.println("enter subject");
			  String subject=sc.next();
			Card ct=new Card(title, author, subject);
			   dt.addCard(ct);
			   break;

			case 2:dt.display();
				 break;
			
				 
			case 3:System.out.println("enter  title");
				   String t=sc.next();
				   dt.del(t);
			  
			case 4:System.out.println("enter  Author");
				   String v=sc.next();
				   dt.setAnAuthor(v);
				   
		}}
		while(ch!=5);
	  
}
}

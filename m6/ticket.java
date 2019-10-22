class Ticket{
 private String movie_name;
 private String ticketid;
 private int seat_no;
 private double Cost;
 private String Typeofticket;

    public Ticket(String name,String id,String Seat,String type,String cost) {
         movie_name=name;
         ticketid=id;
         seat_no=Seat;
         Typeofticket=type;
         Cost=cost;
        }
  
   
    public String toString(){
        return("welcome to the show"+moviename+""+ticketid+""+"your"+seat_no+"class"+Typeofticket);
    }

    
    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getTicketid() {
        return ticketid;
    }

   
    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

   
    public int getSeat_no() {
        return seat_no;
    }

  
    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

 
    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    
    public String getTypeofticket() {
        return Typeofticket;
    }

    
    public void setTypeofticket(String Typeofticket) {
        this.Typeofticket = Typeofticket;
    }

}
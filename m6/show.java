import java.sql.Time;
import java.util.Date;

import javax.lang.model.util.ElementScanner6;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

class Show {
    Seat ticket[][];
    int i, j;
    int Total_no_of_count;
    int available_seats;

    show(){
     ticket=new Seat[4][4];
     for (int i = 0; i < 4; i++) {
         ticket[i]=new Seat[4];

     }
     for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
             ticket[i][j]=new Seat();
         }
       

    }
     Total_no_of_count=16;
     available_seats=16;
    }

    public void showlayout() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                if (ticket[i][j] == false) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" X ");
                }
            System.out.println("");
        }
    }

    public void bookticket(int r, int c) {
        r--;
        c--;
        for (int i = 0; i < count; i++) {
            if (ticket[r][c]==true) {
                System.out.println("select other seats");
            } else {
               
                ticket[i][j].setBooked("true");
                Total_no_of_count--;
                showlayout();
                
            }
           
        }
    }

    // public void displaytimings() {
    //     System.out.println(" Morning_show=9:30 AM,Matniee_show=2:30 PM,First_show=5:30 PM,Second_show=10:30 PM");
    // }

    // public selecttiming(Show s){
    //     System.out.println("1,2,3,4");
    //     do {
    //         switch (ch) {
    //         case 1:String Morning_show;
    //         bookticket(r, c);
    //         tot
    //         break;
    //         case 2:String Matniee_show;
    //         break;
    //         case 3:String First_show;
    //         break;
    //         case 4:String Second_show;
    //         break;
    //     }
    // } 
    // while (ch != 5);   
    // }
}

class screens {
    Show screening[];
    String Movie;
    Show morningshow;

    screens() {
        screening = new Show[4];
        Moive="Syeraa";
        Morningshow=new Show();
    }

    public void menuofshows() {
        System.out.println("1. show layout,2. book ticket,3,4");
        do {
            switch (ch) {
            case 1:
              System.out.println(Moive);
               morningshow.showlayout();

                break;
            case 2:
                System.out.println("enter row and coll: ");
                int r=sc.nextInt();
                int c=sc.nextInt();
                morningshow.bookticket(r, c);
                morningshow.showlayout();
                break;
            case 3:
                String valmiki;
                break;
            case 4:
                String evaru;
                break;
            }
        } while (ch != 5);
    }
}


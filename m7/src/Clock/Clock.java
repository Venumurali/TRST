/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */
package Clock;
public class Clock {
    int HH;
    int MM;
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    public Clock(int h, int m) {
         HH=h;
         MM=m;


    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        String[] s1=s.split(":",-2);
        HH = Integer.parseInt(s1[0]); 
        MM = Integer.parseInt(s1[0]); 
        

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
    if(HH<10 && MM<10){
        return("0"+HH+":"+"0"+MM);
    }
    if(HH<10){
        return("0"+HH+":"+MM);
    }
    if(MM<10){
        return (HH+":"+"0"+MM);
       }
    else
    return(HH+":"+MM);

    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if(that.HH>HH) return true;
        return this.MM<that.MM;
        
    }

    private void check() {
        
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if(MM==60){
            MM=00;
            HH++;
        }
        else if(HH==00 && MM==60)
        {
           HH=00;
           MM++;
        }
      else{
          MM++;
      }  
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        int m=(delta/60);
        int h=(delta/60);
        if(())
        
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}
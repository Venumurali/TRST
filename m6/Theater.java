public class Theater {
    // screens[] multiplex;
    // int Total_screens;
     Screen multiplex;
     public Theater() {
        multiplex = new Screen();
     }
    //     Total_screens = 4;
    // }
public static void main(String args[])
{
    Theater t = new Theater();
    t.multiplex.menuofshows();

}
}
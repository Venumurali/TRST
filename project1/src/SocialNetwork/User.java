import java.util.*;

public class User {
    private String Username;
    private String[] Userconnection;
    private int connections;

  

    public User(String Username,String Userconnection,int connections) {
        this.Username=Username;
        this.Userconnection=Userconnection;
        this.connections=connections;
    }

    
    public String getUsername() {
        return Username;
    }

    
    public void setUsername(String Username) {
        this.Username = Username;
    }

   
    public String getUserconnection() {
        return USerconnection;
    }

    
    public void setUserconnection(String Userconnection) {
        this.Userconnection = Userconnection;
    }

   
    public int getConnections() {
        return connections;
    }

   
    public void setConnections(int connections) {
        this.connections = connections;
    }


public String toString(){
    return "User="+User+",UserConnections="+ Userconnection +",connections="+connections+"]";
}
}
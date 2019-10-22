package Todolist;

import java.util.Date;
class Task{

    private String Name;
    private String Description;
    private Date Due_date;
    private String Status;


    public Task(String name,String description,Date due_date,String status) {
        Name=name;
        Description=description;
        Due_date=due_date;
        Status=status;
    }
        public String getName() {
        return Name;
    }

      public void setName(String Name) {
        this.Name = Name;
    }

      public String getDescription() {
        return Description;
    }

      public void setDescription(String Description) {
        this.Description = Description;
    }

        public Date getDue_date() {
        return Due_date;
    }
    
      public void setDue_date(Date Due_date) {
        this.Due_date = Due_date;
    }

       public String getStatus() {
        return Status;
    }
    
      public void setStatus(String Status) {
        this.Status = Status;
    }

    public String toString(){
        return(Name+" "+Description+" "+Due_date+" "+Status);
    }

}

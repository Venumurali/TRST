package Todolist;

import java.io.ObjectInputFilter.Status;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Scanner;

class Todolist1 {
    Task ToDo[];
    int count;

    Todolist1() {
        ToDo = new Task[10];
        count = 0;
    }

    public void addTask(Task c) {
        ToDo[count] = c;
        count++;
    }

    public void deleteTask(String t) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getName() != null && ToDo[i].getName().equals(t)) {
                for (int j = i; j < count - 1; j++) {
                    ToDo[i] = ToDo[i - 1];
                }
                break;
            }
        }
        count--;
    }

    public void updatetask(String Name, String Status) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getName().equals(Name)) {
                ToDo[i].setStatus(Status);
            }
        }
    }

    public void StatusDisplay(String Name) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getName().equals(Name)) {
                System.out.println(ToDo[i].getStatus());
            }

        }
    }

    public void overdue(Date date) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getDue_date().before(date)) {
                if (ToDo[i].getStatus().equals("pending") || ToDo[i].getStatus().equals("incomplete")) {
                    System.out.println(ToDo[i]);
                }
               
            }
        }
        return;
    }

    public void pending(String pending, String incomplete) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getStatus().equals(pending) || ToDo[i].getStatus().equals(incomplete)) {
                System.out.println(ToDo[i]);
            }
        }
    }

    public void Datetasks(Date date) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getDue_date().equals(date)) {
                System.out.println(ToDo[i]);
            }
        }
    }

    public Task findTask(String Name) {
        for (int i = 0; i < count; i++) {
            if (ToDo[i].getName().equals(Name)) {
                return (ToDo[i]);
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(ToDo[i]);
        }
    }

    public static void main(String[] args) throws ParseException {
        Todolist1 v = new Todolist1();
        Scanner c = new Scanner(System.in);
        int ch;
        do {
            System.out.println(
                    "1.add Task,2.display,3.delete,4.Updatetask,5.Status display,6.Date over_due tasks,7.Pending tasks,8.Particular tasks,9.Find a Task");
            ch = c.nextInt();
            switch (ch) {
            case 1:
                System.out.println("Name");
                String Name = c.next();
                System.out.println("Description");
                String Description = c.next();
                System.out.println("Due_date");
                System.out.println("Enter date in dd/MM/yyyy  format: ");
                String dd = c.next();
                SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");

                // Creating the date object based on specific date using SimpleDateFormat
                // object.
                Date dtd = ff.parse(dd);

                Date Due_date = dtd;
                System.out.println("Status");
                String Status = c.next();
                Task t = new Task(Name, Description, Due_date, Status);
                v.addTask(t);
                break;
            case 2:
                v.display();
                break;
            case 3:
                String tit = c.next();
                v.deleteTask(tit);
                break;
            case 4:
                String up = c.next();
                String upstat = c.next();
                v.updatetask(up, upstat);
                break;

            case 5:
                String name = c.next();
                v.StatusDisplay(name);
                break;

            case 6:
                System.out.println("Enter date in dd/MM/yyyy  format: ");
                String d = c.next();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

                // Creating the date object based on specific date using SimpleDateFormat
                // object.
                Date date = formatter.parse(d);

                v.overdue(date);
                break;
            case 7:
                String St = c.next();
                String St1 = c.next();
                v.pending(St, St1);
            case 8:
                System.out.println("Enter date in dd/MM/yyyy  format: ");
                d = c.next();
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

                // Creating the date object based on specific date using SimpleDateFormat
                // object.
                Date dt = f.parse(d);

                v.Datetasks(dt);
            case 9:
                String n = c.next();
                v.findTask(n);

            }
        } while (ch != 10);

    }
}

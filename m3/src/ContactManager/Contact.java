/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */
package ContactManager;
//  Your code goes here... For Contact class
class Contact
{
    private String Name;
    private String Email;
    private String phoneNumber;
    
      Contact(){
          this.Name=Name;
          this.Email=Email;
          this.phoneNumber=phoneNumber;
      }
      

    
    public String getName() {
        return Name;
    }
        public void setName(String Name) {
        this.Name = Name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String tostring(){
        return({ "Name"+ "Email "+ "PhoneNumber" });
    }

}

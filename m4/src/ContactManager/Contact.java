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
    private String PhoneNumber;
	
      Contact(String Name,String Email,String PhoneNumber){
          this.Name=Name;
          this.Email=Email;
          this.PhoneNumber=PhoneNumber;
      }
      

    
    public String getName() {
        return this.Name;
    }
        public void setName(String Name) {
        this.Name = Name;
    }
    public String getEmail() {
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "{ Name = "+ Name +", Email = " +Email + ", Phone Number = " + PhoneNumber+" }";
    }
    

}

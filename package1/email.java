package package1;
public class email {
    private String first_name;
    private String lastName;
    private String passWord;
    private String deparment;
    private int mailboxCapacity;
    private String alternateEmail;


    //constructor to receive names
    public email(String first_name, String lastName){
        this.first_name=first_name;
        this.lastName=lastName;
        System.out.println("Email created " + this.first_name+" "+this.lastName);
    }


}


public class Person {
    private int personId;
    private String name;
    private long mobileNo;
    private String email;

    public Person(int personId, String name, long mobileNo, String email) {
        this.personId = personId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    //Getters For all Variables
    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    // Display Basic Info Method
    public void display(){
        System.out.println("\n----------Baisc Info--------");
        System.out.println("Person Id : "+this.personId);
        System.out.println("Person's Name : "+this.name);
        System.out.println("Person's Mobile Number : "+this.mobileNo);
        System.out.println("Person's Email  : "+this.email);
    }
}

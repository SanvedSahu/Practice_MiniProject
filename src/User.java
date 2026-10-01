import java.util.ArrayList;

public class User extends Person{

    // currently below classes can store object of any kind but later we want specifically to store pet and booking objects only
    private ArrayList petList;
    private ArrayList bookingList;

    // Constructor with Parameterized super()
    public User(int personId, String name, long mobileNo, String email) {
        super(personId, name, mobileNo, email);
//        this.petList = null; ❌ trying to point to nothing later will give nullPointerException when we add pet
//        this.bookingList = null; ❌
        this.petList = new ArrayList<>();
        this.bookingList = new ArrayList<>();

    }

    public void addPets(){}

    public void viewPets(){}

    public void removePets(){}

    public void bookService(){}

    public void cancelBooking(){}

    public void viewBookings(){}

    public void giveReview(){}


}

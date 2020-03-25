import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public int countGuests() {
        return this.guests.size();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public Guest removeGuest(Guest guest) {
        if (this.guests.contains(guest)) {
            this.guests.remove(guest);
            return guest;
        }
        return null;
    }
}

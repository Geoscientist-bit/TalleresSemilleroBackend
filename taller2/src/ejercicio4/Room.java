package ejercicio4;

public class Room {
    private String typeRoom;    
    private int number;
    private boolean disponibility;

    public Room(int number) {
        this.number = number;
        this.disponibility = true;
    }

    public void reserve() {
        disponibility = false;
    }

    public void cancelReserve() {
        disponibility = true;
    }
    

    public String getTypeRoom() {
        return typeRoom;
    }

   public int getNumber() {
    return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }
    
}

package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    //ArrayList<Room> rooms = new ArrayList<>();
    private String nameHot;
    private List<Room> rooms;

    public Hotel(String nameHotel, int numberRoom) {
        this.nameHot = nameHotel;
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberRoom; ++i) {
            rooms.add(new Room(i));
        }
    }

    public List<Room> getRoomsDisponibilityList() {
        List<Room> roomsDisponibilities = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isDisponibility()) {
                roomsDisponibilities.add(room);
            }
        }
        return roomsDisponibilities;
    }

    public String getNameHot() {
        return nameHot;
    }
}

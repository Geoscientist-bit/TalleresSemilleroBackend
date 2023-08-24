package ejercicio4;

public class Reserve {
    private Hotel hotel;
    private Room room;
    private Client client;

    public Reserve(Hotel hotel, Room room, Client client) {
        this.hotel = hotel;
        this.room = room;
        this.client = client;
        room.reserve();
    }

    public void cancelReserve() {
        room.cancelReserve();
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Room getRoom() {
        return room;
    }

    public Client getClient() {
        return client;
    }
    
    
}

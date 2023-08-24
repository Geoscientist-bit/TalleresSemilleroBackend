/*
 * 4. Sistema de Reservas de Hotel:

Crear un sistema de reservas de hotel que permita a los clientes corporativos reservar múltiples habitaciones en diferentes hoteles para hospedar a su personal. Debes tener clases como Hotel, Habitación, Cliente, y Reserva. Implementa métodos para listar habitaciones disponibles, realizar reservas y cancelar reservas. Al final de la ejecución del programa debe mostrar la siguiente info:

●	Nombre de la empresa que reservó
●	Nombre y cédula de quien ocupará cada habitación y número de la habitación que ocupará. Esto para cada hotel.

 */

package ejercicio4;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SystemReservHotel {
    public static void main(String[] args) {
        // Client client1 = new Client("jhon edison", "123456", "Preficient");
        
        // System.out.println(client1.getCompany());

        //we create two hotels

        Hotel hotel1 = new Hotel("Intercontinental", 5);
        Hotel hotel2 = new Hotel("Dancartoon", 3);

        //we create two clients

        Client client1 = new Client("Jhon Edison", "123456", "Mercado Libre");
        Client client2 = new Client("marcela castellanos", "7890", "Casa Blanca");

        //we make two reserveations

        Reserve reserve1 = new Reserve(hotel1, hotel1.getRoomsDisponibilityList().get(0), client1);
        Reserve reserve2 = new Reserve(hotel2, hotel2.getRoomsDisponibilityList().get(0), client2);
        Reserve reserve3 = new Reserve(hotel1, hotel1.getRoomsDisponibilityList().get(0), client1);

        //we create the reservation for each hotel 

        Map<Hotel, List<Reserve>> reserveForHotel = new HashMap<>();
        reserveForHotel.put(hotel1, new ArrayList<>());
        reserveForHotel.put(hotel2, new ArrayList<>());

        //

        reserveForHotel.get(hotel1).add(reserve1);
        reserveForHotel.get(hotel2).add(reserve2);
        reserveForHotel.get(hotel1).add(reserve3);

        for (Hotel hotel : reserveForHotel.keySet()) {
            System.out.println("hotel " + hotel.getNameHot());
            for (Reserve reserve : reserveForHotel.get(hotel)) {
                System.out.println("company: " + reserve.getClient().getCompany());
                System.out.println("Name: " + reserve.getClient().getName());
                System.out.println("id: " + reserve.getClient().getNumId());
                System.out.println(" room number : " + reserve.getRoom().getNumber());
            }
            System.out.println();
        }

    }
}

import java.util.HashMap;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1TubeLineStations {



        public static void main(String[] args) {
            String s;

            do{
                HashMap<String, String> zone = new HashMap<>();
                zone.put("Paddington", "Bakerloo/Circle/District/Hammersmith & City");
                zone.put("Edgware Road", "Bakerloo/Circle/District/Hammersmith & City");
                zone.put("Marlyebone", "Bakerloo");
                zone.put("Baker Street", "Bakerloo/Jubilee/Metropolitan/Hammersmith & City");
                zone.put("Oxford Circus", "Bakerloo/Central/Victoria");
                zone.put("Piccadilly Circus", "Bakerloo");
                zone.put("Charing Cross", "Bakerloo/Northen");
                zone.put("Embankment", "Bakerloo/Northern/Circle");
                zone.put("Waterloo", "Bakerloo/Jubliee/Northern");
                zone.put("Lambeth North", "Bakerloo");
                zone.put("Elephant & Castle", "Bakerloo/Northern");
                zone.put("Notting Hill Gate", "Central/Circle/District");
                zone.put("Queensway", "Central");
                zone.put("lancaster Gate", "Central");
                zone.put("Marble Arch", "Central");
                zone.put("Bond Street", "Central/Jubilee");
                zone.put("Holborn", "Central/Northern/Piccadilly");
                zone.put("Tottenum Court Road", "Central/Northern");
                zone.put("Chancery Lane", "Central");
                zone.put("StPaul", "Central");
                zone.put("Bank", "Central/Northern");
                zone.put("Liverpool Street", "Central/Metropolitan/Circle/Hammersmith & City");
                zone.put("GreenPark", "Jubliee/Piccadilly");
                zone.put("Westminster", "Jubliee/Circle");
                zone.put("Southwark", "Jubliee");
                zone.put("London bridge", "Jubliee/Northen");
                zone.put("Euston", "Northern/Victoria");
                zone.put("King's Cross", "Northern/Piccadilly/Metropolitan/Hammersmith & City/Victoria");
                zone.put("Angel", "Northern");
                zone.put("OldStreet", "Northern");
                zone.put("Moorgate", "Northern/Metropolitan/Hammersmith & City");
                zone.put("Borough", "Northern");
                zone.put("Warren Street", "Northern/Victoria");
                zone.put("Goodge Street", "Northern");
                zone.put("Lecicester Square", "Northern/Piccadilly");
                zone.put("Earl's Court", "Piccadilly/District");
                zone.put("Gloucester Road", "Piccadilly/Circle/District");
                zone.put("South Kensington", "Piccadilly/Circle/District");
                zone.put("Knights Bridge", "Piccadilly");
                zone.put("Hyde Park Corner", "Piccadilly");
                zone.put("Covent Garden", "Piccadilly");
                zone.put("Russel Square", "Piccadilly");
                zone.put("Great PortLand", "Metropolitan/Hammersmith & City");
                zone.put("Euston Square", "Metropolitan/Hammersmith & City");
                zone.put("Farringdon", "Metropolitan/Hammersmith & City");
                zone.put("Barbican", "Metropolitan/Hammersmith & City");
                zone.put("Aldgate", "Metropolitan/Circle");
                zone.put("Bayswater", "Circle/District");
                zone.put("HighStreet Kensington", "Circle/District");
                zone.put("Sloane Square", "Circle");
                zone.put("Victoria", "Circle/Victoria");
                zone.put("St Jame's Park", "Circle");
                zone.put("Temple", "Circle");
                zone.put("Blackfrier", "Circle");
                zone.put("Mansion House", "Circle");
                zone.put("Cannon Street", "Circle");
                zone.put("Monument", "Circle");
                zone.put("Tower Hill", "Circle/District");
                zone.put("Tower", "Circle");
                zone.put("Aldgate East", "Circle/Hammersmith & City");
                zone.put("Vauxhall", "Victoria");

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Zone 1 station name : ");
                String a = sc.nextLine();


                for (String station : zone.keySet()) {
                    if (a.equalsIgnoreCase(station)) {
                        System.out.println("This station is in Zone 1 ");
                        System.out.println("The tube line passing through station " + a + " is : " + zone.get(station));
                    }
                }
                System.out.print("Do you want to check another station name? Y/N : ");
                s = sc.nextLine();
            }while (s.equalsIgnoreCase("Y"));

        }
    }


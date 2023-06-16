import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Movie {
    private String name;
    private List<Date> sessionTimes;

    public Movie(String name) {
        this.name = name;
        this.sessionTimes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSessionTime(Date sessionTime) {
        sessionTimes.add(sessionTime);
    }

    public List<Date> getSessionTimes() {
        return sessionTimes;
    }
}

class Salon {
    private String name;
    private int seatCapacity;

    public Salon(String name, int seatCapacity) {
        this.name = name;
        this.seatCapacity = seatCapacity;
    }

    public String getName() {
        return name;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }
}

class Session {
    private Movie movie;
    private Salon salon;
    private Date dateTime;

    public Session(Movie movie, Salon salon, Date dateTime) {
        this.movie = movie;
        this.salon = salon;
        this.dateTime = dateTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Salon getSalon() {
        return salon;
    }

    public Date getDateTime() {
        return dateTime;
    }
}

class Reservation {
    private Session session;
    private String customerName;
    private int numberOfTickets;
    private String seatNumber;

    public Reservation(Session session, String customerName, int numberOfTickets, String seatNumber) {
        this.session = session;
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
        this.seatNumber = seatNumber;
    }

    public Session getSession() {
        return session;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}

public class CinemaTicketProgram {
    public static void	 main(String[] args) {
        // Creating movies
        Movie movie1 = new Movie("Spider-Man: Across The Spider-Verse");
        Movie movie2 = new Movie("Guardians of the Galaxy Vol. 3");
        Movie movie3 = new Movie("The Boogeyman");
        Movie movie4 = new Movie("Prestij Meselesi");
        Movie movie5 = new Movie("Transformers: Rise of the Beasts");

        // Set session times for movies on June 20th
        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, Calendar.JUNE, 20);

        // Set session times for movie1
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        Date sessionTime1 = calendar.getTime();
        movie1.addSessionTime(sessionTime1);

        calendar.set(Calendar.HOUR_OF_DAY, 16);
        Date sessionTime2 = calendar.getTime();
        movie1.addSessionTime(sessionTime2);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date sessionTime3 = calendar.getTime();
        movie1.addSessionTime(sessionTime3);

        // Set session times for movie2
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        Date sessionTime4 = calendar.getTime();
        movie2.addSessionTime(sessionTime4);

        calendar.set(Calendar.HOUR_OF_DAY, 16);
        Date sessionTime5 = calendar.getTime();
        movie2.addSessionTime(sessionTime5);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date sessionTime6 = calendar.getTime();
        movie2.addSessionTime(sessionTime6);

        // Set session times for movie3
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        Date sessionTime7 = calendar.getTime();
        movie3.addSessionTime(sessionTime7);

        calendar.set(Calendar.HOUR_OF_DAY, 16);
        Date sessionTime8 = calendar.getTime();
        movie3.addSessionTime(sessionTime8);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date sessionTime9 = calendar.getTime();
        movie3.addSessionTime(sessionTime9);

        // Set session times for movie4
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        Date sessionTime10 = calendar.getTime();
        movie4.addSessionTime(sessionTime10);

        calendar.set(Calendar.HOUR_OF_DAY, 16);
        Date sessionTime11 = calendar.getTime();
        movie4.addSessionTime(sessionTime11);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date sessionTime12 = calendar.getTime();
        movie4.addSessionTime(sessionTime12);

        // Set session times for movie5
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        Date sessionTime13 = calendar.getTime();
        movie5.addSessionTime(sessionTime13);

        calendar.set(Calendar.HOUR_OF_DAY, 16);
        Date sessionTime14 = calendar.getTime();
        movie5.addSessionTime(sessionTime14);

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date sessionTime15 = calendar.getTime();
        movie5.addSessionTime(sessionTime15);

        // Creating salons
        Salon salon1 = new Salon("Salon 1", 100);
        Salon salon2 = new Salon("Salon 2", 100);
        Salon salon3 = new Salon("Salon 3", 100);
        Salon salon4 = new Salon("Salon 4", 100);
        Salon salon5 = new Salon("Salon 5", 100);

        // User input
        Scanner scanner = new Scanner(System.in);

        // Select a movie
        System.out.println("Available Movies:");
        System.out.println("1. " + movie1.getName());
        System.out.println("2. " + movie2.getName());
        System.out.println("3. " + movie3.getName());
        System.out.println("4. " + movie4.getName());
        System.out.println("5. " + movie5.getName());
        int movieChoice;
        do {
            System.out.print("Select a movie (1-5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            movieChoice = scanner.nextInt();
        } while (movieChoice < 1 || movieChoice > 5);

        Movie selectedMovie;
        switch (movieChoice) {
            case 1:
                selectedMovie = movie1;
                break;
            case 2:
                selectedMovie = movie2;
                break;
            case 3:
                selectedMovie = movie3;
                break;
            case 4:
                selectedMovie = movie4;
                break;
            case 5:
                selectedMovie = movie5;
                break;
            default:
                selectedMovie = movie1; // Default to movie1
        }

        // Select a salon
        System.out.println("\nAvailable Salons:");
        System.out.println("1. " + salon1.getName());
        System.out.println("2. " + salon2.getName());
        System.out.println("3. " + salon3.getName());
        System.out.println("4. " + salon4.getName());
        System.out.println("5. " + salon5.getName());
        int salonChoice;
        do {
            System.out.print("Select a salon (1-5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            salonChoice = scanner.nextInt();
        } while (salonChoice < 1 || salonChoice > 5);

        Salon selectedSalon;
        switch (salonChoice) {
            case 1:
                selectedSalon = salon1;
                break;
            case 2:
                selectedSalon = salon2;
                break;
            case 3:
                selectedSalon = salon3;
                break;
            case 4:
                selectedSalon = salon4;
                break;
            case 5:
                selectedSalon = salon5;
                break;
            default:
                selectedSalon = salon1; // Default to salon1
        }

        // Select a session
        List<Date> sessionTimes = selectedMovie.getSessionTimes();
        System.out.println("\nAvailable Sessions:");
        for (int i = 0; i < sessionTimes.size(); i++) {
            System.out.println((i + 1) + ". " + sessionTimes.get(i));
        }
        int sessionChoice;
        do {
            System.out.print("Select a session (1-" + sessionTimes.size() + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            sessionChoice = scanner.nextInt();
        } while (sessionChoice < 1 || sessionChoice > sessionTimes.size());

        Date selectedSessionTime = sessionTimes.get(sessionChoice - 1);

        // Make a reservation
        scanner.nextLine(); // Consume the newline character
        System.out.print("\nEnter customer name: ");
        String customerName = scanner.nextLine();

        int numberOfTickets;
        do {
            System.out.print("Enter number of tickets: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            numberOfTickets = scanner.nextInt();
            if (numberOfTickets <= 0 || numberOfTickets > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }
        } while (numberOfTickets <= 0 || numberOfTickets > 100);

        scanner.nextLine(); // Consume the newline character

        String seatNumber;
        do {
            System.out.print("Enter seat number: ");
            seatNumber = scanner.nextLine();
            if (!seatNumber.matches("\\d+") || Integer.parseInt(seatNumber) < 1 || Integer.parseInt(seatNumber) > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
            }
        } while (!seatNumber.matches("\\d+") || Integer.parseInt(seatNumber) < 1 || Integer.parseInt(seatNumber) > 100);

        Reservation reservation = new Reservation(new Session(selectedMovie, selectedSalon, selectedSessionTime),
                customerName, numberOfTickets, seatNumber);

        // Accessing reservation details
        System.out.println("\nReservation Details:");
        System.out.println("Movie: " + reservation.getSession().getMovie().getName());
        System.out.println("Salon: " + reservation.getSession().getSalon().getName());
        System.out.println("Session Time: " + reservation.getSession().getDateTime());
        System.out.println("Customer Name: " + reservation.getCustomerName());
        System.out.println("Number of Tickets: " + reservation.getNumberOfTickets());
        System.out.println("Seat Number: " + reservation.getSeatNumber());
        
     // Close the scanner
        scanner.close();
    }
}
// import java.util.*;

// class Car{

// private String carId;
// private String brand;
// private String model;
// private double basePricePerDay;
// private boolean isAvailable;

// public Car(String carId,String brand,String model,double basePricePerDay){
//     this.carId=carId;
//     this.brand=brand;
//     this.model=model;
//     this.basePricePerDay=basePricePerDay;
//     this.isAvailable=true;

// }

// public String getCarId(){
//     return carId;

// }
// public String getBrand(){
//     return brand;

// }
// public String getModel(){
//     return model;
// }

// public double  calculatePrice(int rentalDays){
//     return basePricePerDay*rentalDays;
// }
// public boolean isAvailable(){
//     return isAvailable;
// }
// public void rent(){
//     isAvailable=false;
// }
// public void returnCar() {
//     isAvailable = true;
// }




// }



// class Customer{
//     private String customerId;
//     private String name;
//     public Customer(String customerId,String name){
//         this.customerId=customerId;
//         this.name=name;
//     }


//     public String getCustomerId(){
//         return customerId;
//     }


//     public String getName(){
//         return name;
//     }



// }

// class Rental{

//    private Car car;
//    private Customer customer;
//    private int days;

//    public Rental(Car car,Customer customer,int days){
// this.car=car;
// this.customer=customer;
// this.days=days;
//    }


//    public Car getCar(){
//     return car;
//    }

//    public Customer getCustomer(){
//     return customer;
//    }
//    public int getDays(){
//     return days;
//    }



// }


// class CarRentalSystem{
// private List<Car>cars;
// private List<Customer>customers;
// private List<Rental>rentals;

// public CarRentalSystem(){
//     cars= new ArrayList<>();
//     customers= new ArrayList<>();
//     rentals= new ArrayList<>();
// }

// public void addCar(Car car){
//     cars.add(car);
// }

// public void addCustomer(Customer customer){
//     customers.add(customer);
// }


// public void rentCar(Car car ,Customer customer, int days){
//     if(car.isAvailable()){
//         car.rent();
//         rentals.add(new Rental(car, customer, days));
//     }
//     else{
//         System.out.println("Car is not available for rent...");
//     }
// }

// public void returnCar(Car car){
//     car.returnCar();
//     Rental rentalToRemove = null;
//     for(Rental rental:rentals){
//          if(rental.getCar()==car){
//             rentalToRemove=rental;
//             break;
//             } }

//     if (rentalToRemove!=null) {
//         rentals.remove(rentalToRemove);
//         System.out.println("Car returned sucessfully..");      
//     }
//     else{
//         System.out.println("Car was not rented...");
//     }
// }


// public void menu(){
//     Scanner sc = new Scanner(System.in);
//     while ( true) {
//         System.out.println("======Car Rental System====");
//         System.out.println("1. Rent a Car");
//         System.out.println("2. Return a Car");
//         System.out.println("3. Exit");
//         System.out.println("Enter your Choice");

//         int choice=sc.nextInt();
//         sc.nextLine();

//         if(choice==1){
//             System.out.println("\n==Rent a Cars");
//             System.out.println("Enter your Name ");
//             String customerName = sc.nextLine();

//             System.out.println("\n Available Cars:");
//           for(Car car:cars){

//             if (car.isAvailable()) {

//                 System.out.println(car.getCarId()+"-"+car.getBrand()+""+car.getModel());
                
//                 }
                
//                 }
                
//                 System.out.print("\nEnter the car ID you want to rent: ");
                
//                 String carId = sc.nextLine();
                
//                 System.out.print("Enter the number of days for rental: ");
                
//                 int rentalDays = sc.nextInt();
                
//                 sc.nextLine(); // Consume newline
                
//                 Customer newCustomer = new Customer ( "CUS" + (customers.size() + 1), customerName);
                
//                 addCustomer (newCustomer);
                
//                 Car selectedCar = null;
//                    for (Car car: cars) {
//                        if (car.getCarId().equals(carId) && car.isAvailable()) {
//                             selectedCar = car;
//                 break;
                
//                 }
                
//                 }
                
//                 if (selectedCar != null) {
                
//                 double totalPrice = selectedCar.calculatePrice(rentalDays);
//                 System.out.println("\n== Rental Information ==\n");

//                 System.out.println("Customer ID:"+ newCustomer.getCustomerId());
                
//                 System.out.println("Customer Name:" + newCustomer.getName());
                
//                 System.out.println("Car:" + selectedCar.getBrand() + "" +selectedCar.getModel());
                
//                 System.out.println("Rental Days: "+rentalDays);
                
//                 System.out.printf("Total Price: $%.2f%n", totalPrice);
                
//                 System.out.print("\nConfirm rental (Y/N): ");
                
//                 String confirm = sc.nextLine();
                
//                 if (confirm.equalsIgnoreCase ("Y")) {
                
//                 rentCar(selectedCar, newCustomer, rentalDays);
                
//                 System.out.println("\nCar rented successfully.");
                
//                 } else {
                
//                 System.out.println("\nRental canceled.");
                
//                 }
                
//                 } else {
                
//                 System.out.println("\nInvalid car selection or car not available for rent.");
                
//                 }
                
//                 }else if (choice == 2) {
                
//                 System.out.println("\n== Return a Car ==\n");
                
//                 System.out.print("Enter the car ID you want to return: ");
                
//                 String carId =sc.nextLine();

// Car carToReturn = null;

// for (Car car: cars) {
// if (car.getCarId().equals(carId) && !car.isAvailable()) {

// carToReturn = car;

// break;

// }

// }

// if (carToReturn != null) {

// Customer customer = null;

// for (Rental rental: rentals) {

// if (rental.getCar() == carToReturn) {

// customer = rental.getCustomer();

// break;

// }
// }


// if (customer != null) {

// returnCar(carToReturn);

// System.out.println("Car returned successfully by"+ customer.getName());

//         } else {
//             System.out.println("Car was not rented or rental information is missing");

//         } }

//         else{
//             System.out.println("Invalid car ID or car is not rented");
//         }
        
//     }
//     else if(choice==3){
//         break;
//     }else{
//         System.out.println("Invalid choice .please enter a valid option");
//     }
// }


// System.out.println("\n Thankyou for using the CAR RENTAL SYSTEM!");



//     }
    
// }


// public class Main {

//     public static void main(String[] args) {

//         CarRentalSystem rentalSystem = new CarRentalSystem();

//         Car car1 = new Car("C001","Toyota","Camry",60.0);

//         Car car2 = new Car("C002","Thar","Cay",70.0);
     
//         rentalSystem.addCar(car1);
//         rentalSystem.addCar(car2);

//         rentalSystem.menu();

//     }
     
// }






// Update
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}

class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

class CarRentalSystemGUI {
    private List<Car> cars = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    private JFrame frame;
    private JPanel mainPanel;

    public CarRentalSystemGUI() {
        initializeCars();
        initializeGUI();
    }

    private void initializeCars() {
        cars.add(new Car("C001", "Toyota", "Camry", 60.0));
        cars.add(new Car("C002", "Mahindra", "Thar", 70.0));
    }

    private void initializeGUI() {
        frame = new JFrame("Car Rental System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
    
        // Main Panel and Layout
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
    
        // Heading label with larger font
        JLabel headingLabel = new JLabel("Car Rental System");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Larger font size
        headingLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center alignment
    
        // Buttons with improved styling
        JButton rentButton = new JButton("Rent a Car");
        styleButton(rentButton);
        rentButton.addActionListener(e -> showRentCarUI());
    
        JButton returnButton = new JButton("Return a Car");
        styleButton(returnButton);
        returnButton.addActionListener(e -> showReturnCarUI());
    
        JButton exitButton = new JButton("Exit");
        styleButton(exitButton);
        exitButton.addActionListener(e -> System.exit(0));
    
        // Add components to the main panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(headingLabel, gbc); // Add heading label to the top
    
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(rentButton, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(returnButton, gbc);
    
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(exitButton, gbc);
    
        // Add main panel to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(0, 120, 215)); // Blue color
        button.setForeground(Color.WHITE); // White text color
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Bold font
        button.setFocusPainted(false); // Remove focus paint
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2)); // Border styling
        button.setPreferredSize(new Dimension(200, 50)); // Size
    }

    private void showRentCarUI() {
        JFrame rentFrame = new JFrame("Rent a Car");
        rentFrame.setSize(450, 450);
        rentFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // UI Components for Rent Car
        JLabel nameLabel = new JLabel("Enter Your Name:");
        JTextField nameField = new JTextField(20);

        JLabel carLabel = new JLabel("Available Cars:");
        JComboBox<String> carComboBox = new JComboBox<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                carComboBox.addItem(car.getCarId() + " - " + car.getBrand() + " " + car.getModel());
            }
        }

        JLabel daysLabel = new JLabel("Enter Rental Days:");
        JTextField daysField = new JTextField(5);

        JButton confirmButton = new JButton("Confirm Rental");
        styleButton(confirmButton);

        JLabel messageLabel = new JLabel();

        confirmButton.addActionListener(e -> {
            String customerName = nameField.getText();
            String selectedCarId = carComboBox.getSelectedItem() != null ? carComboBox.getSelectedItem().toString().split(" - ")[0] : null;
            int rentalDays = Integer.parseInt(daysField.getText());

            if (selectedCarId == null) {
                messageLabel.setText("Please select a car.");
                return;
            }

            Car selectedCar = null;
            for (Car car : cars) {
                if (car.getCarId().equals(selectedCarId) && car.isAvailable()) {
                    selectedCar = car;
                    break;
                }
            }

            if (selectedCar != null) {
                Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName);
                customers.add(newCustomer);
                double totalPrice = selectedCar.calculatePrice(rentalDays);
                rentals.add(new Rental(selectedCar, newCustomer, rentalDays));
                selectedCar.rent();
                messageLabel.setText("Car rented successfully! Total Price: $" + totalPrice);
            } else {
                messageLabel.setText("Car is not available.");
            }
        });

        // Layout for Rent Car UI
        gbc.gridx = 0;
        gbc.gridy = 0;
        rentFrame.add(nameLabel, gbc);

        gbc.gridx = 1;
        rentFrame.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        rentFrame.add(carLabel, gbc);

        gbc.gridx = 1;
        rentFrame.add(carComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        rentFrame.add(daysLabel, gbc);

        gbc.gridx = 1;
        rentFrame.add(daysField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        rentFrame.add(confirmButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        rentFrame.add(messageLabel, gbc);

        rentFrame.setVisible(true);
    }

    private void showReturnCarUI() {
        JFrame returnFrame = new JFrame("Return a Car");
        returnFrame.setSize(450, 450);
        returnFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel carLabel = new JLabel("Enter Car ID to Return:");
        JTextField carField = new JTextField(20);

        JButton returnButton = new JButton("Return Car");
        styleButton(returnButton);

        JLabel messageLabel = new JLabel();

        returnButton.addActionListener(e -> {
            String carId = carField.getText();
            Car carToReturn = null;
            for (Car car : cars) {
                if (car.getCarId().equals(carId) && !car.isAvailable()) {
                    carToReturn = car;
                    break;
                }
            }

            if (carToReturn != null) {
                carToReturn.returnCar();
                messageLabel.setText("Car returned successfully!");
            } else {
                messageLabel.setText("Car not found or already returned.");
            }
        });

        // Layout for Return Car UI
        gbc.gridx = 0;
        gbc.gridy = 0;
        returnFrame.add(carLabel, gbc);

        gbc.gridx = 1;
        returnFrame.add(carField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        returnFrame.add(returnButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        returnFrame.add(messageLabel, gbc);

        returnFrame.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new CarRentalSystemGUI();
    }
}

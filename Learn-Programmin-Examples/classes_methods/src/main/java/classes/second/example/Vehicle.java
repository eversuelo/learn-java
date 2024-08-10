package classes.second.example;

public class Vehicle {
    /** Properties */
    String make;
    String model;
    int year;

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ford", "F150", 2023);
        System.out.println(v.make);
        System.out.println(v.model);
        System.out.println(v.year);
        v.setMake("Dodge");
        v.setModel("Durango");
        v.setYear(2023);
        System.out.println(v.getMake());
        System.out.println(v.getModel());
        System.out.println(v.getYear());
    }

    // Constructor
    Vehicle(String _make, String _model, int _year) {
        make = _make;
        model = _model;
        year = _year;
    }

    // Second constructor with different parameters
    Vehicle(String _make, String _model) {
        make = _make;
        model = _model;
        year = 0;
    }

    // Third constructor with default values
    Vehicle() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }
    // Methods

    // Getters
    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    // Setters
    void setMake(String _make) {
        make = _make;
    }

    void setModel(String _model) {
        model = _model;
    }

    void setYear(int _year) {
        year = _year;
    }
}
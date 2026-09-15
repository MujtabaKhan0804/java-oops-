class Main {
    // Variables used in this code 
    String name = "Mujtaba";
    int marks = 85;

    // Method 
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);

        // Loop (we r using for loop here), if we keep i<= 1 it shows welcome to java one time nd furter accordingly...
        for (int i = 1; i <= 1; i++) {
            System.out.println("Welcome to Java!");
        }
    }

    // Main function
    public static void main(String[] args) {
        // Creating an object
        Main s = new Main();
        // Calling the method using object
        s.display();
    }
}

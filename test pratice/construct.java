class construct {
    private String name;

    // constructor
    construct() {
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args) {

        // constructor is invoked while
        // creating an object of the Main class
        construct obj = new construct();
        System.out.println("The name is " + obj.name);
    }
}
class staticmodifier {
    static int i = 0;

    public staticmodifier()// constructor
    {
        this.i++;
    }

    public static void main(String[] args) {
        staticmodifier n1 = new staticmodifier();
        staticmodifier n2 = new staticmodifier();
        staticmodifier n3 = new staticmodifier();
        staticmodifier n4 = new staticmodifier();
        staticmodifier n5 = new staticmodifier();
        System.out.println("Number of times object are created is = " + i);
    }
}
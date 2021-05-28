class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Enter Number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int count[] = new int[100];
        for (i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (i = 0; i < 100; i++) {
            if (count[i] != 0) {
                System.out.println(i + " has frequency of " + count[i]);
            }
        }
        sc.close();
    }
}


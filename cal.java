class cal{
    public static void main(String [] args){
        int num = 1;
        int a = 20;
        int b = 10;

        switch (num) {
            case 1:System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid input, Try again...");
                break;
        }
        
    }
}

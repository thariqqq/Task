public class Theatre {    /*Creating a class called Theatre*/
    private int bookTicket(int a) {   /* Creating a method called bookTicket with arguments*/
        int ticket_price = 120;       /* Declaring a local variable and assigning value in it*/
        int result = a - ticket_price;  /* Declaring another local variable to store result of arithmetic operation*/
        return result;  /* Returning the result to calling method*/
    }
    public static void main(String[] args) {       /* Main method */
        Theatre raja = new Theatre();              /* Creating object called raja */
        int balance = raja.bookTicket(200);     /* Here we are calling the bookTicket method and storing the returned value in variable called balance  */
        System.out.println("After booking ticket : " + balance); /*Printing the returned value using print statement*/
    }
}

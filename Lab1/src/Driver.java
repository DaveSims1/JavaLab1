import java.util.*;
public class Driver {

    /*Create the driver class that would create 1 Singer (singer1) object
     with the help of the no argument constructor.
     Display the default values of the instance variables of this object singer1.*/

    public static void main(String[] args) {
        //Creating a first singer object with the default instance variables
        Singers firstSinger = new Singers();
        System.out.println("First Singer: " + firstSinger);

        //Setting the values of each instance variables
        firstSinger.setID(1010);
        //displaying that new set ID
        System.out.println("Updated First Singer: " + firstSinger);

        //Setting the rest of the object values
        firstSinger.setSingerName("Bon Jovi");
        firstSinger.setSingerAddress("54 Luxton Ave");
        firstSinger.setSingerBirth("Jan 1st 1951");
        firstSinger.setAlbumNum(15);
        System.out.println("Updated First Singer: " + firstSinger);
        System.out.println();



        //Having the User input a singer
        System.out.println("Welcome to the Singer Collection! Please Input a singers details to include them in the Collection!");
        Scanner x = new Scanner(System.in);


        Boolean y = true;
        while(y = true){
            Singers SecondSinger = new Singers();
            System.out.println("Would you like to enter a singer? Yes or No");
            String input = x.nextLine();

            if(input.equalsIgnoreCase("Yes")){
                System.out.println("Please enter the singers ID: ");
                int id = x.nextInt();
                x.nextLine();

                System.out.println("Please enter the singers Name: ");
                String name = x.nextLine();

                System.out.println("Please enter the singers Address: ");
                String address = x.nextLine();

                System.out.println("Please enter the singers Date of Birth ex: (Jan 01 2023): ");
                String dob = x.nextLine();

                System.out.println("Please enter the number of albums the singer released: ");
                int album = x.nextInt();

                SecondSinger.setAll(id, name, address, dob, album);
                System.out.println("Your Entry: " + SecondSinger);
            }
            else if(input.equalsIgnoreCase("No")){
                System.out.println("Goodbye!");
                break;
            }
            else{
                System.out.println("Please enter a Yes or No!");
            }
        }








    }

}

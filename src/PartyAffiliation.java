import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "\nR - Republican\tD - Democrat\tI - Independent\tO - Other\nChoose your affiliation: ";

        // Display menu and input
        System.out.print(menu);
        menuChoice = in.nextLine();

        // Output on menu choice
        if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Elephant");
        } else if (menuChoice.equalsIgnoreCase("D"))
            System.out.println("You get a Donkey");
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Person");
        } else if (menuChoice.equalsIgnoreCase("O"))
            System.out.println("You must affiliate as other.");
        {

        }
        {

        }

    }
}
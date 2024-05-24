import java.io.IOException;

public class Banking {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("    Welcome to the Banking Project!   ");
        System.out.println("**************************************");
        System.out.println("            BANKING SYSTEM            ");
        System.out.println("**************************************");
        System.out.println(" --------------------");
        System.out.println("   ->SUVRA DEBNATH");
        System.out.println(" --------------------");
	}
}
package SRPG.game;

public class Menu {

    private final String[] mainMenuElements = {
            "1. В торговую лавку",
            "2. На битву",
            "3. Выход"
    };

    protected void printMainMenu() {
        System.out.println("Куда отправимся?");
        for (int i = 0; i < mainMenuElements.length; i++) {
            System.out.println(mainMenuElements[i]);
        }
    }
}

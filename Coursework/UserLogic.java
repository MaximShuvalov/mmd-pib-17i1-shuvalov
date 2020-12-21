import java.util.Scanner;
import ObjectModel.*;

public class UserLogic {

    private Nursery nursery = DataBuilder.getNursery();
    private AnalizatorNursery analizatorNursery = new AnalizatorNursery();
    private ReportBuilder reportBuilder = new ReportBuilder();
    private NurseryHandler nurseryHandler = new NurseryHandler();
    private Scanner userInput = new Scanner(System.in);
    private boolean exit = false;

    public void runUserActionMenu() throws Exception {
        while (!exit) {
            printMenu();
            int punktMenu = Integer.parseInt(userInput.nextLine());
            menuChoice(punktMenu);
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("---------------------------------------ИС Питомник--------------------------------------");
        System.out.println("Добро пожаловать, пожалуйста, выберите необходимое действие");
        System.out.println("1 - Показать всех животных в питомнике");
        System.out.println("2 - Показать самый прожорливый вальер");
        System.out.println("3 - Показать самое прожорливое животное");
        System.out.println("4 - Покормить животное");
        System.out.println("5 - Выход");
        System.out.println("--------------------------------------------by shuvalov m 2020--------------------------");
        System.out.println();
    }

    private void menuChoice(int numMenu) throws Exception {
        switch (numMenu) {
            case 1 : printAnimalOfType();
            break;
            case 2 : printTheMostVoraciousAviarys();
            break;
            case 3: printTheMostVoraciousAnimal();
            break;
            case 4: feedAnimal();
            break;
            case 5: exit();
            break;
            default:
                System.out.println("Такого действия не существует!");
        }
    }

    private void exit() throws InterruptedException {
        System.out.println("Всего хорошего! Система завершает работу");
        System.out.println();
        runProgressBar();
        exit = true;
    }

    private void printAnimalOfType() throws Exception {
        try {
            reportBuilder.printAnimalOfType(nursery.Aviarys);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка при составлении отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAviarys() throws InterruptedException {
        try {
            var mostVoraciousAviarys = analizatorNursery.getTheMostVoraciousAviarys(nursery);
            reportBuilder.printTheMostVoraciousAviarys(mostVoraciousAviarys);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка при составлении отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAnimal() throws InterruptedException {
        try {
            var mostVoraciousAnimal = analizatorNursery.getTheMostVoraciousAnimal(nursery);
            reportBuilder.printTheMostVoraciousAnimal(mostVoraciousAnimal);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка при составлении отчета");
            exit();
        } 
    }

    private void runProgressBar() throws InterruptedException {
        System.out.println("|==              |\r");
        Thread.sleep(500);
        System.out.println("|====            |\r");
        Thread.sleep(500);
        System.out.println("|======          |\r");
        Thread.sleep(500);
        System.out.println("|========        |\r");
        Thread.sleep(500);
        System.out.println("|==========      |\r");
        Thread.sleep(500);
        System.out.println("|============    |\r");
        Thread.sleep(500);
        System.out.println("|==============  |\r");
        Thread.sleep(500);
        System.out.println("|================|\r");
    }

    private void feedAnimal() throws Exception {
        try {
            System.out.println();
            System.out.println("Введите имя животного");
            var nameAnimal = userInput.next();
            var animal = analizatorNursery.getAnimalByName(nursery, nameAnimal);
            System.out.println("Введите количество пачек корма");
            var countPackFood = userInput.nextInt();
            nurseryHandler.feedAnimal(animal, countPackFood);
            System.out.println(nameAnimal + " успешно накормлен");
            String line1 = userInput.nextLine();
        } catch (Exception ex) {
            System.out.println("Произошла ошибка при кормлении животного");
            System.out.println(ex.getMessage());
            exit();
        }
    }
}

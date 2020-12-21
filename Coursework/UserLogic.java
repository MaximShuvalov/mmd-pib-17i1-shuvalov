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
        System.out.println("---------------------------------------�� ��������--------------------------------------");
        System.out.println("����� ����������, ����������, �������� ����������� ��������");
        System.out.println("1 - �������� ���� �������� � ���������");
        System.out.println("2 - �������� ����� ����������� ������");
        System.out.println("3 - �������� ����� ����������� ��������");
        System.out.println("4 - ��������� ��������");
        System.out.println("5 - �����");
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
                System.out.println("������ �������� �� ����������!");
        }
    }

    private void exit() throws InterruptedException {
        System.out.println("����� ��������! ������� ��������� ������");
        System.out.println();
        runProgressBar();
        exit = true;
    }

    private void printAnimalOfType() throws Exception {
        try {
            reportBuilder.printAnimalOfType(nursery.Aviarys);
        } catch (Exception ex) {
            System.out.println("��������� ������ ��� ����������� ������");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAviarys() throws InterruptedException {
        try {
            var mostVoraciousAviarys = analizatorNursery.getTheMostVoraciousAviarys(nursery);
            reportBuilder.printTheMostVoraciousAviarys(mostVoraciousAviarys);
        } catch (Exception ex) {
            System.out.println("��������� ������ ��� ����������� ������");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAnimal() throws InterruptedException {
        try {
            var mostVoraciousAnimal = analizatorNursery.getTheMostVoraciousAnimal(nursery);
            reportBuilder.printTheMostVoraciousAnimal(mostVoraciousAnimal);
        } catch (Exception ex) {
            System.out.println("��������� ������ ��� ����������� ������");
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
            System.out.println("������� ��� ���������");
            var nameAnimal = userInput.next();
            var animal = analizatorNursery.getAnimalByName(nursery, nameAnimal);
            System.out.println("������� ���������� ����� �����");
            var countPackFood = userInput.nextInt();
            nurseryHandler.feedAnimal(animal, countPackFood);
            System.out.println(nameAnimal + " ������� ���������");
            String line1 = userInput.nextLine();
        } catch (Exception ex) {
            System.out.println("��������� ������ ��� ��������� ���������");
            System.out.println(ex.getMessage());
            exit();
        }
    }
}

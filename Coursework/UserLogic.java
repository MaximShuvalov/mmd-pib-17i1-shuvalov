import java.util.Scanner;

import ObjectModel.*;

public class UserLogic {

    private Nursery nursery = DataBuilder.getNursery();
    private AnalizatorNursery analizatorNursery = new AnalizatorNursery();
    private ReportBuilder reportBuilder = new ReportBuilder();
    private boolean exit = false;

    public void runUserActionMenu() throws Exception {
        Scanner userInput = new Scanner(System.in);
        while(!exit){
            printMenu();
            int punktMenu = userInput.nextInt();
            menuChoice(punktMenu);
        }
        userInput.close();
    }

    private void printMenu() {
        System.out.println();
        System.out.println("---------------------------------------�� ��������--------------------------------------");
        System.out.println("����� ����������, ����������, �������� ����������� ��������");
        System.out.println("1 - �������� ���� �������� � ���������");
        System.out.println("2 - �������� ����� ����������� ������");
        System.out.println("3 - �������� ����� ����������� ��������");
        System.out.println("4 - �����");
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
            case 4: exit();
            break;
            default:
                System.out.println("�� �������!");
        }
    }

    private void printAnimalOfType() throws Exception {
        reportBuilder.printAnimalOfType(nursery.Aviarys);
    }

    private void printTheMostVoraciousAviarys(){
        var mostVoraciousAviarys = analizatorNursery.getTheMostVoraciousAviarys(nursery);
        reportBuilder.printTheMostVoraciousAviarys(mostVoraciousAviarys);
    }

    private void printTheMostVoraciousAnimal(){
        var mostVoraciousAnimal= analizatorNursery.getTheMostVoraciousAnimal(nursery);
        reportBuilder.printTheMostVoraciousAnimal(mostVoraciousAnimal);
    }

    private void exit() throws InterruptedException {
        System.out.println("����� ��������! ������� ��������� ������");
        System.out.println();
        runProgressBar();
        exit = true;
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
    
}

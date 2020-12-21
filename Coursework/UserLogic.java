import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import ObjectModel.*;
import Serializators.Serializator;

public class UserLogic {

    private Nursery nursery;
    private AnalizatorNursery analizatorNursery = new AnalizatorNursery();
    private Serializator serializator;
    private ReportBuilder reportBuilder = new ReportBuilder();
    private NurseryHandler nurseryHandler = new NurseryHandler();
    private Scanner userInput = new Scanner(System.in);
    private boolean exit = false;

    public UserLogic(Nursery nursery, Serializator serializator) throws Exception {
        this.nursery = nursery;
        this.serializator = serializator;
    }

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
        System.out.println("Выберите действие, которое хотите выполнить");
        System.out.println("1 - Посмотреть всех животных");
        System.out.println("2 - Показать самый прожорливый вальер");
        System.out.println("3 - Показать самое прожорливое животное");
        System.out.println("4 - Показать самый голодный вальер");
        System.out.println("5 - Показать самое голодное животное");
        System.out.println("6 - Сохранить текущее состояние");
        System.out.println("7 - Выход");
        System.out.println("--------------------------------------------by shuvalov m 2020--------------------------");
        System.out.println();
    }

    private void menuChoice(int numMenu) throws Exception {
        switch (numMenu) {
            case 1:
                printAnimalOfType();
                break;
            case 2:
                printTheMostVoraciousAviarys();
                break;
            case 3:
                printTheMostVoraciousAnimal();
                break;
            case 4:
                printTheMostHungryAviarys();
                break;
            case 5:
                printTheMostHungryAnimal();
                break;
            case 6:
                saveStateNursery();
                break;
            case 7:
                exit();
                break;
            default:
                System.out.println("Неизвестное действие!");
        }
    }

    private void saveStateNursery() throws InterruptedException, FileNotFoundException, IOException {
        serializator.serializeNursery(nursery);
        System.out.println("Сохранение успешно завершено!");
        System.out.println();
    }

    private void exit() throws InterruptedException {
        System.out.println("До свидания! Система завершает работу");
        System.out.println();
        runProgressBar();
        exit = true;
    }

    private void printAnimalOfType() throws Exception {
        try {
            reportBuilder.printAnimalOfType(nursery.Aviarys);
        } catch (Exception ex) {
            System.out.println("Ошибка при формировании отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAviarys() throws InterruptedException {
        try {
            var mostVoraciousAviarys = analizatorNursery.getTheMostVoraciousAviarys(nursery);
            reportBuilder.printTheMostVoraciousAviarys(mostVoraciousAviarys);
        } catch (Exception ex) {
            System.out.println("Ошибка при формировании отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostHungryAviarys() throws InterruptedException {
        try {
            var mostHungryAviarys = analizatorNursery.getTheMostHungryAviarys(nursery);
            reportBuilder.printTheMostHungryAviarys(mostHungryAviarys);
        } catch (Exception ex) {
            System.out.println("Ошибка при формировании отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostHungryAnimal() throws InterruptedException {
        try {
            var mostHungryAnimal= analizatorNursery.getTheMostHungryAnimal(nursery);
            reportBuilder.printTheMostHungryAnimal(mostHungryAnimal);
        } catch (Exception ex) {
            System.out.println("Ошибка при формировании отчета");
            System.out.println(ex.getMessage());
            exit();
        }
    }

    private void printTheMostVoraciousAnimal() throws InterruptedException {
        try {
            var mostVoraciousAnimal = analizatorNursery.getTheMostVoraciousAnimal(nursery);
            reportBuilder.printTheMostVoraciousAnimal(mostVoraciousAnimal);
        } catch (Exception ex) {
            System.out.println("Ошибка при формировании отчета");
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

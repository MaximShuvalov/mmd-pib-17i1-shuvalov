import java.util.ArrayList;

import ObjectModel.*;

public class ReportBuilder {
    
    public void printTheMostVoraciousAviarys(Aviary av){

        System.out.println("--------------------------����� �� ������ ������������ �������----------------------------------");
        System.out.println();
        System.out.println("����� ����������� ������ " + av.Number);
        System.out.println();

        for (Animal animal : av.Animals) {
            System.out.println(animal.Name + " ���� " + animal.Days.stream().mapToInt(a -> a.CountPackFood).sum()
                    + " ����� �����");
        }
        System.out.println();
        System.out.println("--------------------------����� ������------------------------------------------------------------");
        System.out.println();
    }

    public void printTheMostVoraciousAnimal(Animal animal) {

        System.out.println("--------------------------����� �� ������ ������������ ���������----------------------------------");
        System.out.println();
        System.out.println("����� ����������� �������� " + animal.Name);
        System.out.println();
        System.out.println("--------------------------����� ������------------------------------------------------------------");
        System.out.println();
    }

    public void printAnimalOfType(ArrayList<Aviary> aviaries) throws Exception {
        System.out.println("--------------------------����� �� ���� ��������, ���������� � ���������--------------------------");
        System.out.println();
        for (Aviary aviary : aviaries) {
            System.out.println("������ #" + aviary.Number);
            for (Animal animal : aviary.Animals) {
                var types = getNameType(animal.Type);
                System.out.println("��������: " + animal.Name + " ���: " + types);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------------------����� ������------------------------------------------------------------");
    }

    private String getNameType(TypesAnimal typesAnimal) throws Exception {
        switch (typesAnimal) {
            case Bird:
                return "�����";
            case Cat:
                return "�����";
            case Dog:
                return "������";
            default:
                throw new Exception("����������� ��� ���������");
        }
    }

}

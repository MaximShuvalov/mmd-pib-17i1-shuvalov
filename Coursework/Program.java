public class Program {
    public static void main(String[] args) {
        boolean[][][] nurseries = new boolean[2][10][3];

        //кормим двух животных из первого питомника из 1 и 2 вальера
        nurseries[0][0][0] = true;
        nurseries[0][1][0] = true;

        //Смотрим количество накормленных животных
        var countAnimals = getCountWellFedAnimals(nurseries);
        System.out.println("Count well-fed animals " + countAnimals);
    }

    public static int getCountWellFedAnimals(boolean[][][] animals){
        int countAnimals = 0;
        for (boolean[][] bs : animals) {
            for (boolean[] bs2 : bs) {
                for (int i= 0; i < bs2.length-1; i++) {
                    if(bs2[i] == true)
                        countAnimals++;
                }
            }
        }

        return countAnimals;
    }
}

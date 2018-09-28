import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.opencsv.CSVReader;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ConstructionFailedException;
import org.evosuite.ga.localsearch.LocalSearchObjective;


public class Solution extends Chromosome{
    private double crossover_rate;
    private int population;
    private double elitism;
    private String selection;
    private boolean parent_replacement;
    private int[] index;
    static int count=0;
    static String[] selection_set= {"TOURNAMENT","RANK", "ROULETTEWHEEL", "BINARY_TOURNAMENT"};
    static boolean [] replace = {true, false};
    static double [] cross = {0,0.2,0.5,0.8,1};
    static int[] pop = {4,10,50,100,200};
    static double[] elit= {0,1,0.1,0.5};
    static int size[] = {cross.length,pop.length,elit.length,selection_set.length,replace.length};






    public Solution(int[] param){
        index=param;
        crossover_rate = cross[index[0]];
        population=pop[index[1]];
        elitism=elit[index[2]];
        selection=selection_set[index[3]];
        parent_replacement=replace[index[4]];
    }
    public void runEvosuite() throws IOException, InterruptedException { //fitness
        count++;
        Runtime rt = Runtime.getRuntime();
//        String cmd = String.format("java -jar /Users/shayan/Desktop/Project/evosuite-1.0.6.jar -target /Users/shayan/Desktop/Project/SF100/1_tullibee/tullibee.jar" +
//                        " -Dcrossover_rate=%f" +
//                        " -Dpopulation=%d -Dselection_function=%s -Dshow_progress=False" +
//                        " -criterion branch" +
//                        " -Doutput_variables=TARGET_CLASS,criterion,Size,Length,MutationScore" +
//                        " -Dreport_dir=/Users/shayan/Desktop/Project/java/results/%d",
//                crossover_rate, population, selection,count);
        String cmd = String.format("java -jar /home/ubuntu/evosuite-1.0.6.jar -target /home/ubuntu/SF100/1_tullibee/tullibee.jar" +
                        " -Dcrossover_rate=%f" +
                        " -Dpopulation=%d -Dselection_function=%s -Dshow_progress=False" +
                        " -criterion branch" +
                        "-Doutput_variables=TARGET_CLASS,criterion,Size,Length,MutationScore" +
                        "-Dreport_dir=/home/ubuntu/algorithms/results/%d",
                crossover_rate, population, selection,count);
        Process pr = rt.exec(cmd);
        pr.waitFor();
    }

    public double getMutationScore(){
        try {
            //csv file containing data
//            String strFile = String.format("/Users/shayan/Desktop/Project/java/results/%d/statistics.csv",count);
            String strFile = String.format("/home/ubuntu/java/results/%d/statistics.csv",count);
            CSVReader reader = new CSVReader(new FileReader(strFile));
            String[] nextLine;
            int size_sum = 0;
            double sum = 0;
            int lineNumber = 0;
            while ((nextLine = reader.readNext()) != null) {
                lineNumber++;
                if (lineNumber!=1){
                    size_sum += Integer.parseInt(nextLine[2]);
                    sum += Integer.parseInt(nextLine[2])*Double.parseDouble(nextLine[4]);

                }
                // nextLine[] is an array of values from the line
            }
            double MutationScore = sum/size_sum;
            return MutationScore;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public Chromosome clone() {
            return new Solution(this.index);
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public <T extends Chromosome> int compareSecondaryObjective(T t) {
        return 0;
    }

    @Override
    public void mutate() {
        int random = new Random().nextInt(index.length); //which parameter to change
        int random2 = new Random().nextInt(size[random]); //which is going to be assigned
        index[random]=random2;
    }

    @Override
    public void crossOver(Chromosome chromosome, int i, int i1) throws ConstructionFailedException {
        Solution s =(Solution)chromosome;
        if (i1<i){
            int x = i1;
            i1= i;
            i=i1;
        }
        if (i==i1){
            i1=this.index.length;
        }

        for (int j =i;j<i1;j++) {
            int temp = this.index[j];
            this.index[j] = s.index[j];
            s.index[j]=temp;
        }
    }

    @Override
    public boolean localSearch(LocalSearchObjective<? extends Chromosome> localSearchObjective) {
        return false;
    }

    @Override
    public int size() {
        return 5;
    }
}

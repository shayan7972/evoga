import org.evosuite.Properties;
import org.evosuite.ga.*;
import org.evosuite.ga.metaheuristics.NSGAII;
import org.evosuite.ga.operators.crossover.UniformCrossOver;
import org.evosuite.ga.stoppingconditions.MaxGenerationStoppingCondition;

import java.io.IOException;
import java.util.Random;


public class MetaGA{


    public static void main(String[] args) {
       //  define how a chromosome is encoded and what is the search space
        ChromosomeFactory factory = new ChromosomeFactory() {
            @Override
            public Solution getChromosome() {
                int rnd1 = new Random().nextInt(5);

                int rnd2 = new Random().nextInt(5);

                int rnd3 = new Random().nextInt(4);

                int rnd4 = new Random().nextInt(4);

                int rnd5 = new Random().nextInt(2);
                int[] p =  {rnd1,rnd2,rnd3,rnd4,rnd5};


                return new Solution(p);
            }
        };
    NSGAII ga= new NSGAII(factory);
    FitnessFunction<Solution> function = new FitnessFunction<Solution>() {
        @Override
        public double getFitness(Solution solution) {
            try {
                solution.runEvosuite();
                return solution.getBranchCoverage();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override
        public boolean isMaximizationFunction() {
            return true;
        }
    };


        //  specify what are the ga parameters
        Properties.POPULATION = 40;
        Properties.CROSSOVER_RATE = 0.5;
        Properties.MUTATION_RATE = 0.2;

        //  create a population of chromosome



        ga.addFitnessFunction(function);
        ga.setCrossOverFunction(new UniformCrossOver());
        MaxGenerationStoppingCondition s1 = new MaxGenerationStoppingCondition();
        s1.setLimit(20);
        ga.addStoppingCondition(s1);

        ga.initializePopulation();

        //  run ga over the search space
        ga.generateSolution();
        Properties.REPORT_DIR = "/home/ubuntu/results/metaga";
        ga.writeIndividuals(ga.getBestIndividuals());
    }
}

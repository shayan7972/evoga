import org.evosuite.Properties;
import org.evosuite.ga.*;
import org.evosuite.ga.metaheuristics.NSGAII;
import org.evosuite.ga.operators.crossover.UniformCrossOver;

import java.io.IOException;
import java.util.Random;


public class MetaGA{


    public static void main(String[] args) {
//        define how a choromosome is encoded and what is the search space
        ChromosomeFactory<Solution> factory = new ChromosomeFactory<Solution>() {
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
    NSGAII ga= new NSGAII<>(factory);
    FitnessFunction<Solution> function = new FitnessFunction<Solution>() {
        @Override
        public double getFitness(Solution solution) {
            try {
                solution.runEvosuite();
                double fitness = solution.getMutationScore();
                return fitness;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return 0;
            }
        }

        @Override
        public boolean isMaximizationFunction() {
            return true;
        }
    };

//        – Crossover rate: {0, .2, .5, .8, 1}.
//– Population size: {4, 10, 50, 100, 200}.
//– Elitism rate: {0, 1, 10 %, 50 %} or steady state.
//– Selection: roulette wheel, tournament with size either 2 or 7, and rank selection
//        with bias either 1.2 or 1.7.
//– Parent replacement check (activated or not)

//        specify what are the ga parameters
        Properties.POPULATION = 100;
        Properties.CROSSOVER_RATE = 0.5;
        Properties.MUTATION_RATE = 0.2;

        //        create a population of choromosome


        ga.initializePopulation();

        ga.addFitnessFunction(function);
        System.out.println(ga.getNumberOfFitnessFunctions());
        ga.setCrossOverFunction(new UniformCrossOver());


//        run ga over the search space
        ga.generateSolution();
        ga.writeIndividuals(ga.getBestIndividuals());
        ga.getBestIndividual();
    }
}

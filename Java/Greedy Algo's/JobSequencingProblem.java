import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
    static class Job{
        int id;
        int profit;
        int deadline;

        public Job(int i, int d, int p){
            id = i;
            profit = p;
            deadline = d;
        }
    }
    public static void maxProfit(int jobsInfo[][]){
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);// using this syntax we will get our objects in descending in basis of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max jobs we can do: " + seq.size());
        System.out.println("Jobs: " + seq);

    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
        maxProfit(jobsInfo);
    }
}

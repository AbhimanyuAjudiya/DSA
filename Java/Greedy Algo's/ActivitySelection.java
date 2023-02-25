import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static int activitySelectionInSortedEnd(int start[], int end[]){
        //end time basis sorted
        int maxAct;
        ArrayList<Integer> ans = new ArrayList<>();

        //Always select 1st Act because end time is sorted so the 1dt Act will sortest
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i = 1; i<end.length; i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Activities are : " + ans);
        return maxAct;

    }

    public static int activitySelection(int start[], int end[]){//Here we have to sort end time
        
        //now we make simple 2d arr and store orignal index of start, start arr and end arr 
        int activities[][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            activities[i][0] = i;       //in 0 we have index
            activities[i][1] = start[i];//in 1 we have startTime
            activities[i][2] = end[i];  //in 2 we have endTime
        }

        //using lamda function we will sort our array in basis of endTime col which is activities[2]
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        //end time basis sorted
        int maxAct;
        ArrayList<Integer> ans = new ArrayList<>();

        //Always select 1st Act because end time is sorted so the 1dt Act will sortest
        maxAct = 1;
        ans.add(activities[0][0]); // storing first act
        int lastEnd = activities[0][2];// storing last endTime
        for(int i = 1; i<end.length; i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);// storing activities
                lastEnd = activities[i][2];// storing last endTime
            }
        }
        System.out.println("Activities are : " + ans);
        return maxAct;

    }

    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};
        System.out.println(activitySelection(start, end));
    }
}

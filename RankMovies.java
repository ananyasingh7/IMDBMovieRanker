import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;


public class RankMovies {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ananya Singh\\IdeaProjects\\PS8\\src\\ratings-utf8");

        ArrayList<MovieRating> rl = new ArrayList<MovieRating>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String pre = line.substring(0, 31);
                String post = line.substring(32);
                String[] tkns = pre.split("\\s+");

                MovieRating nr = new MovieRating(tkns[2], tkns[3], post);
                rl.add(nr);



                /**
                 for(int i = 0; i<rl.size(); ++i){
                 System.out.println(rl.get(i));
                 }
                 System.out.println();
                 **/
                /**
                 MaxHeap<MovieRating> hMinVotes = new MaxHeap<MovieRating>();
                 int count = 0;
                 for(int i = 0; i<hMinVotes.heapsize(); i++){

                 }
                 **/




            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /**
         int minVotes = 20000;
         int numRecords;
         Scanner input = new Scanner(System.in);
         while (true) {
         System.out.println();
         System.out.println("Enter minimum vote threshold and number of movies:");
         minVotes = input.nextInt();
         numRecords = input.nextInt();
         if (minVotes * numRecords == 0)
         break;
         long startTime = System.currentTimeMillis();
         **/

        //MaxHeap<MovieRating> hMinVotes = new MaxHeap<MovieRating>();
        /**
         for(int i = 0 ; i < rl.size() ; i++)
         {
         if(rl.get(i).getVotes()>= minVotes)
         {
         hMinVotes.insert(rl.get(i));
         }

         }


         for (int j = 0; j < numRecords ; j++)
         {
         System.out.println(hMinVotes.removemax());

         }
         **/
        int count = 0;
        MaxHeap<MovieRating> hMinVotes = new MaxHeap<MovieRating>();
        for(int i = 0 ; i < rl.size() ; i++)
        {
            if(rl.get(i).getVotes()>= 30000)
            {
                //hMinVotes.insert(rl.get(i));
                count++;
            }

        }
        System.out.println(count);


        /**
         int count = 0;
         for (int j = 0; j < hMinVotes.heapsize() ; j++)
         {
         if(rl.get(j).getVotes()>= 20000)
         {
         hMinVotes.insert(rl.get(j));
         ++count;
         }

         }
         System.out.println(count);
         **/




        System.out.println();;
        //long readTime = System.currentTimeMillis();
        // System.out.println("Time: "+(System.currentTimeMillis()-startTime)+" ms");

    }
}


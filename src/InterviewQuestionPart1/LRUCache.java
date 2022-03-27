package InterviewQauestionPart1;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
   // store keys of cache
   private Deque<Integer> doublyQueue;

   // store references of key in cache
   private HashSet<Integer> hashSet;

   // maximum capacity of cache
   private final int CACHE_SIZE;

   public LRUCache(int capacity) {
      doublyQueue = new LinkedList<>(); //Proper Intializing
      hashSet=new HashSet<>();
      CACHE_SIZE=capacity;
   }


   public void refer(int stringreference) {


         //Step 2: Case 1
         if(!hashSet.contains(stringreference)){
            if(doublyQueue.size()==CACHE_SIZE)
            {
               int last = doublyQueue.removeLast();
               hashSet.remove(last);
            }
         }

         //Step 2 : Case 3
         else{
            doublyQueue.remove(stringreference); //Pass page
         }
         // Step 1:Default step done
         doublyQueue.push(stringreference);
         hashSet.add(stringreference);
      }


   public void display() {
//
      doublyQueue.stream().forEach(System.out::println);
//      Iterator<Integer> itr = doublyQueue.iterator();
//      while (itr.hasNext()) {
//         System.out.print(itr.next() + " ");
//      }

   }
}

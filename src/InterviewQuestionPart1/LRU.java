package InterviewQuestionPart1;

public class LRU {
    /* Scenario :
     1. {Start insert from front in queue and hashset}
     2. Once Queue is full
       Case  1 (Miss) :delete from rear(removelast) in queue and set and {insert from front in queue and set}
       Case 2 :(Hit) : delete from wherever its found and {insert from front in queue and set}
       //HashSet is there so that we dont store duplicate pages
    */

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);
        cache.display();
    }
}

// Time Complexity : O
// Space Complexity : O(k) -> K is the limit of the value -> here [0,1000000]
// Did this code successfully run on Leetcode : Yes (16 ms)
// Any problem you faced while coding this : No, similar to HashSet designing, although is not a optimized approach


// Your code here along with comments explaining your approach


class MyHashMap {

    private int[]  map; 
    private boolean[] exists;
  
    /** Initialize your data structure here. */
    public MyHashMap() {
        
        map = new int[1000000];
        
        exists = new boolean[1000000];
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        
        map[key] = value;
        exists[key] = true;
        
    }
   
  
  // get the corresponding value for the key if it exists for the key is true
    public int get(int key) {
        
        if (exists[key]) {
            return map[key];
        }else {
            return -1;
        }
    }
    
 
  // Mark -1 to the position which is removed
    public void remove(int key) {
        
        map[key] = -1;
        exists[key]=false;
    }
}


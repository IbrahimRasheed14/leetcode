import java.util.HashMap;

class Solution {
    
    public int romanToInt(String s) {
       HashMap<String, Integer> roman = new HashMap<>();
       roman.put("I", 1);
       roman.put("V", 5);
       roman.put("X", 10);
       roman.put("L", 50);
       roman.put("C", 100);
       roman.put("D", 500);
       roman.put("M", 1000);
       int total = 0;
       for (int i = 0; i < s.length(); i++) {

            int currentVal = roman.get(String.valueOf(s.charAt(i)));
            if (i < s.length()-1){
               int nextVal = roman.get(String.valueOf(s.charAt(i+1)));
                
               if (currentVal < nextVal){
                    total -= currentVal;

               }
               else{total += currentVal;}

            }
            else{total+=currentVal;}
        
       }
       return total;



       


        
    }
}
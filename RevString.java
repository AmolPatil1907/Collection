import java.util.*;
public class RevString 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> al = new ArrayList<Character>();      
        
        String s= "ccced";
        for(int i=0; i<s.length(); i++)
        {
           al.add(s.charAt(i));
        }

        for(int i=0; i<al.size(); i++)
        {
            int cnt = 0;
            for(int j=0; j<i; j++)
            {
                if(al.get(i) == al.get(j))
                {
                   cnt++;                    
                }

            }
            if(cnt != 0)
            {
                al.remove(al.get(i));
            }
        }


        System.out.println(al);
        
    }

   
}
/*
 * 
 * 
 * 
 /User function Template for Java

class Solution 
{ 
    String removeReverse(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0, j=S.length()-1;
        boolean rev = false;
        HashSet<Integer> del = new HashSet<>();
        
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        while(i<j){
            char first = S.charAt(i);
            char last = S.charAt(j);
            
            if(!rev){
                if(map.get(first) > 1){
                    map.put(first, map.get(first)-1);
                    del.add(i);
                    rev = !rev;
                }
                i++;
            } else {
                if(map.get(last) > 1){
                    map.put(last, map.get(last)-1);
                    del.add(j);
                    rev = !rev;
                }
                j--;
            }
        }
        StringBuilder ans = new StringBuilder();
        
        for(i=0; i<S.length(); i++){
            if(!del.contains(i)) ans.append(S.charAt(i));
        }
        if(rev) return ans.reverse().toString();
        
        return ans.toString();
    }
}  
 * 
 * 
 * 
 *
 */
  
import java.util.*;
public class MapIterator {

	public static void main(String[] args) 
	{
		//coll.24
		Map<Integer,String> map = new HashMap<Integer,String>();  
        map.put(6,"hef");  
        map.put(1,"shine");  
        map.put(3,"java");
        map.put(9,"School");
        Set<Map.Entry<Integer,String>> set = map.entrySet();  
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();  
        while(itr.hasNext())
        {  
            Map.Entry e = itr.next();
            System.out.println(e.getKey()+" ="+e.getValue());  
        }  
	}
}

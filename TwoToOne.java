import java.util.ArrayList;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        
        String longest = s1 + s2;
        ArrayList <String> characters = new ArrayList <String>();
        
        //transform into an array
        for (int i = 0; i < longest.length(); i++)
        {
           characters.add(longest.substring(i, i+1));
        }
        
        // remove duplicates
        for (int i = 0; i < characters.size()-1; i++)
          {
            for (int j = i+1; j < characters.size(); j++)
            {
              String letter = characters.get(i);
              String nextLetter = characters.get(j);
              if (letter.equals(nextLetter))
               {
                 characters.remove(j);
                 j--;
               }
            }
          }
        
        //sort alphabetically
        for(int i=0;i<characters.size();i++)
        {
          for(int j=i+1;j<characters.size();j++)
          {
            if(characters.get(i).compareTo(characters.get(j))>0)
            {
              String temp = characters.get(i);
              characters.set(i,characters.get(j));
              characters.set(j,temp);   
            }
          }
        }
        
        //transform array into 'longest' string
        String orderedLongest = "";
        for (int i = 0; i < characters.size(); i++)
        {
          orderedLongest = orderedLongest +  characters.get(i);
        }
        longest = orderedLongest;
        
        return longest;
    }
}

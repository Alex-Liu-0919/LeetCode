// solution 1
class Solution {
    public boolean isPalindrome(String s) {
        
        int leftIndex=0;
        int rightIndex=s.length()-1;
        
        while(leftIndex<=rightIndex)
        {
            if( !Character.isLetterOrDigit(s.charAt(leftIndex)))
            {
                leftIndex++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(rightIndex)))
            {
                rightIndex--;
            }
            else{
                 if (Character.toLowerCase(s.charAt(rightIndex))!=Character.toLowerCase(s.charAt(leftIndex)))
               {
                      return false;
               }else{
                      leftIndex++;
                      rightIndex--;
                    }
            } 
              
           
            
        }
        
        return true;
        
    }
}

// solution 2

class Solution {
    public boolean isPalindrome(String s) {
        
        
        
        String newStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int leftIndex=0;
        int rightIndex=newStr.length()-1;
        
        while(leftIndex<= rightIndex)
        {
            if ( newStr.charAt(leftIndex)!= newStr.charAt(rightIndex) )
            {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        
        return true;
        
    }
}
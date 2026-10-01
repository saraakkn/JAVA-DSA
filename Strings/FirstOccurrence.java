/**
 * Problem: Find the Index of the First Occurrence in a String (LeetCode #28)
 * Topic: String / Two Pointers
 * Time Complexity: O(N * M) where N and M are lengths of haystack and needle
 * Space Complexity: O(1)
 * 
 * Approach: Iterate through the haystack up to the point where the remaining 
 * characters are enough to fit the needle, then check for a substring match.
 */
class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int c=0;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                c++;
                if(c==needle.length())
                    return i;
            }
            else{
               break;

            }
                
            }
            
        }
        return -1;
    }
}
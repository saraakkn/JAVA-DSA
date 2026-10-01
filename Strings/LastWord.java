/**
     * Problem: Length of Last Word (LeetCode #58)
     * Topic: String Manipulation
     * Time Complexity: O(N) - due to trim() and substring operations traversing the string
     * Space Complexity: O(N) - string allocation for trim and substring in Java
     * 
     * Approach: Trim trailing/leading spaces, find the index of the last space, 
     * and extract the final word to return its length.
     */
    class LastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
       String ns=" ";
       ns=s.substring(s.lastIndexOf(' ')+1,s.length());
        return ns.length();
    }
}
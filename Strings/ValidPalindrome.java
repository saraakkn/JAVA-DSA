class ValidPalindrome {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch))
                sb.append(Character.toLowerCase(ch));
        }

        String ns = sb.toString();

        int start = 0;
        int end = ns.length() - 1;

        boolean palindrome = true;

        while (start < end) {

            if (ns.charAt(start) != ns.charAt(end)) {
                palindrome = false;
                break;
            }

            start++;
            end--;
        }

        return palindrome;
    }
}

class LongestCommonPrefix {
    public String longestPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            if (strs[i].length() == 0)
                return "";

            for (int j = 0; j < prefix.length() && j < strs[i].length(); j++) {

                if (prefix.charAt(j) != strs[i].charAt(j)) {
                    prefix = prefix.substring(0, j);
                    break;
                }

                if (j == strs[i].length() - 1) {
                    prefix = prefix.substring(0, j + 1);
                }
            }
        }

        return prefix;
    }
}

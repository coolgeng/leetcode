import java.util.*;

class ScrambleString {
	public boolean isScramble(String s1, String s2) {
		if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();
        Arrays.sort(s1_arr);
        Arrays.sort(s2_arr);
        if (!String.valueOf(s1_arr).equals(String.valueOf(s2_arr))) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        
        for (int i = 1; i < s1.length() ; i ++) {
            String s1_left = s1.substring(0, i);
            String s1_right = s1.substring(i);
            
            String s2_left = s2.substring(0,i);
            String s2_right = s2.substring(i);
            if (isScramble(s1_left, s2_left) && isScramble(s1_right, s2_right)) {
                return true;
            }
            s2_left = s2.substring(0, s2.length() - i);
            s2_right = s2.substring(s2.length() - i);
            if (isScramble(s1_left, s2_right) && isScramble(s1_right, s2_left)) {
                return true;
            }
        }
        return false;
	}

	public static void main(String[] args) {
		
	}
}
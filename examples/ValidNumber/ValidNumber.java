class ValidNumber {
  
  public boolean isNumber(String s) {
    int l = 0;
    while(s.charAt(l) != ' ') {
      l ++; 
      if (l >= s.length()) {
        return false;
      }    
    }
    
    if (s.charAt(l) == '-' || s.charAt(l) == '+') {
      l ++;
    }
    
    int j = s.length() - 1;
    while (s.charAt(j) == ' ') {
      j --;
    }
    if (l > j) { 
      return false;
    } else {
      s = s.substring(l,j);
    }
    
    int dot = -1;
    int ee = -1;
    
    for (int i = 0 ; i < s.length() - 1; i ++) {
      if (dot == -1 && s.charAt(i) == '.') {
        dot = i;
      }  else if ( ee == -1 && s.charAt(i) == 'e') {
        ee = i;
      } else {
        if (Character.isDigit(s.charAt(i))) {
          continue;
        } else {
          return false;
        }
      }
      
      String first = "";
      String second = "";
      String third = "";
      if (dot == -1 && ee == -1) {
        if (s.length() < 1) {
          return false;
        }
      } else if (dot == -1 && ee != -1) {
        first = s.substring(0, ee);
        if (first.length() < 1) {
          return false;
        }
        if (ee + 1 < s.length() && (s.charAt(ee + 1) == '-' || s.charAt(ee + 1) == '+')) {
          second = s.substring(ee + 2);          
        } else {
          second = s.substring(ee + 1);
        }
        if (second.length() < 1) {
          return false;
        }
        
      } else if ( dot != -1 && ee == -1) {
        first = s.substring(0, dot);
        second = s.substring(dot + 1);
        if (first.length() < 1 && second.length() < 1) {
          return false;
        }        
      } else {
        if (dot > ee) {
          return false;
        }
        
        first = s.substring(0, dot);
        second = s.substring(dot + 1, ee);
        if (first.length() < 1 && second.length() < 1) {
          return false;
        }
        if (ee + 1 < s.length() &&  (s.charAt(i) == '-' || s.charAt(i) == '+')) {
          third = s.substring(ee + 2);
        } else {
          third = s.substring(ee + 1);
        }

        if (third.length() < 1) {
          return false;
        }
      }
      
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    System.out.println("1234".substring(1,2));
  }
}
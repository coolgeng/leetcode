import java.util.ArrayDeque;

class SimplifyPath{
  public String simplifyPath(String path) {
       String[] splits = path.split("/");
           ArrayDeque<String> stack = new ArrayDeque<String>();
           for (String split : splits) {
               if (!split.isEmpty()) {
                   if (split.equals("..")) {
                       if (!stack.isEmpty()) {
                           stack.removeLast();
                       }
                   } else if (split.equals(".")) {
                       continue;
                   } else {
                       stack.offerLast(split);
                   }
               }
           }
           StringBuilder newPath = new StringBuilder();
           for (String s : stack) {
               newPath.append('/');
               newPath.append(s);
           }
           return newPath.length() == 0 ? "/" : newPath.toString();
   }
		 
	public static void main(String[] args) {
		SimplifyPath sp = new SimplifyPath();
		String test1 = "a/b/../c";
		String test2 = "a/b/../../c/d///e/f";
		System.out.println(sp.simplifyPath(test1));
		System.out.println(sp.simplifyPath(test2));		
	}
}
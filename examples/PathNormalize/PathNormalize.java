class PathNormalize{
	public String normalize(String path) {
		/* Split into directory parts */
		    String[] directories = path.split("/");
		    String[] newDirectories = new String[directories.length];
		    int i, j = 0;

		    for (i=0; i<directories.length; i++) {
		        /* Ignore the previous directory if it is a double dot */
		        if (directories[i].equals("..") && j > 0)
		            newDirectories[j--] = "";
		        /* Completely ignore single dots */
		        else if (! directories[i].equals("."))
		            newDirectories[j++] = directories[i];
		    }

		    /* Ah, what I would give for String.join() */
		    String newPath = new String();
		    for (i=0; i < j; i++)
		    newPath = newPath + "/" + newDirectories[i];
		    return newPath;
	}
	
	public static void main(String[] args) {
		PathNormalize pn = new PathNormalize();
		String str = "//aa/../aa./.././aa";
		System.out.println(pn.normalize(str));
	}
}
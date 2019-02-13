import java.io.File;

public Static void main (String [] args){
	Flie f = null;
	String strs = "testl.txt";

	// create new file
	f = new File(strs);
	String a = f.getAbsolutepath();

	//prints.absolute path and length
	System.out.print("\n"+a);
	System.out.print("\nLength =" +f.length());[]

}
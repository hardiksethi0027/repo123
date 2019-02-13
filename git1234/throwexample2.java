import java.util.scanner;
class ThrowExample{
	public static void main(String [] args){
	int day;
	boolean flag=true;
	Scanner sc =newScanner(System.in);
	while(flag){
		try{
			System.out.print("enter day: ")
			day=sc.nextInt();
			if(day<1 || day>31)
				throw new Exception("Exception: Invalid")
			else 
			{
				System.out.print("\nEntered day =" +day);
				flag=false;


			}
		}
        }
        
		Catch(Exception e){

		
	}
	}
}
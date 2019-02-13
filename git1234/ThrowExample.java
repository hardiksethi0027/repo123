class ThrowExample{
	public static void main(String[] args){

		try{
			throw new ArithmeticException("Exception throw")
		} 
		catch(ArithmeticException e){
			System.out.print(e.toString());

		}
		finally{
			System.out.print("finally");
		}
		
	}
}
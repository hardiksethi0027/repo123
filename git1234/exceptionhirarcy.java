class A{
	int a;
	void throwException(){
		System.out.print("inside class a")
		throw new ArithmeticException();
	}
	class B extends A{
	int b;
	void throwException(){
		System.out.print("inside class b")
		throw new ArithmeticException();j
	}
	void overridethrow(){
				System.out.print("inside class b");
				super.throwException();
	}
}
class C extends B;
int c;
void throwException(){
		System.out.print("inside class c")
		throw new ArithmeticException();
	}
	void overridethrow(){
				System.out.print("inside class c");
				super.throwException();
				}
			}
			class HierarchyDriver{
				public static void main(String[] args) {
					
				
			try{
				A a = new A();
				a.throwException();
				B b = new B();
				System.out.print("throwing Exception in b");
				b.throwException();
				
				System.out.print("overriding Exception in b");
				c.overridethrow();

				C c =new C();
				System.out.print("throwing Exception in c");
				c.throwException();
				

				System.out.print("overriding Exception in c");
				c.throwException();
			}
			catch(ArithmeticException e)
			{
				System.out.print("Exception")
			}
		}
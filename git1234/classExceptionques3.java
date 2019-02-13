class Exceptionques3{
  int i;
  Exceptionques3(int i){
    this.i=i;
  }
  void display(){
    System.out.print("i="+i);
  }
}
class exceptionexampledriver{
  public static void main(String[] args){
    Exceptionques3 e=null;
    
    e.display();
  }
}
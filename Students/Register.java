package Students ;

abstract class Register {

     private  String  name ;
   private  int age ;
   public void setName (String name ){
    this.name= name;
   }
   public void setAge (int age){
    this.age = age;
   }
   public String getName (){
    return name;
   }
   public int getAge (){
    return age;
   }

     Register(String name , int age){
        this.name = name;
        this.age = age;


    }
    abstract void aboutStudent();
    public void section(){};
                                                                                                                                                                                                                                                                                                                                                                                             
}

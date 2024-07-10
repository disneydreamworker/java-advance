package generic.genericmethodEx;

public class Box <T>{

     private T type;

     public T get(){  //제너릭 메서드 get
       return type;
     }

     public void Set(T type){ //제너릭 메서드 set
       this.type = type;
     }

}

package lambda.day03;

//Person 클래스가 계산기를 이용해서 계산을 한다.
public class Person2 {

       public Member getMember1(CreateIdMember creatable){
          String id = "ssg-manger";
          Member member = creatable.create(id);
          return member;
       }

       public Member getMember2(CreateIdnameMember creatable){
         String id = "ssg-manger";
         String name ="이어진";
         Member member = creatable.create(id,name);
         return member;
       }


}

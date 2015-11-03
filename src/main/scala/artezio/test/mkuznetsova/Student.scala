package artezio.test.mkuznetsova

/**
 * Created by Maria on 01.11.15.
 */
class Student (name: String, age: Integer, cource: Integer, isRecovered: Boolean=false) extends Person(name,age){
  println("new student is added")
  def study(mood:Boolean):String=mood.toString;

  override def getInfo(): String = "student's information: name-"
    .concat(name)
    .concat("; age-")
    .concat(age.toString)
}

object Student {
  def applay(name:String, age:Integer):Student = new Student(name,age,1);
  def applay(name:String, age:Integer, cource:Integer):Student = new Student(name,age,cource);
  def applay(name:String, age:Integer, cource:Integer, isRecovered:Boolean):Student = new Student(name,age,cource,isRecovered);

}
package artezio.test.mkuznetsova

/**
 * Created by Maria on 01.11.15.
 */
class Teacher(name: String, age: Integer, academicDegree: String) extends Person(name, age) with ScinceWork{
  println("new teacher is added")
  def teach(condition: Condition):String=condition.toString;

  override def getInfo(): String = "teacher's information:"
    .concat(name)
    .concat("; age-")
    .concat(age.toString)
    .concat("; academicDegree-")
    .concat(academicDegree)
}

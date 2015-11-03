import artezio.test.mkuznetsova.{Teacher, Student}

/**
 * Created by Maria on 02.11.15.
 */
object mainObject extends App {
   println("Hello");

  val student = new Student("Mark",22,1);
  println(student.getInfo());

  val teacher = new Teacher("Pol",45,"doctor");
  println(teacher.getInfo());

  val apgradedTeacher = new Teacher("Pol",45,teacher.setNewAcademicDegree("superDoctor"))
  println(apgradedTeacher.getInfo());

  val student1 = Student.applay("Tom",19,2);
  println(student1.getInfo());
}

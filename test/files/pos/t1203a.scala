case class ant(t: String) extends scala.annotation.Annotation
object Test {
   def main(args: Array[String]): Unit = {
     val a: scala.xml.NodeSeq @ant("12") = Nil
     println(a)
   }
}

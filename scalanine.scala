object scalanine {
  def main(args: Array[String]): Unit = {

//Zad1:
    println("Zadanie 1:")

    class Container[A](private val value: A) {
      def getContent: A = value
      def applyFunction[R](function: A => R): R = function(value)
    }

    val marcin_najman = new Container[String]("Marcin Najman - Ludzie, ale tu nikogo nie ma!!!")
    println(marcin_najman.getContent)

    val marcin_najman_len = marcin_najman.applyFunction((m_n_l: String) => m_n_l.length)
    println(marcin_najman_len)

//Zad2:
    println("\n" + "Zadanie 2:")

    trait Maybe[+A] {}

    class No extends Maybe[Nothing] {}

    class Yes[A](val value: A) extends Maybe[A] {}

    val new_no = new No
    val new_yes = new Yes[Int](2136)

    val is_new_no = new_no.isInstanceOf[Maybe[_]]
    val is_new_yes = new_yes.isInstanceOf[Maybe[_]]

    println("Czy No jest podtypem Maybe[_]]?: " + is_new_no)
    println("Czy Yes jest podtypem Maybe[_]?: " + is_new_yes)

//Zad3:
    println("\n" + "Zadanie 3:")

    class YesNoContainer[A](private val value: Maybe[A]) {
      def applyFunction[R](function: A => R): Maybe[R] = {
        if (value.isInstanceOf[No]) {
          new No
        }
        else {
          new Yes[R](function(value.asInstanceOf[Yes[A]].value))
        }
      }
    }
    val marcin_najman_three = new YesNoContainer[String](new Yes[String]("Marcin Najman - STANOWSKI!!!"))
    val marcin_najman_three_len = marcin_najman_three.applyFunction((m_n: String) => m_n.length).asInstanceOf[Yes[Int]].value
    println(marcin_najman_three_len)

//Zad4:
    println("\n" + "Zadanie 4:")

    def getOrElse[A](value: Maybe[A], secondValue: A): A = {
      if (value.isInstanceOf[No]) {
        secondValue
      }
      else {
        value.asInstanceOf[Yes[A]].value
      }
    }

    val new_new_no = new No
    val new_new_yes = new Yes[String]("Marcin Najman - *odklepywanie*")

    println(getOrElse[String](new_new_no, "Marcin Najman - *stoi i czeka*"))
    println(getOrElse[String](new_new_yes, "Marcin Najman - *stoi i czeka*"))

  }
}
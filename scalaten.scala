object scalaten {
  def main(args: Array[String]): Unit = {

//Zad 1:
    println("Zadanie 1:")

    def generator = for {
      integer <- Iterator.from(1)
      divisor <- 1 until (integer + 1)
      if integer % divisor == 0
    } yield (integer, divisor)

    val generator_fin = generator.buffered

    println(generator_fin.next)
    generator_fin take 9 foreach println
    println(generator_fin.next)
    println(generator_fin.next)
    println(generator_fin.next)
    generator_fin take 7 foreach println

//Zad 2:
    println("\n" + "Zadanie 2:")

    trait Maybe[+A] {

      def getContent: A

      def map[B](function: A => B): Maybe[B] = {
        if (this.isInstanceOf[No]) {
          new No
        }
        else {
          val new_yes = this.asInstanceOf[Yes[A]]
          new Yes(function(new_yes.value))
        }
      }

      def flatMap[B](function: A => Maybe[B]): Maybe[B] = {
        if (this.isInstanceOf[No]) {
          new No
        }
        else {
          val new_yes = this.asInstanceOf[Yes[A]]
          function(new_yes.value)
        }
      }
    }

    class No extends Maybe[Nothing] {
      override def getContent = throw new NoSuchElementException()
    }

    class Yes[A](val value: A) extends Maybe[A] {
      override def getContent: A = value
    }

    val test_no: Maybe[String] = new No
    println(test_no.map(_ * 8))
    val test_yes: Maybe[String] = new Yes("Marcin Najman")
    println(test_yes.flatMap((m_n: String) => new Yes(m_n)).getContent)
  }
}
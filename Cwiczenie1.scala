import scala.annotation.tailrec
import scala.language.postfixOps
object Cwiczenie1 {
  val daysList = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def main(args:Array[String]): Unit = {

    //Zadanie1A
    def returnDaysA(days:List[String]):String = {
      var oneA:String = ""
      for (day <- days){
        oneA += day
        if(day != days.last) oneA += ", "
      }
      oneA
    }
    println("Zadanie 1A")
    println(returnDaysA(daysList))

    //Zadanie1B
    def returnDaysB(days:List[String]):String = {
      var oneB:String = ""
      for (day <- days){
        if (day.startsWith("P")){
          if(oneB == "") oneB += day
          else oneB += ", " + day
        }
      }
      oneB
    }
    println("Zadanie 1B")
    println(returnDaysB(daysList))

    //Zadanie1C
    def returnDaysC(days:List[String]):String = {
      var oneC:String = ""
      var i:Int = 0
      while (i < days.length) {
        oneC += days(i)
        if (i != (days.length - 1)) oneC += ", "
        i += 1
      }
      oneC
    }
    println("Zadanie 1C")
    println (returnDaysC(daysList))

    //Zadanie2A
    def recurencyList(days:List[String]):String = days match {
      case Nil => ""
      case day :: Nil => day
      case day :: tail => day + ", " + recurencyList(tail)
    }
    println("Zadanie 2A")
    println(recurencyList(daysList))

    //Zadanie2B
    def recurencyListReverse(days:List[String]):String = days match {
      case Nil => ""
      case day :: Nil => day
      case day :: tail => recurencyListReverse(tail) + ", " + day
    }
    println("Zadanie 2B")
    println(recurencyListReverse(daysList))

    //Zadanie3
    def recurencyListTail(days:List[String]):String = {
      @tailrec // Działa bez tego, ale dołączam zgodnie z wykładem
      def tailRecur(daysTail:List[String], three:String, acc:String):String =
        if (daysTail.isEmpty) acc
        else tailRecur(daysTail.tail, ", ", acc + three + daysTail.head)
      tailRecur(days, "", "")
    }
    println("Zadanie 3")
    println(recurencyListTail(daysList))

    //Zadanie4a
    def foldingLeft(days:List[String]):String = {
      days.foldLeft("")(_+_ + ", ")
    }
    println("Zadanie 4A")
    println(foldingLeft(daysList))

    //Zadanie4b
    def foldingRight(days:List[String]):String = {
      days.foldRight("")(_+", "+_)
    }
    println("Zadanie 4B")
    println(foldingRight(daysList))

    //Zadanie4c
    def foldingLeftP(days:List[String]):String = {
      days.filter(_.startsWith("P")).foldLeft("")(_+_ + ", ")
    }
    println("Zadanie 4C")
    println(foldingLeftP(daysList))

    //Zadanie5
    val consoles = Map("Playstation" -> 2300, "Xbox" -> 1800, "Nintendo" -> 1100, "SEGA" -> 1400, "Atari" -> 200)
    val consolesSale = consoles.map ({case(a, b) => (a -> b * 0.9)})
    println ("Zadanie 5")
    println(consolesSale)

    //Zadanie6
    val tupleExample = Tuple3("Tekst", 5, 21.37)
    def printTupleExample(tupleN:(String, Int, Double)):(String, Int, Double) = {
      tupleN
    }
    println("Zadanie 6")
    println(printTupleExample(tupleExample))

    //Zadanie7 (Korzystam z mapy z zadania 5)
    val nintendoPrice : Option[Int] = consoles.get("Nintendo")
    println("Zadanie 7")
    if (nintendoPrice.isDefined) println("Cena Nintendo: " + nintendoPrice.get)
    else println("Nie ma ceny Nintendo w cenniku.")

    //Zadanie8
    val numbers = List(2, 1, 3, 7, 0, 6, 0, 2, 0, 1, 0, 2, 3, 0)
    def removeZero(numbersExample:List[Int], acc:List[Int] = List.empty):List[Int] = numbersExample match {
      case Nil => acc.reverse
      case 0 :: a => removeZero(a, acc)
      case b :: a => removeZero(a, b :: acc)
    }
    println("Zadanie 8")
    println(removeZero(numbers))

    //Zadanie9 (korzystam z listy z zadania 8)
    def increaseByOne(numbersList:List[Int]):List[Int] = {
      numbersList.map(x => x+1)
    }
    println("Zadanie 9")
    println(increaseByOne(numbers))

    //Zadanie10
    val numbersReal = List(2.25, -1, -3, 7.32, 0.25, -6, 17, 2, 185.25, 1, 0, 2.99, 3.02, 0)
    def realToAbs(numbersList:List[Double]):List[Double] = {
      numbersList.filter(e => e >= -5 && e <= 12).map(math.abs)
    }
    println("Zadanie 10")
    println(realToAbs(numbersReal))
  }
}
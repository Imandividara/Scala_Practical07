object PrimeFilter {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) false
    else (2 until num).forall(i => num % i != 0)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num))
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    
    println(s"Input List: $inputList")
    println(s"Prime Numbers: $primeNumbers")
  }
}

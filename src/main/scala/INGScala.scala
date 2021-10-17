object INGScala {

  def main(args: Array[String]): Unit = {
    println(reverseListandStrings(List("Test", "Scala")))
    println(countNames(List( List("Anna", "Anna", "Bob"), List("Bob", "Robert", "Juliet") )))
  }

  /**
   * Reverses a list and strings inside of the list
   * @param list of strings
   * @return list of strings (both strings and list are reversed)
   */
  def reverseListandStrings(list: List[String]): List[String] = {
    list match {
      case Nil => list
      case head :+ tail => List(reverseString(tail)) ::: reverseListandStrings(head)
      case _ => Nil
    }
  }

  /**
   * Reverses a string
   * @param string string to reverse
   * @return reversed string
   */
  def reverseString(string: String): String = {
    if (string.length == 1) { string }
    else { reverseString(string.tail) + string.head }
  }

  /**
   * Counts names in a list of lists
   * @param cities list of lists of names
   * @return tuples with counted names
   */
  def countNames(cities: List[List[String]]): List[(String, Int)] = {
    val names = cities.flatten;
    val grouped = names.groupBy(x => x)
    val mapped = grouped.map( {case (key, value) => (key, value.length)})
    val tuples = mapped.toList
    tuples.sortBy(- _._2)
  }
}

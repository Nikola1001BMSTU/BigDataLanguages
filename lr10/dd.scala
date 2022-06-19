scala.io.Source.fromFile("file.txt")
  .getLines
  .flatMap(_.split("\\W+"))
  .foldLeft(Map.empty[String, Int]){
     (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
  }
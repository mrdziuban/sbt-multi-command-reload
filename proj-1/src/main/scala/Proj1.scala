object Proj1 {
  def main(args: Array[String]): Unit = {
    @annotation.tailrec
    def go(): Unit = {
      println("proj 1")
      Thread.sleep(1000)
      go()
    }

    go()
  }
}

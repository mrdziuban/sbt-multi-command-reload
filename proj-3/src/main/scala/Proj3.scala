object Proj3 {
  def main(args: Array[String]): Unit = {
    @annotation.tailrec
    def go(): Unit = {
      println("proj 3")
      Thread.sleep(1000)
      go()
    }

    go()
  }
}

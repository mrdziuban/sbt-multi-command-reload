object Proj2 {
  def main(args: Array[String]): Unit = {
    @annotation.tailrec
    def go(): Unit = {
      println("proj 2")
      Thread.sleep(1000)
      go()
    }

    go()
  }
}

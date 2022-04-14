@main def hello: Unit = 
  println("Hello world!")
  println(msg)
  Thread.sleep(60000)

def msg = "I was compiled by Scala 3. :)"

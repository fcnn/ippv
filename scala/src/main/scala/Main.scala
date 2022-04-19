
import System.currentTimeMillis

@main def hello: Unit =
  println(msg)
  val startPoint = new Vector3D(-2.6020236,0.505,0.62921506)
  val endPoint = new Vector3D(-7.612,0.12,-1.291)
  val angle = 200.9707489013672;
  val direction = new Vector3D(-9.337632616913318,0.0,-3.5789128393349467)
  val speed = 18.5
  run(startPoint,endPoint,direction,angle,speed)

def run(startPoint:Vector3D,endPoint:Vector3D,direction:Vector3D,angle:Double,speed:Double): Unit = {
  checkAngle(startPoint,endPoint,angle,direction)

  for (_ <-  0 to 5) {
    println(currentTimeMillis)
    Thread.sleep(1000)
  }
}

def checkAngle(src: Vector3D, dest: Vector3D, angle: Double,direction:Vector3D) = {
  val v1 = new Vector3D(dest.x - src.x, 0, dest.z - src.z)
  val v0 = direction.clone
  v1.normalize
  v0.normalize
  val v = new Vector3D(v1.x-v0.x,v1.y-v0.y,v1.z-v0.z)

  printf(">>>>> diff:%.10f %s %f %f\n",v.magnitude,v,angle,direction.angle*180/Math.PI)
}

def msg = "I was compiled by Scala 3. :)"

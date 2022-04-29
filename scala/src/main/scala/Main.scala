
import System.currentTimeMillis

@main def hello: Unit =
  println(msg)
  val startPoint = Vector3D(-4.9980955,0.15850002,-4.174668)
  val endPoint = Vector3D(-12.153134,0.12,-6.5270867)
  val angle = 198.19972229003906;
  val direction = Vector3D(-9.499735653862215,0.0,-3.123303140385034)
  val height = 2.52
  val speed = 18

  checkAngle(startPoint,endPoint,angle,direction)
  run(startPoint,endPoint,direction,angle,speed,height)

def run(startPoint:Vector3D,endPoint:Vector3D,direction:Vector3D,angle:Double,speed:Double,height:Double): Unit = {
  val period = 200
  val width = speed * period/1000
  val src = startPoint.clone
  val dest = endPoint

  val step = direction.clone
  step.normalize
  step.scale(speed*period/1000)

  val startTime = currentTimeMillis - period
  var elapsed:Long = period
  for (i <- 1 to 20) {
    src.add(step)
    printf("-> [%d] %4d %f %s\n", i, elapsed, Vector3D.sub(dest,src).magnitude, src)
    Thread.sleep(period - (elapsed%period))
    elapsed = currentTimeMillis - startTime
  }
}

def checkAngle(src: Vector3D, dest: Vector3D, angle: Double,direction:Vector3D): Unit = {
  val v1 = Vector3D(dest.x - src.x, 0, dest.z - src.z)
  val v0 = direction.clone
  v1.normalize
  v0.normalize
  val v = Vector3D(v1.x-v0.x,v1.y-v0.y,v1.z-v0.z)

  val d = Vector3D.sub(dest,src)
  printf(">>>>> distance:%f dir:%.10f angle:%f\n",d.magnitude,v.magnitude,angle-direction.angle*180/Math.PI)
}

def msg = "I was compiled by Scala 3. :)"

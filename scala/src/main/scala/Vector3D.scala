class Vector3D(var x:Double,var y:Double,var z:Double) {
  def normalize: Unit =
    val m = magnitude
    x /= m
    y /= m
    z /= m

  def magnitude:Double =
    //Math.sqrt(x*x+y*y+z*z)
    Math.sqrt(x*x+z*z)

  def scale(magnitude:Double): Unit =
    x *= magnitude
    y *= magnitude
    z *= magnitude

  def add(v:Vector3D): Unit =
    x += v.x
    y += v.y
    z += v.z

  def sub(v:Vector3D): Unit =
    x -= v.x
    y -= v.y
    z -= v.z

  def angle: Double =
    val angle = Math.acos(x / Math.sqrt(x*x+z*z))
    if (z<0)
      Math.PI*2 - angle
    else
      angle

  def dot(v: Vector3D) : Double =
    x*v.x+y*v.y+z*v.z

  def cross(v: Vector3D) : Vector3D =
    Vector3D(y*v.z-z*v.y,z*v.x-x*v.z,x*v.y-y*v.x)

  override def toString: String =
    "("+x+','+y+','+z+")"

  override def clone: Vector3D =
    Vector3D(x,y,z)
}

object Vector3D {
  def sub(v1:Vector3D,v2:Vector3D): Vector3D =
    Vector3D(v1.x-v2.x,v1.y-v2.y,v1.z-v2.z)

  def add(v1:Vector3D,v2:Vector3D): Vector3D =
    Vector3D(v1.x+v2.x,v1.y+v2.y,v1.z+v2.z)
}

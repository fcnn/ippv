class Vector3D(var x:Double,var y:Double,var z:Double) {
  def normalize: Unit =
    val m = magnitude
    x /= m
    y /= m
    z /= m

  def magnitude:Double =
    Math.sqrt(x*x+y*y+z*z)

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
    "("+x+','+y+'.'+z+")"

  override def clone: Vector3D =
    Vector3D(x,y,z)
}

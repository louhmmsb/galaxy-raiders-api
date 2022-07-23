package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  radius: Double
) : SpaceObject(
  "Explosion",
  'E',
  initialPosition,
  Vector2D(0.0, 0.0),
  radius,
  0.0
) {
  private var duration: Long = DURATION

  fun step(dt: Long) {
    if (duration > 0)
      duration -= dt
  }

  fun isTriggered(): Boolean {
    return duration > 0
  }

  companion object {
    private const val DURATION: Long = 5
  }
}

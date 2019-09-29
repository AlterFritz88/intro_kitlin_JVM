class Position(var x: Int, var y: Int)

abstract class Navigator(val pos: Position) {
    abstract fun checkPath(path: Array<Direction>, radius: Int) : Boolean
}

class SimpleNavigator(pos: Position) : Navigator(pos) {
    override fun checkPath(path: Array<Direction>, radius: Int): Boolean {
        for (dir in path) {
            if (dir == Direction.UP) this.pos.y++
            else if (dir == Direction.DOWN) this.pos.y--
            else if (dir == Direction.LEFT) this.pos.x--
            else this.pos.x++
            if (Math.abs(this.pos.x) > radius && Math.abs(this.pos.y) > radius) return false
        }
        if (Math.abs(this.pos.x) <= radius && Math.abs(this.pos.y) <= radius) return true
        else return false
    }
}

fun main(args: Array<String>) {
    val nav = SimpleNavigator(Position(0, 0))
    val path = arrayOf(Direction.UP, Direction.LEFT, Direction.LEFT, Direction.UP, Direction.LEFT, Direction.UP, Direction.RIGHT, Direction.UP, Direction.UP, Direction.UP, Direction.RIGHT)
    val radius = 5
    print(nav.checkPath(path, radius))

}
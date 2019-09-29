enum class Direction {
    UP, RIGHT, DOWN, LEFT
}

class Navigator1() {
    fun checkPath(path: Array<Direction>, radius: Int): Boolean {
        var init_x = 0
        var init_y = 0
        for (dir in path) {
            if (dir == Direction.UP) init_y++
            else if (dir == Direction.DOWN) init_y--
            else if (dir == Direction.LEFT) init_x--
            else init_x++
            if (Math.abs(init_x) > radius && Math.abs(init_y) > radius) return false
        }
        if (Math.abs(init_x) <= radius && Math.abs(init_y) <= radius) return true
        else return false
    }
}


fun main(args: Array<String>) {
    val nav = Navigator1()
    val path = arrayOf(Direction.UP, Direction.LEFT, Direction.LEFT, Direction.UP, Direction.LEFT, Direction.UP, Direction.RIGHT, Direction.UP, Direction.UP, Direction.UP, Direction.RIGHT)
    val radius = 5
    print(nav.checkPath(path, radius))

}
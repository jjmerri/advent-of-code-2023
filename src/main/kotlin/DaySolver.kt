import java.io.BufferedReader
import java.io.FileReader

abstract class DaySolver(inputFileName: String) {
    val input = BufferedReader(FileReader("src/main/resources/puzzle_inputs/$inputFileName"))

    abstract fun solvePart1(): String
    abstract fun solvePart2(): String
}

class Day1 : DaySolver("day1.txt") {
    override fun solvePart1(): String {
        var line: String?
        var sum = 0
        while (input.readLine().also { line = it } != null) {
            val numbers = line!!.replace(Regex("[^0-9]"), "")
            sum += (numbers[0].toString() + numbers[numbers.length - 1]).toInt()
        }

        return sum.toString()
    }

    // "eightwo" should translate to "82" not "88"
    // so building on part 1 solution, we can inject the digit in between the word to not mess up future replacements
    override fun solvePart2(): String {
        var line: String?
        var sum = 0
        while (input.readLine().also { line = it } != null) {
            val numbers = line!!.replace("one", "one1one").replace("two", "two2two").replace("three", "three3three")
                .replace("four", "four4four")
                .replace("five", "five5five").replace("six", "six6six").replace("seven", "seven7seven")
                .replace("eight", "eight8eight")
                .replace("nine", "nine9nine").replace(Regex("[^0-9]"), "")
            sum += (numbers[0].toString() + numbers[numbers.length - 1]).toInt()
        }

        return sum.toString()
    }
}

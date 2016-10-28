package basic

/**
 * @author Leon
 */
class ListTest {
    static void main(args) {
        def numbers = [1, 2, 3, 4, 5]
        println(numbers[2])
        println(numbers << 6)

        def result = ["name":"liuqq","age":12]
        println(result.name)

        def str = 1..9
        println(str)
    }
}

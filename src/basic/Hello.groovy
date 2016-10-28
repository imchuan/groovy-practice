package basic

/**
 * @author Leon
 */
class Hello {
    static void main(args){
        println("Please enter your name: ")
        def name = Console.readLine()
        println("your name is ${name}")
    }
}

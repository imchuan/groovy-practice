package basic

/**
 * @author Leon
 */
class StringTest {
    void testExpression() {
        def age = 25
        println('My age is ${age}')
        println("My age is ${age}")
        println("""My age is ${age}""")
        println("My age is \${age}")

        def str = "Hello Groovy"
        println(str[0]) // H; 获取第0个字符
        println(str[-2]) // v; 获取倒数第二个字符
        println(str[1..2]) //el; 获取索引从1到2之间的字符
        println(str[1..<4]) //ell; 获取索引从1到3之间的字符
        println(str[4..2]) //oll; 获取索引4到2之间的字符
        println(str[1,3,4]) //elo; 获取索引为1、3、4的字符

        println("he"*3)
        println(str.size()) // 获取字符串长度
        println(str.length()) // 获取字符串长度
        println(str.count("l")) // 统计某个字符串出现的次数
        println(str.contains("l")) // 统计某个字符串是否包含指定的字符串

    }

    static void main(args) {
        new StringTest().testExpression()
    }
}

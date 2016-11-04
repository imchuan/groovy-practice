package methods

/**
 * @author Leon
 */

// 定义一个方法
def say() {
    println "Hello"
}

// 定义带参数的方法
def greetings(name) {
    println "Hello ${name}"
}

// 定义带参数的方法
def greetings1(name = "world") {
    println "Hello ${name}"
}

greetings("Leon")
greetings1()
greetings1("Leon")
def s = 0
// 方法返回值
def cal(a, b) {
    return a + b
}

def total = cal(1,2)
println total

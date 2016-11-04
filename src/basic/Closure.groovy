package basic
/**
 * 闭包
 * @author Leon
 */
def cols = {
    for (i in 1..9) {
        println i
    }
}
// 参数化
def cols1 = { str -> println str }
cols1.call("Leon")
cols1("Hello World")

// 单个隐参数
def cols2 = { println it }
cols2("Hello cols2")

// 访问变量
def wel = "Hello"
def say = { params -> println "${wel},${params}" }
say("Leon")

wel = "Welcome"
say("Leon")


[1, 2, 3, 4, 5].each { println it }
def student = ["name": "Leon", "age": 25]
student.each { println "${it.key} = ${it.value}" }

def nums = [1, 2, 3, 4, 5]
nums.each { num -> if (num == 2) println num }

def result = nums.find({ it > 3 }) // 返回第一个符合条件的值
println "result = $result"
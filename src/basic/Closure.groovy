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
def cols2 = {println it}
cols2("Hello cols2")
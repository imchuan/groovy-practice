package basic

/**
 * @author Leon
 */
// 定义一个整数型列表
def numbers = [1, 2, 22, 44]
assert numbers[0] == 1 // 断言第一个元素是否等于1
assert numbers[2] == 22
// 索引可以是负数,表示从列表的结尾往前数
assert numbers[-2] == 22

// 可以使用范围(start..end)操作列表，返回一个新的列表
println numbers[0..2] // 返回 [1, 2, 22]，包括end边界
println numbers[0..<2] // 返回 [1, 2]，不包括end边界

// 赋值
numbers[0] = 3
println numbers

numbers[0] = [3, 2]
println numbers

// 将元素追加到列表的最后
numbers << 33
println numbers

// 链接两个列表
def n = [1, 2, 3]
def b = n + [55, 66]
println b

// 删除一个元素
def c = b - [66]
println c
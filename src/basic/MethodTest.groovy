package basic

/**
 * @author Leon
 */
def add(a, b) {
    println a + b
}

add(1, 2)

def getName(name = "Leon") {
    println name
}

getName()
getName("Leon Liu")

def subtract(a, b) {
    return a - b
}

println subtract(2, 1)

def subtract2(a, b) {
    a - b
}

println subtract(2, 1)

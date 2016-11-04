package library

/**
 * @author Leon
 */

def library = [["ken", "Groovy"], ["Ken", "UML"], ["John", "Java"]]
library << ["John", "000"]
library.add(["Sally", "Basic"])

println("Library: $library")

println "Ken has borrowed UML? ${library.contains(['Ken', 'UML'])}"

println "Number of books on loan: ${library.size()}"

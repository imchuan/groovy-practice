package library

/**
 * @author Leon
 */

def library = ["ken": ["Groovy", "UML"], "John": ["java"]]
library["Sally"] = ["Basic"]
library["ken"] = library["ken"] << "000"

println("Library: $library")

println "Ken has borrowed UML? ${library['ken'].contains('UML')}"

println "Number of books on loan: ${library.size()}"

println "Library: ${library.keySet().sort()}"

println "Number of books borrowed by ken: ${library['ken'].size()}"

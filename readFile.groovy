def readFile(String name){
    new File(name).eachLine { String line ->
        println line
    }
}

readFile('d:/temp/input01.txt')
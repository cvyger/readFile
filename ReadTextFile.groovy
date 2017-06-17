class ReadTextFile{
    void read(String name){
        new File(name).eachLine { String line ->
            println line
        }
    }
}
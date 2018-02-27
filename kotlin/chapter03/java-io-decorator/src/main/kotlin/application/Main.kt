package application

import java.io.*

fun main(args: Array<String>) {
    try {
        val inputStream: InputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("./input/test.txt")))

        var character = inputStream.read()
        while (character >= 0) {
            print(character.toChar())
            character = inputStream.read()
        }

        inputStream.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}
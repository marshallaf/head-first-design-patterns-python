package application

import java.io.FilterInputStream
import java.io.IOException
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream): FilterInputStream(inputStream) {
    override fun read(): Int {
        val character = super.read()
        return when (character) {
            -1 -> character
            else -> character.toChar().toLowerCase().toInt()
        }
    }

    override fun read(byteArray: ByteArray?, offset: Int, length: Int): Int {
        val result = super.read(byteArray, offset, length)

        for (i in offset until (offset + result)) {
            val byte = byteArray?.get(i) ?: throw IOException()
            byteArray[i] = byte.toChar().toLowerCase().toByte()
        }
        return result
    }
}
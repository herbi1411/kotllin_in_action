package p4

import java.io.File

object CaseInsensitiveFileComperator : Comparator<File> {
    override fun compare (file1: File, file2: File) : Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}
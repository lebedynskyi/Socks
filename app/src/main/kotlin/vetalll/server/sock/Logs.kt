package vetalll.server.sock

internal const val ANSI_RESET = "\u001B[0m"
internal const val ANSI_BLACK = "\u001B[30m"
internal const val ANSI_RED = "\u001B[31m"
internal const val ANSI_GREEN = "\u001B[32m"
internal const val ANSI_YELLOW = "\u001B[33m"
internal const val ANSI_BLUE = "\u001B[34m"
internal const val ANSI_PURPLE = "\u001B[35m"
internal const val ANSI_CYAN = "\u001B[36m"
internal const val ANSI_WHITE = "\u001B[37m"

internal fun writeDebug(tag: String, msg: Any) {
    println("$ANSI_RESET D: $tag: $ANSI_RESET$msg")
}

fun writeInfo(tag: String, msg: Any) {
    println("$ANSI_BLUE I: $tag: $ANSI_RESET$msg")
}

fun writeError(tag: String, msg: Any, e: Throwable) {
    System.err.println("$ANSI_RED E: $tag: $ANSI_RESET$msg")
    e.printStackTrace()
}

internal fun writeError(tag: String, msg: Any) {
    System.err.println("$ANSI_RED E: $tag: $ANSI_RESET$msg")
}

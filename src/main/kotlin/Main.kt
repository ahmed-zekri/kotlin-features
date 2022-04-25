import Height.Companion.toMeterHeight
import Width.Companion.toMeterWidth

fun main() {
    val rect = Rect(5.toMeterWidth {
        Width(it * 1000)
    }, 10.toMeterHeight())
    rect.print()

}

class Rect(private var width: Width, private var height: Height) {


    fun print() {
        println("$width $height")


    }

}

@JvmInline
value class Width(private val width: Int) {

    init {
        require(width > 0) { "Args must be non null" }

    }


    companion object {

        inline fun Int.toMeterWidth(callback: (Int) -> Width) = callback(this)


    }


}


@JvmInline
value class Height(private val height: Int) {

    init {
        require(height > 0) { "Args must be non null" }
        ::inlineFunction.invoke {


        }

    }


    operator fun times(multiplier: Int) = height * multiplier


    companion object {

        fun Int.toMeterHeight() = Height(this * 1000)


    }

    private inline fun inlineFunction(callback: () -> Unit) = callback()


}
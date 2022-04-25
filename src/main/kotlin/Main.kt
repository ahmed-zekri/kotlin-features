import Height.Companion.toMeterHeight
import Width.Companion.toMeterWidth
import java.lang.invoke.MethodHandles.loop

fun main(args: Array<String>) {
    val rect = Rect(5.toMeterWidth {

    }, 10.toMeterHeight())
    rect.print()
    println(rect.height * 20)
}

val a by ""

private operator fun String.getValue(nothing: Nothing?, property: KProperty<*>): Any {

}

class Rect {
    lateinit var height: String
    lateinit var width: Array<Char>

    constructor(a: Width, b: Height) {
        println("dfd")
        this.width = a
        this.height = "cdscsd"
    }


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
        fun Int.toMeterWidth(fn: (String) -> Unit) = Width(this * 1000)


    }


}


@JvmInline
value class Height(private val height: Int) {

    init {
        require(height > 0) { "Args must be non null" }
        dff(::ddf)

    }

    fun ddf() {
        loop{}
        val a= listOf(1,2,5)
        a.forEach(fun(v:Int){
            return

        })

    }
    operator fun times(multiplier: Int) = height * multiplier


    companion object {
        fun Int.toMeterHeight() = Height(this * 1000)


    }

    fun dff(a: () -> Unit) {}


}
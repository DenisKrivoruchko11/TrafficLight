package styles

import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.Stylesheet
import tornadofx.cssclass
import tornadofx.mm

class TrafficLightStyle : Stylesheet() {
    companion object {
        val mainBlock by cssclass()

        val redCircle by cssclass()
        val yellowCircle by cssclass()
        val greenCircle by cssclass()

        private const val mainBlockSpacing = 5
    }

    init {
        mainBlock {
            spacing = mainBlockSpacing.mm
            alignment = Pos.CENTER
            backgroundColor += Color.BLACK
        }

        redCircle { fill = Paint.valueOf("Red") }

        yellowCircle { fill = Paint.valueOf("Yellow") }

        greenCircle { fill = Paint.valueOf("Green") }
    }
}

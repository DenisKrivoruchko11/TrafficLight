package views

import styles.TrafficLightStyle
import tornadofx.View
import tornadofx.addClass
import tornadofx.circle
import tornadofx.vbox

class TrafficLightView : View() {
    override val root = vbox {
        addClass(TrafficLightStyle.mainBlock)

        circle(radius = 100.0) { addClass(TrafficLightStyle.redCircle) }

        circle(radius = 100.0) { addClass(TrafficLightStyle.yellowCircle) }

        circle(radius = 100.0) { addClass(TrafficLightStyle.greenCircle) }
    }
}

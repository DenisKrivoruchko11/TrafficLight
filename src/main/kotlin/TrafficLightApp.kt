import styles.TrafficLightStyle
import tornadofx.App
import tornadofx.launch
import views.TrafficLightView

class TrafficLightApp : App(TrafficLightView::class, TrafficLightStyle::class)

fun main() {
    launch<TrafficLightApp>()
}

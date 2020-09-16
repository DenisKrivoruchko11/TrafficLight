import styles.TrafficLightStyle
import tornadofx.App
import tornadofx.launch
import views.TrafficLightView

class TicTacToeApp : App(TrafficLightView::class, TrafficLightStyle::class)

fun main() {
    launch<TicTacToeApp>()
}
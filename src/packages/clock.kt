package Clock
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.collections.map

class Time(){
  var hour: Int = 0
  var minute: Int = 0
  var second: Int = 0
  init {
    this.update()
  }
  fun update(){
    val now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    val timeArray = now.split(":").map{elem -> elem.toInt()}
    this.hour = timeArray[0]
    this.minute = timeArray[1]
    this.second = timeArray[2]
  }
}

class Clock(){

}

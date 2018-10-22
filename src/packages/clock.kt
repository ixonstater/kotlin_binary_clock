package Clock
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import kotlin.collections.map


class Clock(){
  var currentTime = Time()
  var previousTime = Time()
  val converter = Converter()
  val updater = Updater()
  fun runClock(){
    currentTime.update()
    updater.update(converter.convert(currentTime))
  }
}

class Time(){
  lateinit var timeDigits: List<Int>
  init {
    this.update()
  }
  fun update(){
    this.timeDigits = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss")).chunked(1).map{x -> x.toInt()}
  }
}

class Converter(){
  class BinaryTime(){
    var binTimeDigits = Array<CharArray>(6){CharArray(4)}
  }
  fun convert(time: Time) : BinaryTime{
    val binTime = BinaryTime()
    for (indx in 0..5){
      binTime.binTimeDigits[indx] = this.intToBinary(time.timeDigits[indx])
    }
    return binTime
  }
  fun intToBinary(num: Int) : CharArray{
    val retVal = num.toString(2).toCharArray()
    return retVal
  }
}

class Updater(){
  fun update(binTime: Converter.BinaryTime){
    
  }
}

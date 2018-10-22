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
    updater.update(converter.convert(currentTime))
  }
}

class Time(){
  var hourTens: Int = 0
  var hourOnes: Int = 0
  var minuteTens: Int = 0
  var minuteOnes: Int = 0
  var secondTens: Int = 0
  var secondOnes: Int = 0
  init {
    this.update()
  }
  fun update(){
    val now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"))
    val timeArray = now.chunked(1).map{elem -> elem.toInt()}
    this.hourTens = timeArray[0]
    this.hourOnes = timeArray[1]
    this.minuteTens = timeArray[2]
    this.minuteOnes = timeArray[3]
    this.secondTens = timeArray[4]
    this.secondOnes = timeArray[5]
  }
}


class Converter(){
  class BinaryTime(){
    var hourTens = CharArray(2)
    var hourOnes = CharArray(4)
    var minuteTens = CharArray(4)
    var minuteOnes = CharArray(4)
    var secondTens = CharArray(4)
    var secondOnes = CharArray(4)
  }
  fun convert(time: Time) : BinaryTime{
    val binTime = BinaryTime()
    binTime.hourTens = intToBinary(time.hourTens)
    binTime.hourOnes = intToBinary(time.hourOnes)
    binTime.minuteTens = intToBinary(time.minuteTens)
    binTime.minuteOnes = intToBinary(time.minuteOnes)
    binTime.secondTens = intToBinary(time.secondTens)
    binTime.secondOnes = intToBinary(time.secondOnes)
    return binTime
  }
  fun intToBinary(num: Int) : CharArray{
    val retVal = num.toString(2).toCharArray()
    return retVal
  }
}

class Updater(){
  fun update(binTime: Converter.BinaryTime){
    println(binTime)
  }
}

package UpdateDisplay
import Clock.Converter.BinaryTime

class UpdateDisplay(){

  val Black = "\u001b[30m"
  val Red = "\u001b[31m"
  val Green =  "\u001b[32m"
  val Yellow = "\u001b[33m"
  val Blue = "\u001b[34m"
  val Magenta = "\u001b[35m"
  val Cyan = "\u001b[36m"
  val White = "\u001b[37m"
  val Reset =  "\u001b[0m"
  val Save = "\u001b[s"
  val returnToSave = "\u001b[u"
  val escape = "\u001b["
  val upChar = "A"
  val downChar = "B"
  val rightChar = "C"
  val leftChar = "D"

  fun update(binTime: BinaryTime){
    this.printZero()
    this.printOne()
  }

  fun clearClock(){

  }

  fun printClockRow(){

  }

  fun printZero(){
    print(" ooo ")
    this.down(1)
    this.left(5)
    print("ooooo")
    this.down(1)
    this.left(5)
    print(" ooo ")
    this.up(2)
    this.right(1)
  }

  fun printOne(){
    print(" ooo ")
    this.down(1)
    this.left(5)
    print("o   o")
    this.down(1)
    this.left(5)
    print(" ooo ")
    this.up(2)
    this.right(1)
  }

  fun up(spaces: Int){
    print(this.escape + spaces.toString() + this.upChar)
  }

  fun down(spaces: Int){
    print(this.escape + spaces.toString() + this.downChar)
  }

  fun left(spaces: Int){
    print(this.escape + spaces.toString() + this.leftChar)
  }

  fun right(spaces: Int){
    print(this.escape + spaces.toString() + this.rightChar)
  }

}

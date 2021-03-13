import scala.collection.mutable.ArrayBuffer

sealed trait CrustSize
case object SmallCrust extends CrustSize
case object MediumCrust extends CrustSize
case object LargeCrust extends CrustSize

sealed trait CrustType
case object ThinCrust extends CrustType
case object ThickCrust extends CrustType
case object RegularCrust extends CrustType

sealed trait Toppings
case object sausage extends Toppings
case object pepper extends Toppings

class Pizza (
            var crustSize: CrustSize,
            var crustType: CrustType,
            var toppings: ArrayBuffer[Toppings]
            ){
  def addTopping(t: Toppings): Unit = toppings+=t
  def removeTopping(t: Toppings): Unit = toppings-=t
  def removeAllToppings(): Unit = toppings.clear()

  override def toString: String = s"${crustSize} and ${crustType} with toppings ${toppings}"

  def getPrice(
              toppingsPrices: Map[Toppings, Int],
              crustSizePrices: Map[CrustSize, Int],
              crustTypePrices: Map[CrustType, Int]
              ): Int = ???
}





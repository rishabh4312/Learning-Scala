import scala.collection.mutable.ArrayBuffer
class Order(
           var pizzas: ArrayBuffer[Pizza],
           var customer: Customer
           ){
  def addPizza(p: Pizza): Unit = pizzas+=p
  def removePizza(p: Pizza): Unit = pizzas-=p

  def getBasePrice(): Int = ???
  def getTaxes(): Int = ???
  def getTotalPrices(): Int = ???

  def thankCustomer() = println(s"Thanks for ordering ${pizzas}! ${customer}")
}



import scala.collection.mutable.ArrayBuffer
object MainDriver extends App{

  val p1 = new Pizza(
    MediumCrust,
    ThinCrust,
    ArrayBuffer(sausage))

  val p2 = new Pizza(
    SmallCrust,
    ThinCrust,
    ArrayBuffer(sausage,pepper)
  )

  val address = new Address (
    "123 Main",
    "apt. 1",
    "Jersey",
    "New Jersey",
    "09322"
  )

  val customer = new Customer(
    "Alvin Alexander",
    "903-3210-322",
    address
  )

  val o = new Order(
    ArrayBuffer(p1, p2),
    customer
  )

  o.addPizza(
    new Pizza(
      SmallCrust,
      ThinCrust,
      ArrayBuffer(pepper)
    )
  )

  o.thankCustomer()

}

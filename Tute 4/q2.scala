object q2 {
    case class shoppingCart(name: String, price: Double, qty: Int) 
    
    val item1 = shoppingCart("vanila ice cream", 3.99, 13)
    val item2 = shoppingCart("chocolate biscuits", 4, 6)
    val item3 = shoppingCart("cupcakes", 7.77, 7)

    val items = List(item1, item2, item3)

    def displayCartItems(items: List[shoppingCart]): Unit = {
        items.foreach{ item =>
            println(s"${item.qty} ${item.name} at Rs${item.price} each")
        }
        message(items)
    }

    def message(items: List[shoppingCart]): Unit = {
        items.foreach{ {
            case shoppingCart("vanila ice cream",_,_) => println("Found vanila ice cream")
            case shoppingCart(_,_,_) => println("Found another item")
        }
        }
    }

    def main(args: Array[String]) = {
        displayCartItems(items)
    }
}
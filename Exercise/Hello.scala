

val name = null

val rtn = name match {
    case s if s !=null => s 
    case _ => "n/a"
}
Console println rtn

/**************************************************************/
val amount = 0

val rtn2 = if (amount > 0) "greater" else if (amount == 0) "same" else "less"
val rtn3 = amount match {
    case s if amount > 0 => "greater"
    case s if amount == 0 => "same"
    case _ => "less"
}

Console println rtn2
Console println rtn3
/**************************************************************/
for ( x <- 1 to 100 ) {
    print( x +", ")
    if(x%5 ==0) println("")
}


/**************************************************************/

for ( x <- 1 to 100) {
    x match {
        case x if x%15 == 0 => println("typesafe")
        case x if x%3 == 0 => println("Type")
        case x if x%5 == 0 => println("safe")
        case _ => println(x)
    }
}

/***************************************************************/

for ( x <- 1 to 100) if(x%15==0) println("typesafe") else if (x%3 ==0) println("Type") else if (x%5 == 0) println("safe") else println("x")
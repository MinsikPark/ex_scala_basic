// 1. 

val bigNum = (a: Int , b: Int) => if (a > b) a else b

Console println bigNum(2, 3) 

def rtnMax(a: Int, b:Int, c:Int)(f: (Int,Int,Int) => Int) = f(a,b,c)

val rtn = rtnMax(10, 20, 30) { (a,b,c) => bigNum(a, bigNum(b,c)) }
Console println rtn


// 2. 
val ranNum1 = util.Random.nextInt 
val ranNum2 = util.Random.nextInt 
val ranNum3 = util.Random.nextInt 
val given1 = 10
val given2 = 20


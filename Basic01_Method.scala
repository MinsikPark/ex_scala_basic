
def max(x :Int , y:Int) : Int = {
    if (x > y) x
     else y
}

// 아래와 같다

def max2(x:Int , y:Int) : Int = if(x > y ) x else y


println(max( 1, 3))
println(max2(4,7))
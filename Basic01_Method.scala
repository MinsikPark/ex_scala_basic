
def max(x :Int , y:Int) : Int = {
    if (x > y) x
     else y
}

// 아래와 같다

def max2(x:Int , y:Int) : Int = if(x > y ) x else y


println(max( 1, 3))
println(max2(4,7))

// 반환타입이 없는 함수 >> Java로 따지면 void >> scala Unit

def log (d : Double) = println(f"Got Value $d%.2f")
log(2.2222)

def log2(d : Double) : Unit = println(f"Got Value $d%.2f") // 리턴값이 없다는 것을 명시적으로 표기


// 재귀함수 

def pow(x : Int , n : Int ) : Long ={
    if ( n > 1 ) x * pow(x, n-1)
    else 2 
}

 Console println pow(2, 10)

 // 재귀함수를 사용하는데에 있어 StackOverFlow를 주의해야 함
 // 이러한 문제를 해결하고 재귀함수를 최적화하기 위해 꼬리-재귀를 사용해야한다.
 // 마지막 문자이 재귀적 호출인 함수만이 스칼라 컴파일러에 의해 꼬리-재귀를 위해 최적화 될 수있다.

 // 꼬리-재귀를 위해 최적화 될 함수를 표시하는 함수 애너테이션으로 @annotation.tailrec를 추가하면 된다.
 @annotation.tailrec
 def pow2(x : Int , n : Int, t : Int = 1) : Long = {
     if( n < 1 ) t
     else  pow2(x, n-1, x*t) // 함수의 마지막이 재귀함수 호출이어야 한다. 
 }
  
Console println pow2(2, 9)

/// 중첩함수 
def max( a : Int , b : Int , c : Int ) = {
    def max(x:Int, y:Int) = if(x>y) x else y
    max(a, max(b,c))
}
Console println max(42,141,23)

/// 이름으로 매개변수를 지정해 함수 호출하기

def greet (prefix : String, name : String) = s"$prefix $name"

val greeting1 = greet("HI, ", "Minsik") // 파라미터를 순서대로 입력 
val greeting2 = greet(name = "Sik", prefix="Bye") // 파라미터의 이름을 지정해 입력
println(greeting1)
println(greeting2)

/// 기본값을 갖는 매개변수 

def greet2 (name : String, prefix: String = "") = s"$prefix $name" // 매개변수에 기본값을 지정해줌으로써 매개변수를 필수로 입력받을 필요가 없어짐

/// 가변 매개변수  - 정해지지 않은 개수으 ㅣ입력 인수들로 함수를 정의할 수 있다. 

def sum(items :Int*) : Int ={
    var total =0 
    for( i <- items) total += i
    total
}
Console println sum(10,20,30,40)

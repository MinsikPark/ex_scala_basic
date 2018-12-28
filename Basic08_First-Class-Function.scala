def double(x:Int) :Int = x*2 // 함수값 정의 
Console println double(5)

val myDouble : (Int) => Int = double _ // 함수로 할당된 함수값
Console println myDouble(5)

val myDoubleCopy = myDouble
Console println myDoubleCopy(5)

// 함수리터럴 
// 함수리터럴은 익명함수, 람다 표현식, 람다 등과 동일한 개념이라고 생각하면 된다. 

val greeter = (name : String ) => s"Hello $name"
val hi = greeter("World")
Console println hi

// 함수 리터럴은 근본적으로 매개변수화된 표현식이다.
def max (a : Int , b :Int) = if (a > b ) a else b // 원본함수 
val maximize : (Int, Int) => Int = max // 함숫값에 재할당

val maximize2 = (a:Int ,b:Int) => if (a < b) a else b // 함수 리터럴로 재정의 


// 함수 리터럴은 고차 함수 호출 내부에 정의될 수 있다.

def safeStringOp(s:String, f: String => String) = {
    if(s !=null) f(s) else s
}

Console println safeStringOp(null, (s : String) => s.reverse)
Console println safeStringOp("Hello World", (s : String) => s.reverse)


//  자리표시자 구문(PlaceHolder Syntax) 
// 자리표시자 구문은 함수 리터럴의 축약형

Console println safeStringOp(null, _.reverse)
Console println safeStringOp("Hello World", _.reverse)

// 두개 이상의 자리표시자 사용 

def combination ( x : Int, y:Int, f:(Int, Int) => Int ) = f(x,y)
Console println combination(10, 20, _*_) // 자리표시자가 입력 매개변수를 위치적으로 대체 

// 타입매개변수를 지원한 자리표시자 구문의 활용

def tripleOpt[A,B](a : A, b : A, c : A, f: (A,A,A)=> B) = f(a,b,c)
Console println tripleOpt[Int, Int] (32, 42, 43, _*_*_)
Console println tripleOpt[String, String] ("HELLO", "WORLD", "!!!!!", _+_+_)
Console println tripleOpt[Int, Boolean] (1, 3, 2, _+_ > _)


// 부분적용함수과 커링

def factorOf(x :Int, y:Int ) = y % x == 0

val f= factorOf _ //함수값을 할당하되 어떤 매개변수도 유지하고 싶지 않을 때 
val x = f(10,20)
Console println x

val multifleOf3 = factorOf(3, _:Int) //3이라는 매개변수를 유지하고 싶을 경우. 이런 경우를 부분 적용 함수라고 한다.
val y = multifleOf3(10)
Console println y

// 위와같은 부분 적용 함수를 활용하는데는 다중 매개변수 목록을 가진 함수를 활용하는 것이 효과적

def factorOf2(x: Int)(y:Int) = y % x == 0 // int => int => boolean의 개념이됨. 즉 다중 함수의 체인으로 간주됨
val isEven = factorOf2(2) _ ; // 이와 같은 방식을 커링이라고 함
val even = isEven(40)
Console println even

// 함수 리터럴 블록으로 고차함수 호출하기
def safeStringOp2(s: String, f: String => String) = {
    if(s != null) f(s) else s
}

val uuid = java.util.UUID.randomUUID.toString

val timedUUID = safeStringOp2(uuid, {s=>
    val now = System.currentTimeMillis 
    val timed = s.take(24) + now // String의 처음 x개의 항복을 반환한다. 
    timed.toUpperCase
})
Console println uuid
Console println timedUUID

//위의 safeStringOp2의 매개변수를 두개의 별도 그룹으로 나누면 다음과 같다.

def safeStringOp3(s :String)(f :String => String) = {
    if(s != null) f(s) else s
}

val timedUUID3 = safeStringOp2(uuid) { s=>
    val now = System.currentTimeMillis 
    val timed = s.take(24) + now 
    timed.toUpperCase
})

safeStringOp3
// 자바의 switch 문과 유사하다
// java와 같이 catch-all 패턴을 지원함
// 그러나, 0개 또는 하나의 패턴만 매칭할 수 있으므로 여러개의 패턴을 한 번에 매칭시킬 수 있는 형태의 제어이동은 없다.
// 따라서 중간에 제어문을 빠져나오는 break문 또한 없다. 
val x = 10;
val y = 20;

val max = if(x > y) x else y // 기본 if 문

val max2 = x > y match{ // match의 형태로 변환
    case true => x
    case false => y
}

println(max)
println(max2)


/// 특정 값의 조건에 해당하는 값을 리턴
val status = 500
val message = status match{
    case 200 =>
        "ok"
    case 400 =>{
        println("Error -we called the service incorrectly")
        "error"
    }    
    case 500 =>{
        println("Error - the service encountered an error")
        "error"
    }
}

println(message)

// 여러 패턴을 하나의 case에 포함시키기 
val day = "Mon"
val message2 = day match {
    case "Mon" | "Tue" | "Wed" | "Thu" | "Fri" =>
        "WeekDay" 
    case "Sat" | "Sun" =>
        "WeedEnd"    
} 

println(message2)


/// 와일드 카드로 매칭하기 

// 구문 : 값 바인딩 패턴
val msg = "okay"
val status2 = msg match{
    case "ok" => 200
    case other =>{
        println(s"couldn't parse $other") 
        -1
    }
}

println(status2) //couldn't parse okay

// 구문 : 와일드카드 연산자 패턴 

val status3 = msg match{
    case "ok" => 200
    case _ =>{
        println(s"couldn't parse $message")  // 매칭 표현식의 입력값을 사용한다. 
        -1
    }
}


// 패턴가드를 이용한 매칭 
// 바인딩 패턴에 if 표현식을 추가

val response = null

response match{
    case s if s != null => println(s"Received `$s'") // 패턴가드 구문에서 if의 부울린 식은 괄호를 필요로 하지 않는다. 
    case s => println("Error! Received a null response")
}
 
/// 패턴변수를 이용한 타입 매칭

val a : Int = 12180
val b : Any = a

b match {
    case x: String => s"'x'"
    case x: Double => s"$x%.2f"
    case x: Float => s"$x%.2f"
    case x: Long => s"${x}l"
    case x: Int => s"${x}i"
}


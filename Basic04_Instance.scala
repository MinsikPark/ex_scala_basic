val big = new java.math.BigInteger("123123")

println(big)

println("---------------------------------------------")

val greetingStrings = new Array[String](3)

//조금 더 명시적으로 작성한다면

val greetingStrings2 : Array[String] = new Array[String](3)

// 스칼라에서는 배열 인덱스를 괄호에 넣어 원소에 접근한다. java는 []
greetingStrings(0) = "Hello"
greetingStrings(1) = ", "
greetingStrings(2) = "World"

// 비록 greetingStrings 는 val타입으로 그 인스턴스타입인 Array[String]에서 변경할 수 없지만,
// 내부 배열의 원소는 변경이 가능하다.
greetingStrings(2) = "World War Z !"

for( i <- 0 to 2)
    print(greetingStrings(i))

// to는 사실 (0).to(2)의 함수의 축약형이다. 
// 메소드가 파라미터를 하나만 요구하는 경우 그 메소드는 . 과 괄호없이 사용할 수 있다는 스칼라의 일반 규칙을 보여준다.
println("")
Console println "HEllo"

// 이러한 맥락에서 Array의 배열 인덱스에 접근하는 방법 또한 다른 하나의 메소드를 호출하는 것과 같다.
greetingStrings(0) = "Hi"
greetingStrings.update(0, "Hello") 

// 배열의 또 다른 초기화방법
val numNames = Array("test1", "test2", "test3")
val numNames2 = Array.apply("test1", "test2", "test3")


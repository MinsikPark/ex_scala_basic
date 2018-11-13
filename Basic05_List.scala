// 스칼라의 List는 원소의 변경이 불가능하다. 

val Nums = List(1, 2, 3)

// 리스트의 내용을 변경하는 듯한 메소드를 호출하면 그것은 리스트를 변경하는 것이 아닌, 새로운 리스트를 생성하는 것임

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour /// ::: 는 두개의 리스트를 이어 붙이는 메소드이다. 
println(oneTwoThreeFour)

// :: 는 List에서 가장 많이 사용하는 연산자로, cons라고 부른다. 
// 콘즈는 새 원소를 기존 리스트의 맨 앞에 추가한 새로운 리스트를 반환한다 

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree // 반대의 경우 twoThree :: 1 은 Error
println(oneTwoThree)

// 비어있는  List는 Nil으로 줄여 쓸 수 있다. 따라서 굳이 List()를 통해 빈 리스트를 생성할 필요 없이 다음과 같이 사용할 수 있다.

val list  = 1 :: 2 :: 3 :: Nil  
println(list) 

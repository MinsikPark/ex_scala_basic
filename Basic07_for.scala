
for(arg <- args) println(arg) // for 단일 문장의 경우 중괄호를 생략할 수 있다.

    // for문 안의 arg는 var이 아닌 실제로는 val이기 때문에 재할당할 수 없다.

 /// for문의 결과는 구문에 yield를 추가함으로써 선택적으로 collection객체로 반환받을 수 있다. 
 val coll = for( i <- 0 to 10) yield { i*1 + 3} 
 println(coll)

 for (i <- coll){
     println(i);
 }   


 /// 반복자 가드를 통해 for 문 안의 if 조건식이 true를 반환할 때만 반복수행하도록 설정할 수 있다.

 val iterGD = for( i <- 1 to 300 if i % 3 == 0) yield i; // 3의 배수일 경우에 한해 반복문을 수행한다. 
 println(iterGD)

 // for문의 조건문을 여러 줄로 작성할 수 있으며, if조건식도 여러개 넣어줄 수 있다.
 
 val sentence = "Hello, ,my name is Minsik Park. How are you?"

 val diviedSen = for{
                    i <- sentence.split(",")
                    if i != null
                    if i.size > 0 
                    } 
                    { println(i)}


// 중첩된 반복자
            // java를 처음 배울 때 2중 for문을 사용해 구구단을 출력하면 다음과 같았다. 
            // for (int i = 1 ; i > 9 ; i++){
            //     for (int j = 1 ; j > 9 ; j ++){
            //         print(i + " X " +  j +" = "+   i*j)
            //     }
            // }
// 이는 가독성의 측면에서 매우 지저분하다는 느낌이 든다. 
// 스칼라를 활용하면 이를 훨씬 간단하게 구현할 수 있다.

for {
    i <- 1 to 9 
    j <- 1 to 9
}{
    println(s"${i} X ${j} = " + i*j)
}

// 값 바인딩 
    // for문에서 가장 많이 사용하는 기능은 표현식 블록 내에서 임시값 또는 변수를 정의하는 것이다.

val pows = for(i <- 0 to 8 ; pow = 1 << i) yield pow // << 는 left shift 이항연산자라고 하는데 pow의 byte, 즉 2진수에서 좌측으로 한칸씩 i번 이동시킬 수 있다. 
Console println pows 


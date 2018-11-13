var i = 0; // 초기값이 0이기 때문에 컴파일러는 타입을 Int로 추정한다. 

while (i < args.length){
    println(args(i))
    i = i + 1 
}

//args 는 args라는 스칼라 배열에 명령행 인자를 받는다.
// 이는 추정컨데, Java의 main 함수의 args와 같은 것으로 보임.

// scala Basic02_while.scala Hello world
//입력해보자
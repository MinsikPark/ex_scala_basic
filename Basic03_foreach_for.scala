// while은 명령어imperative 스타일
// 지금 사용할 것은 함수형 스타일

args.foreach(arg => println(arg))

// scala Basic03_foreach_for.scala Hello World! this is first Time

// args의 타입이 String의 배열이기 때문에 알아서 String 으로 인식
// 제대로된 사용은 다음처럼

args.foreach( (arg : String) => println(arg))

// 함수형 리터럴이 인자를 하나만 받을 경우, 해당 인자에 이름을 붙힐 필요 없다.

args.foreach(println);


/////////////////////////////////////////////////////////////////////////////
println("--------------------- for -----------------------------")
for(arg <- args)
    println(arg)

    // for문 안의 arg는 var이 아닌 실제로는 val이기 때문에 재할당할 수 없다.
    
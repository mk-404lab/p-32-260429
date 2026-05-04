package com.team01.wiseSaying

class WiseSayingController {

    var lastId = 0;
    val wiseSayings = mutableListOf<WiseSaying>()

    fun write() {

        print("명언 : ")
        val content = readln()

        print("작가 : ")
        val author = readln()
        val id = ++lastId

        wiseSayings.add(WiseSaying(id, content, author))

        println("${id}번 명령이 등록되었습니다.")
    }

    fun list() {
        println("번호 / 작가 / 명언")
        println("-".repeat(30))
        wiseSayings.reversed().forEach { println("${it.id} / ${it.author} / ${it.content}") }
    }

    fun delete(rq: Rq) {
        val id = rq.getParamAsInt("id", 0)

        if (id == 0) {
            println("id를 입력해주세요.")
            return
        }

        wiseSayings
            .firstOrNull {
                it.id == id
            }
            ?. let {
                wiseSayings.remove(it)
                println("${id}번의 명언이 삭제되었습니다.")
            }
            ?: println("${id}번 명령은 존재하지 않습니다.")

    }
}
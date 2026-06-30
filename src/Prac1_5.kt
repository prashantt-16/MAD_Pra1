fun main(){
    val number=readln().toInt()
    println(
        when(number){
            1->"Jan"
            2->"February"
            3->"March"
            4->"April"
            5->"May"
            6->"Jun"
            7->"Jul"
            8->"August"
            9->"September"
            10->"October"
            11->"November"
            12->"December"
            else->"Please enter proper month"
        }
    )
}
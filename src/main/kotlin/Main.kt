package module

fun main() {
        var firstName: String = "Arthur"
        var lastName: String = "Islamov"
        var height: Double = 175.0
        var weight: Float = 90F
        var isChild: Boolean = (height<150.0) || (weight<40)
        var info: String = "Name: $firstName; Last name: $lastName; height: $height; weight: $weight; Is he child? - $isChild"
        println(info)

        var height2: Double = 180.0
        var info2: String = "Name: $firstName; Last name: $lastName; height: $height2; weight: $weight; Is he child? - $isChild"
        println(info2)

        // Дополнительные пунты "По желанию"
        var isChild2: Boolean = (height>150.0) || (weight>40)
        var info3: String = "Name: $firstName; Last name: $lastName; height: $height2; weight: $weight; Is he child? - $isChild2"
        println(info3)




}
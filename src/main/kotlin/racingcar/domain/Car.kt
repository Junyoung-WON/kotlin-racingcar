package racingcar.domain

import racingcar.service.NumberGenerator
import kotlin.random.Random

class Car(val name: String) {
    var position: Int = 0
        private set

    fun move(numberGenerator: NumberGenerator) {
        val number: Int = numberGenerator.generate()
        if (number >= 4) position++
    }
}

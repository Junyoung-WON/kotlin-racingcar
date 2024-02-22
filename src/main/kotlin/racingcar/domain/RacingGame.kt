package racingcar.domain

import racingcar.service.RandomNumberGenerator
import racingcar.util.NumberGenerate
import kotlin.random.Random

class RacingGame(carNames: List<String>) {
    val cars: List<Car> = carNames.map { Car(it) }

    fun playOneRound() {
        cars.forEach {
            val numberGenerator = NumberGenerate { Random.nextInt(10) }
            it.move(numberGenerator.get())
        }
    }
}

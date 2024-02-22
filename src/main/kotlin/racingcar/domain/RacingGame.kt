package racingcar.domain

import racingcar.service.RandomNumberGenerator

class RacingGame(carNames: List<String>) {
    val cars: List<Car> = carNames.map { Car(it) }

    fun playOneRound() {
        cars.forEach {
            it.move(RandomNumberGenerator())
        }
    }
}

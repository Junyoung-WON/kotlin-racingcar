package racingcar.service

import kotlin.random.Random

class RandomNumberGenerator : NumberGenerator {
    override fun generate(): Int = Random.nextInt(RANDOM_NUMBER_BOUNDARY)

    companion object {
        const val RANDOM_NUMBER_BOUNDARY = 10
    }
}

package racingcar.controller

import racingcar.domain.Car
import racingcar.util.ValidationUtil
import racingcar.view.InputView
import kotlin.random.Random

class GameController {
    val inputView = InputView()
    val validationUtil = ValidationUtil()
    fun start() {
        //  사용자 입력 및 검증
        val carNames = getCarNames()
        val tryCounts = getTryCounts()

        // 레이싱 게임 실행
        val cars: List<Car> = carNames.map { Car(it) }
        repeat(tryCounts) {
            cars.forEach {
                val randomNumber = Random.nextInt(10)
                if (randomNumber >= 4) it.move()
            }
        }
    }


    fun getCarNames(): List<String> {
        while (true) {
            try {
                val carNames = inputView.readCarNames()
                validationUtil.validateCarNames(carNames)
                return carNames!!.split(",")
            } catch (e: IllegalArgumentException) {
//                outputView 활용하여 에러메세지 출력
            }
        }
    }

    fun getTryCounts(): Int {
        while (true) {
            try {
                val tryCounts = inputView.readTryCounts()
                validationUtil.validateTryCounts(tryCounts)
                return tryCounts!!.toInt()
            } catch (e: IllegalArgumentException) {
//                outputView 활용하여 에러메세지 출력
            }
        }
    }


}
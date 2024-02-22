package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import racingcar.service.MovableNumberGenerator
import racingcar.service.StoppableNumberGenerator
import racingcar.util.NumberGenerate

class CarTest {
    @Test
    fun `자동차는 숫자가 4이상인 경우 이동합니다`() {
        val car = Car("test")
        val stoppable = NumberGenerate { 0 }
        val movable = NumberGenerate { 4 }

        car.move(stoppable.get())
        assertThat(car.position).isEqualTo(0)
        car.move(movable.get())
        assertThat(car.position).isEqualTo(1)
    }
}

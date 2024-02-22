package racingcar.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import racingcar.domain.Car
import racingcar.util.NumberGenerate

class WinnerServiceTest {
    @Test
    fun `우승자는 여러 명일 수 있습니다`() {
        val cars: List<Car> = listOf(
            Car("hodu"),
            Car("happy"),
            Car("cat")
        )
        val movable = NumberGenerate { 4 }

        cars[0].move(movable.get())
        cars[1].move(movable.get())
        assertThat(WinnerService.findWinners(cars)).isEqualTo(listOf("hodu", "happy"))
    }
}

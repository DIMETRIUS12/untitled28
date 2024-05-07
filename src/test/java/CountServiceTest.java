import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.untitled28.services.CountService;

public class CountServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")

    public void shouldCalculateCount(int income, int expenses, int threshold, int expected) {
        CountService service = new CountService();


        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);


    }
}

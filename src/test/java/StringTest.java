import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class StringTest {


    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests finished");
    }

    LocalizationServiceImpl sut;

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        sut = new LocalizationServiceImpl();


        final String original = sut.locale("RUSSIA");
        final String argument = " man";
        final String expected = "Добро пожаловать man";

        final String result = original.concat(argument);


        Assertions.assertEquals(expected, result);

    }
}



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class StringTest {

    Person sut;

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("Tests finished");
    }


    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {

        sut = new Person("Jake", "Goodnight", 33, Sex.WOMEN, Education.ELEMENTARY);

        // given:
        final String original = "Name of Person is ";
         final String argument = sut.getName();
         final String expected = "Name of Person is Jake";
// when:
 final String result = original.concat(argument);
// then:
 Assertions.assertEquals(expected, result);

    }
}



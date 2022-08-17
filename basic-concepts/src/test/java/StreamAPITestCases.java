import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.concurrent.CompletableFuture.anyOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StreamAPITestCases {
    @Test
    public void createStream_whenFindAnyResultIsPresent_thenCorrect() {
        List<String> list = Arrays.asList("A","B","C","D");

        Optional<String> result = list.stream().findAny();

        assertTrue(result.isPresent());

    }
}

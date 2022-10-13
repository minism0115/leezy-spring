package em.board.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class PaginationService {

    private static final int BAR_LENGTH = 5;


    public List<Integer> getPaginationBarNumbers(int currentPageNumber, int totalPages) {
        int startNumber = Math.max(currentPageNumber - (BAR_LENGTH / 2), 0);
        int endNumber = Math.min(startNumber + BAR_LENGTH, totalPages);

        Stream<Integer> stream = IntStream.range(startNumber, endNumber).boxed();
        Integer[] array = stream.toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(array);

        return list;
    }

    public int currentBarLength() {
        return BAR_LENGTH;
    }

}

package tdd.examples.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;


public class Examples07 {
    @Mock private List mockedList;

    // @Mock이 붙은 모든 필드를 Mock객체로 초기화 한다.
    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this); // mock all the field having @Mock annotation
    }

    @Test
    public void test() {
        // test here
        mockedList.add("one");

        // verification
        verify(mockedList).add("one");
    }
}

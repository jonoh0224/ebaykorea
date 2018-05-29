package tdd.examples.mockito;

import org.mockito.Mockito;

import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

// Mocking과 Verification
public class Examples01 {
    public static void main(String[] args){
        // mock
        List mockedList = mock(List.class);
        System.out.println(mockedList.getClass().getName());

        // mock 사용하기
        mockedList.add("two");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}

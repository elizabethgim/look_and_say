import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlgorithmTest {

    @DisplayName("첫 번쨰 항")
    @Test
    void Case1(){
        String case1 = "1";
        assertEquals(Algorithm.LookAndSay(case1), 11);
    }

    @DisplayName("두 번쨰 항")
    @Test
    void Case2(){
        String case1 = "11";
        assertEquals(Algorithm.LookAndSay(case1), 21);
    }

    @DisplayName("세 번째 항")
    @Test
    void Case3(){
        String case1 = "21";
        assertEquals(Algorithm.LookAndSay(case1), 1211);
    }

    @DisplayName("네 번째 항")
    @Test
    void Case4(){
        String case1 = "1211";
        assertEquals(Algorithm.LookAndSay(case1), 111221);
    }

    @DisplayName("다섯 번째 항")
    @Test
    void Case5(){
        String case1 = "111221";
        assertEquals(Algorithm.LookAndSay(case1), 312211);
    }

    @DisplayName("여섯 번째 항")
    @Test
    void Case6(){
        String case1 = "312211";
        assertEquals(Algorithm.LookAndSay(case1), 13112221);
    }

    @DisplayName("일곱 번째 항")
    @Test
    void Case7(){
        String case1 = "13112221";
        assertEquals(Algorithm.LookAndSay(case1), 1113213211);
    }
}

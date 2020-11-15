import com.company.Main;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.Test
    public void testTripletsZero(){
        //input = [-1, 0, 1, 2, -1, -4],
        //A solution set is : [[-1, 0, 1],[-1, -1, 2]]
        List<List<Integer>> expectedResult = new ArrayList<>();
        List<Integer> triplets = new ArrayList<>();
        triplets.add(-1);
        triplets.add(-1);
        triplets.add(2);
        expectedResult.add(triplets);
        triplets = new ArrayList<>();
        triplets.add(-1);
        triplets.add(0);
        triplets.add(1);
        expectedResult.add(triplets);

        assertEquals(expectedResult, Main.tripletsZero(new int[]{-1,0,1,2,-1,-4}));
    }

}

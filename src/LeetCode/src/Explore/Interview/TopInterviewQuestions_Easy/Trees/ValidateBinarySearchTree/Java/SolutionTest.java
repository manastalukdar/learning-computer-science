package LeetCode.src.Explore.Interview.TopInterviewQuestions_Easy.Trees.ValidateBinarySearchTree.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(500), () -> {
             String[] args = new String[0];
             assertAll(() -> Solution.main(args));
        });
    }
    
    @Test
    public void TrivialCase1() {
        int[] values = {
            2,
            1, 3};
        TreeNode root = TreeNode.fromArray(values);
        assertTimeout(Duration.ofMillis(500), () -> {
            boolean expected = true;
            boolean actual = Solution.isValidBST(root);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        int[] values = {
            5,
            1, 4,
            -1, -1, 3, 6};
        TreeNode root = TreeNode.fromArray(values);
        assertTimeout(Duration.ofMillis(500), () -> {
            boolean expected = false;
            boolean actual = Solution.isValidBST(root);
            assertEquals(expected, actual);
        });
    }
}
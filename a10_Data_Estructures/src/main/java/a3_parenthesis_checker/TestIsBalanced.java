package a3_parenthesis_checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsBalanced {
    @Test
    void testIsBalanced() {
        ParenthesisChecker checker = new ParenthesisChecker();

        String brackets1 = "[{{[(){}]}}[]{}{{(())}}]";
        assertEquals(true, checker.isBalanced(brackets1));

        String brackets2 = "[{{}}[]{}{{(())}}]";
        assertEquals(true, checker.isBalanced(brackets2));

        String brackets3 = "[{}{}{{()}}]";
        assertEquals(true, checker.isBalanced(brackets3));

        String brackets4 = "[{}{{}}]";
        assertEquals(true, checker.isBalanced(brackets4));

        String brackets5 = "[{{}}]";
        assertEquals(true, checker.isBalanced(brackets5));

        String brackets6 = "[{}]";
        assertEquals(true, checker.isBalanced(brackets6));

        String brackets7 = "";
        assertEquals(true, checker.isBalanced(brackets7));

        String brackets8 = "({{}}]";
        assertEquals(false, checker.isBalanced(brackets8));

        String brackets9 = "({}]";
        assertEquals(false, checker.isBalanced(brackets9));

        String brackets10 = "(]";
        assertEquals(false, checker.isBalanced(brackets10));
    }
}

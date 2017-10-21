package com.slohrsh.eightpuzzle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.slohrsh.eightpuzzle.logic.EightPuzzleLogicMoveDownwardsTest;
import com.slohrsh.eightpuzzle.logic.EightPuzzleLogicMoveInvalid;
import com.slohrsh.eightpuzzle.logic.EightPuzzleLogicMoveLeftTest;
import com.slohrsh.eightpuzzle.logic.EightPuzzleLogicMoveRightTest;
import com.slohrsh.eightpuzzle.logic.EightPuzzleLogicMoveUpwardsTest;
import com.slohrsh.eightpuzzle.searchable.EightPuzzleSearchableGetNodes;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   EightPuzzleLogicMoveDownwardsTest.class,
   EightPuzzleLogicMoveUpwardsTest.class,
   EightPuzzleLogicMoveLeftTest.class,
   EightPuzzleLogicMoveRightTest.class,
   EightPuzzleLogicMoveInvalid.class,
   EightPuzzleSearchableGetNodes.class
})

public class TestSuite {   
} 
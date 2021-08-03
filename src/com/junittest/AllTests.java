package com.junittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddUnit.class, MultiplyUnit.class, SquareUnit.class })
public class AllTests {

}

package ejemplo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.ejml.data.Complex64F;
import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.CommonOps;
import org.ejml.ops.EjmlUnitTests;
import org.ejml.ops.NormOps;
import org.ejml.ops.RandomMatrices;
import java.util.Random;
import org.ejml.simple.*;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
 	      UndirectedGraph<String, DefaultEdge> stringGraph = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
    }


    public void testMatriz(){
      double d[] = new double[]{2,5,3,9,-2,6,7,4};
      SimpleMatrix s = new SimpleMatrix(3,2, true, d);
      DenseMatrix64F m = new DenseMatrix64F(3,2, true, d);

      EjmlUnitTests.assertEquals(m,s.getMatrix(),1e-8);
    }


}

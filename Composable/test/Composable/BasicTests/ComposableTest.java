/*
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package Composable.BasicTests;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Composable.Composable;

/**
 *
 * @author Yarric Sh.
 */
public class ComposableTest {
    Owner p_m;
    Composable p_s;
        
    
    @Test
    public void testPossessable() {
        Owner p_m = new Owner();
        Composable p_s = new Owned();
        
        p_s.setPossessor(p_m);
        
        assertEquals("POSSESSOR IS NOT SET", p_m, p_s.getPossessor());
    }
    
    @Test
    public void testTypeConversion() {
        Owner p_m = new Owner();
        Composable p_s = new Owned();
        
        p_s.setPossessor(p_m);
        
        System.out.println(p_s.<Owner>getPossessor().id);
        
        assertEquals("POSSESSOR IS NOT SET", "TheOwner", 
                p_s.<Owner>getPossessor().id);
    }
    
    public ComposableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

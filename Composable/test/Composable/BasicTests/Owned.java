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

import Composable.Composable;


/**
 *
 * @author Yarric Sh.
 */
public class Owned implements Composable {
    public final String id = "Possession";
    
    private Object myPossessor;

    @Override
    public <T> void setPossessor(T possessor) {
        this.myPossessor = possessor;
    }

    @Override
    public <T> T getPossessor() {
        return (T)this.myPossessor;
    }
    
}

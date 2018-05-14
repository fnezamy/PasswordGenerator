/**
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS''
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PwdGenerator extends Anaylsis
{
       

        /*
         * This method generates a random n digit password, which contains at least one number, lower case alphabet, upper
         * case alphabet and as special character.
         */
        public String generatePassword(int n)
        {

                Random rd = new Random();

                char lowerChars[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
                char upperChars[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                char numbers[] = "0123456789".toCharArray();
                char specialChars[] = "~!@#$%^&*()-_=+[{]}|;:<>/?".toCharArray();

                List<Character> pwdLst = new ArrayList<Character>();
                for (int g = 0; g < 4; g++)
                {
                        for (int z = 0; z < 1; z++)
                        {
                                if (g == 0)
                                {
                                        pwdLst.add(numbers[rd.nextInt(10)]);
                                }
                                else if (g == 1)
                                {
                                        pwdLst.add(lowerChars[rd.nextInt(26)]);
                                }
                                else if (g == 2)
                                {
                                        pwdLst.add(upperChars[rd.nextInt(26)]);
                                }
                                else if (g == 3)
                                {
                                        pwdLst.add(specialChars[rd.nextInt(26)]);
                                }
                        }
                        if (pwdLst.size() == n)
                        {
                                break;
                        }
                        if (g + 1 == 4)
                        {
                                g = (int) Math.random() * 5;

                        }
                }
                StringBuilder password = new StringBuilder();
                Collections.shuffle(pwdLst);
                for (int c = 0; c < pwdLst.size(); c++)
                {
                        password.append(pwdLst.get(c));
                }
                return password.toString();
        }
        
        public void print(String s){
        	System.out.print("PwdGenerated password is ");
        	super.printanaylsis(s);
        }
}
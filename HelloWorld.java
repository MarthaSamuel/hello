
/**
 * A file resource downloaded from dukelearntoprogram.com
 * N1b
 * @author: Dimgba Martha Otisi 
 * 2020, January.
 *  @martha_samuel_
 */
import edu.duke.*;

public class HelloWorld {
    public void runHello(){
        FileResource res = new FileResource("hello_unicode.txt");
        for(String line : res.lines()){
        System.out.println(line);
    }
}
}

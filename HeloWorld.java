
/**
 * A file resource downloaded from dukelearntoprogram.com
 * N1a
 * @author : Dimgba Martha Otisi
 * 2020,January.
 * @martha_samuel_
 */
import edu.duke.FileResource;
public class HeloWorld {
public void runHello(){
    FileResource f=new FileResource("hello_unicode.txt");
    for(String line:f.lines()){
        System.out.println(line);
    }
}
//to run outside the programing environment,you can add this main method
    public static void main(String[]args){
      HelloWorld hw=new HelloWorld();
      hw.runHello();
}
}

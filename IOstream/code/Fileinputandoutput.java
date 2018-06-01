package code;

import java.io.*;

public class Fileinputandoutput {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    File f = new File("./iostream/myfile.txt");
    InputStream in = new FileInputStream(f);
    byte[] b = new byte[1024];
    int count = 0;
    int temp = 0;
    while ((temp = in.read()) != (-1)) {
      b[count++] = (byte) temp;
    }
    in.close();
    System.out.println(new String(b));
    
    File ff = new File("./iostream/output.txt");
    OutputStream out =new FileOutputStream(ff);
    String str="this is another testfile.";
    byte[] bb=str.getBytes();
    out.write(bb);
    out.close();
    
    
  }

}

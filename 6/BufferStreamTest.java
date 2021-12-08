import java.io.*;

public class BufferStreamTest {

    public static void main(String[] args) {
        try(BufferedInputStream bufferedInputStream =
                    new BufferedInputStream(new FileInputStream("input-file.txt")) ) {

            int data = bufferedInputStream.read();
            while(data != -1){
                data = bufferedInputStream.read();
                System.out.println((char) data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

public class StreamCopy {
    public static void main(String[] args) throws IOException {
        byte[] buf = new byte[1024];
        int bytesRead;

        InputStream inputStream = new FileInputStream("input-file.txt");
        OutputStream outputStream = new FileOutputStream("output-file.txt");
        while ((bytesRead = inputStream.read(buf)) > 0) {
            outputStream.write(buf, 0, bytesRead);
        }
    }
}

public class TryFinallyClose {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("input-file.txt");
        try {
            OutputStream out = new FileOutputStream("output-file.txt");
            try {
                in.transferTo(out);
            } finally {
                out.close();
            }
        }
        finally {
            in.close();
        }
    }
}

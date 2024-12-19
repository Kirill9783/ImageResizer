import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        String srcFolder = "src_images";
        String dstFolder = "dst_images";
        int newWidth = 300;

        File srcDir = new File(srcFolder);

        File[] files = srcDir.listFiles();

        int core = files.length / 8;

        File[] file1 = Arrays.copyOfRange(files, 0, core);
        File[] file2 = Arrays.copyOfRange(files, core, core * 2);
        File[] file3 = Arrays.copyOfRange(files, core * 2, core * 3);
        File[] file4 = Arrays.copyOfRange(files, core * 3, core * 4);
        File[] file5 = Arrays.copyOfRange(files, core * 4, core * 5);
        File[] file6 = Arrays.copyOfRange(files, core * 5, core * 6);
        File[] file7 = Arrays.copyOfRange(files, core * 6, core * 7);
        File[] file8 = Arrays.copyOfRange(files, core * 7, files.length);

        ExecutorService service = Executors.newFixedThreadPool(8);
        service.submit(new ImageResizer(file1, newWidth, dstFolder));
        service.submit(new ImageResizer(file2, newWidth, dstFolder));
        service.submit(new ImageResizer(file3, newWidth, dstFolder));
        service.submit(new ImageResizer(file4, newWidth, dstFolder));
        service.submit(new ImageResizer(file5, newWidth, dstFolder));
        service.submit(new ImageResizer(file6, newWidth, dstFolder));
        service.submit(new ImageResizer(file7, newWidth, dstFolder));
        service.submit(new ImageResizer(file8, newWidth, dstFolder));
        service.shutdown();
    }
}

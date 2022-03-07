package di;

public class PdfGenerator implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Pdf report");
    }
}

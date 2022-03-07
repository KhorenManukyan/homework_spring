package di;

public class Main {
    public static void main(String[] args) {
        PdfGenerator pdfGenerator = new PdfGenerator();
        ExelGenerator exelGenerator = new ExelGenerator();
        Report report = new Report();
        report.setReportGenerator(pdfGenerator);
        report.generator();
    }
}

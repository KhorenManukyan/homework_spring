package di;

public class Report {
    ReportGenerator reportGenerator;

//    public Report() {
//        this.reportGenerator = new ExelGenerator();
//    }


    public Report() {
    }

    public Report(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generator() {
        reportGenerator.generate();
    }
}

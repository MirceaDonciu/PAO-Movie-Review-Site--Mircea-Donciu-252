import java.util.ArrayList;
public class Report {
    protected int ReportId;
    protected int ReportType;
    protected ArrayList<Review> Vector;
    public Report(int reportId, int reportType, ArrayList<Review> vector) {
        ReportId = reportId;
        ReportType = reportType;
        Vector = vector;
    }
    public int getReportId() {
        return ReportId;
    }
    public void setReportId(int reportId) {
        ReportId = reportId;
    }
    public int getReportType() {
        return ReportType;
    }
    public void setReportType(int reportType) {
        ReportType = reportType;
    }
    public ArrayList<Review> getVector() {
        return Vector;
    }
    public void setVector(ArrayList<Review> vector) {
        Vector = vector;
    }
}

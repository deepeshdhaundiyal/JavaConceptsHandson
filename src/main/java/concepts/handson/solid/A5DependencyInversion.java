package concepts.handson.solid;

import javax.tools.DocumentationTool;

public class A5DependencyInversion
{
    //we need to create a save report service but it should be independent of format whether we save in PDF or Excel.
    //so we will create an interface for saveReport and implements the functionality for PDF and Excel format classes.
}

interface ReportSaver{

    void saveReports();
}

class PdfSaver implements ReportSaver{

    @Override
    public void saveReports() {
//        logic to save data in PDF
    }
}

class ExcelSaver implements ReportSaver{
    @Override
    public void saveReports() {
//        logic to save data in Excel
    }
}

class DataSaver{

    ReportSaver reportSaver;

    DataSaver(ReportSaver reportSaver){
        this.reportSaver = reportSaver;
        reportSaver.saveReports();
    }

}
package concepts.handson.solid;

public class A1Srp{

    //Single responsible principle says that one class should be responsible for one class only.
    //For example if A class read data from PDF, save data into PDF, delete the PDF there should be each class for each operation.

}

class PdfDataSaver{

    void saveDataToPdf(String s)
    {
        System.out.println("Data is saved to PDF : " + s);
    }
}

class PdfDataReader{

    void readPdfData(){
        //logic to read data from pdf
    }
}

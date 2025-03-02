package concepts.handson.solid;

public class A2OCP {

    //Open/Closed principle
    //A class should be open for extension and closed for modifications
    //prefer to create an interface
}

interface DataReader{
    void readData();
}

class PdfDataReader2 implements DataReader{

    @Override
    public void readData() {
        //logic to read data from PDF
    }
}

class ExcelDataReader implements DataReader {

    @Override
    public void readData() {
        //logic to read data from PDF
    }
}
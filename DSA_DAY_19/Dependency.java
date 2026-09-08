package DSA_DAY_19;

public class Dependency {
    public static void main(String[] args) {
        OfficeWorker worker = new OfficeWorker();
        worker.doWork();
    }
}


class Printer {
    void printDocument(String doc) {
        System.out.println("Printing Document: " + doc);
    }
}

class OfficeWorker {
    void doWork() {
        Printer printer = new Printer();
        printer.printDocument("ProjectReport.pdf");
        System.out.println("Work Completed");
    }
}

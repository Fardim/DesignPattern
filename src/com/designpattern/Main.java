package com.designpattern;

import com.designpattern.Command.AddCustomerCommand;
import com.designpattern.Command.Composite.BlackWhiteCommand;
import com.designpattern.Command.Composite.CompositeCommand;
import com.designpattern.Command.Composite.ResizeCommand;
import com.designpattern.Command.CustomerService;
import com.designpattern.Command.Fx.ButtonCommand;
import com.designpattern.Command.Undoable.BoldCommand;
import com.designpattern.Command.Undoable.Document;
import com.designpattern.Command.Undoable.UndoCommand;
import com.designpattern.Command.VideoEditor.AddLabelCommand;
import com.designpattern.Command.VideoEditor.VideoEditor;
import com.designpattern.Command.VideoEditor.VideoResizeCommand;
import com.designpattern.Template.AuditTrail;
import com.designpattern.Template.GenerateReport;
import com.designpattern.Template.Task;
import com.designpattern.Template.TransferMoneyTask;
import com.designpattern.chainOfResponsibility.*;
import com.designpattern.chainOfResponsibility.Exercise.*;
import com.designpattern.mediator.ArticleDialogBox;
import com.designpattern.mediator.DialogBox;
import com.designpattern.mediator.Exercise.SignUpDialogBox;
import com.designpattern.mediator.Observer.ArticleDialogBoxObs;
import com.designpattern.observer.Chart;
import com.designpattern.observer.DataSource;
import com.designpattern.observer.Exercise.StatusBar;
import com.designpattern.observer.Exercise.StockDataSource;
import com.designpattern.observer.Exercise.StockListView;
import com.designpattern.observer.SpreadSheet;
import com.designpattern.visitor.*;
import com.designpattern.visitor.exercise.*;

public class Main {

    public static void main(String[] args) {

        /*Visitor Pattern*/
        HtmlDocument doc = new HtmlDocument();
        doc.add(new AnchorNode());
        doc.add(new HeadingNode());
        doc.execute(new HighlightOperation());
        doc.execute(new PlaintextOperation());

        AudioEditor editor = new AudioEditor();
        editor.add(new WavFile());
        editor.add(new MP3File());
        editor.execute(new NoiseReductionVisitor());
        editor.execute(new ReverbVisitor());
        editor.execute(new NormalizeVisitor());

        /*Visitor Pattern*/


//        --------------------------------------------------------------------

        /*Chain of Responsibility Pattern*/
//        Compressor compressor = new Compressor(null);
//        Logger logger = new Logger(compressor);
//        Encryptor encryptor = new Encryptor(logger);
//        Authenticator authenticator = new Authenticator(encryptor);
//        HttpRequest request = new HttpRequest("fardim", "1234");
//        WebServer server = new WebServer(authenticator);
//        server.handle(request);

//        Quickbook quickbook = new Quickbook(null);
//        ExcelSpreadSheet excel = new ExcelSpreadSheet(quickbook);
//        NumberSpreadSheet numberSpreadSheet = new NumberSpreadSheet(excel);
//        DataReader reader = new DataReader(numberSpreadSheet);
//        Data data = new Data(new byte[] {});
//        reader.importData(data);

        /*Chain of Responsibility Pattern*/


//        ----------------------------------------------------------------

        /*Mediator Pattern*/
//        ArticleDialogBox dialog = new ArticleDialogBox();
//        dialog.simulateUserInteraction();
//
//        ArticleDialogBoxObs dialogObs = new ArticleDialogBoxObs();
//        dialogObs.simulateUserInteraction();
//        SignUpDialogBox box = new SignUpDialogBox();
//        box.simulation();
        /*Mediator Pattern*/


//        -------------------------------------------------------------


        /*Observer Pattern*/
//        DataSource source = new DataSource();
//        Chart chart = new Chart(source);
//        SpreadSheet sheet1 = new SpreadSheet(source);
//        SpreadSheet sheet2 = new SpreadSheet(source);
//        source.addObserver(chart);
//        source.addObserver(sheet1);
//        source.addObserver(sheet2);
//        source.setValue(20);
//
//        StockDataSource stockSource = new StockDataSource();
//        StatusBar bar = new StatusBar(stockSource);
//        StockListView listView = new StockListView(stockSource);
//        stockSource.addObserver(bar);
//        stockSource.addObserver(listView);
//        stockSource.setPrice(300);
        /*Observer Pattern*/


//        -------------------------------------------------------------------------

        /*Command Pattern*/
//        CustomerService service = new CustomerService();
//        AddCustomerCommand customerCommand = new AddCustomerCommand(service);
//        ButtonCommand button = new ButtonCommand(customerCommand);
//        button.click();
//
//        CompositeCommand compCommand = new CompositeCommand();
//        compCommand.add(new AddCustomerCommand(service));
//        compCommand.add(new ResizeCommand());
//        compCommand.add(new BlackWhiteCommand());
//        compCommand.execute();
//
//
//        Document doc = new Document();
//        doc.setContent("Hello World");
//        com.designpattern.Command.Undoable.History history = new com.designpattern.Command.Undoable.History();
//        BoldCommand bcmd = new BoldCommand(doc, history);
//        UndoCommand undoCommand = new UndoCommand(history);
//        bcmd.execute();
//        System.out.println(doc.getContent());
//
//        undoCommand.execute();
//        System.out.println(doc.getContent());
//
//
//        VideoEditor video = new VideoEditor();
//        video.setSize(300);
//        video.setLabel("Fardim");
//
//        AddLabelCommand labelCommand = new AddLabelCommand(history, video);
//        labelCommand.setNewLabel("kaiser");
//        labelCommand.execute();
//        System.out.println(video.getLabel());
//        System.out.println(video.getSize());
//
//        VideoResizeCommand videoCommand = new VideoResizeCommand(history, video);
//        videoCommand.setNewSize(500);
//        videoCommand.execute();
//        System.out.println(video.getLabel());
//        System.out.println(video.getSize());
//
//
//        undoCommand.execute();
//        System.out.println(video.getLabel());
//        System.out.println(video.getSize());
//        undoCommand.execute();
//        System.out.println(video.getLabel());
//        System.out.println(video.getSize());
        /*Command Pattern*/


//        ---------------------------------------------------------------------------


        /*Template Pattern*/
//        Task task = new TransferMoneyTask(new AuditTrail());
//        task.execute();
//        Task task2 = new GenerateReport(new AuditTrail());
//        task2.execute();
//
//        Window messWindow = new MessageWindow(new BeforeCloseTask());
//        messWindow.closeWindow();
//
//        Window modalWindow = new ModalWindow(new BeforeCloseTask());
//        modalWindow.closeWindow();
        /*Template Pattern*/


//        ------------------------------------------------------------------------


        /*Strategy Pattern*/
//        ImageStorage imageStorage = new ImageStorage();
//        imageStorage.store("Fardim", new JpegCompressor(), new BlackAndWhiteFilter());
//        imageStorage.store("Kaiser", new PngCompressor(), new ContrastFilter());
//
//        ChatClient client = new ChatClient();
//        client.sendMessage("hello kaiser", new Sha256Encryption());
//        client.sendMessage("hello Fardim", new Sha1Encryption());
        /*Strategy Pattern*/


//----------------------------------------------------------------------

        /* Iterator Pattern */
//        BrowseHistory history = new BrowseHistory();
//        Iterator<String> listIterator =  history.createIterator();
//        Iterator<String> arrayIterator = history.createArrayIterator();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        history.arrpush("d");
//        history.arrpush("e");
//        history.arrpush("f");
//
//        while (listIterator.hasNext()) {
//            String url = listIterator.current();
//            System.out.println(url);
//            listIterator.next();
//        }
//
//        while (arrayIterator.hasNext()) {
//            String url = arrayIterator.current();
//            System.out.println(url);
//            arrayIterator.next();
//        }
//
//        ProductCollection collection = new ProductCollection();
//        Iterator<Product> productIterator = collection.createProductIterator();
//        collection.push(new Product(1, "Mango"));
//        collection.push(new Product(2, "Orange"));
//        collection.push(new Product(3, "Apple"));
//        while (productIterator.hasNext()) {
//            Product product = productIterator.current();
//            System.out.println("Id: "+ product.Id + ", Name: "+product.Name);
//            productIterator.next();
//        }
        /* Iterator Pattern */


//        -------------------------------------------------
        /*State Patter*/
//        Canvas canvas = new Canvas();
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        canvas.setCurrentTool(new SelectionTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
        /*State Patter*/

//        -------------------------------------------------
        /*Memento Pattern*/
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("a");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());
        /*Memento Pattern*/
    }
    public static void DrawUIControl(UIControl control) {
        control.draw();
    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2020();
    }
}

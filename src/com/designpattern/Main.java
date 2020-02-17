package com.designpattern;

import com.designpattern.Strategy.ChatClient;
import com.designpattern.Strategy.Compressor.JpegCompressor;
import com.designpattern.Strategy.Compressor.PngCompressor;
import com.designpattern.Strategy.Encryption.Sha1Encryption;
import com.designpattern.Strategy.Encryption.Sha256Encryption;
import com.designpattern.Strategy.Filter.BlackAndWhiteFilter;
import com.designpattern.Strategy.Filter.ContrastFilter;
import com.designpattern.Strategy.ImageStorage;
import com.designpattern.Template.AuditTrail;
import com.designpattern.Template.Exercise.BeforeCloseTask;
import com.designpattern.Template.Exercise.MessageWindow;
import com.designpattern.Template.Exercise.ModalWindow;
import com.designpattern.Template.Exercise.Window;
import com.designpattern.Template.GenerateReport;
import com.designpattern.Template.Task;
import com.designpattern.Template.TransferMoneyTask;
import com.designpattern.iterator.BrowseHistory;
import com.designpattern.iterator.Iterator;
import com.designpattern.iterator.Product;
import com.designpattern.iterator.ProductCollection;
import com.designpattern.memento.Editor;
import com.designpattern.memento.EditorState;
import com.designpattern.state.BrushTool;
import com.designpattern.state.Canvas;
import com.designpattern.state.EraserTool;
import com.designpattern.state.SelectionTool;

public class Main {

    public static void main(String[] args) {

        /*Template Pattern*/
        Task task = new TransferMoneyTask(new AuditTrail());
        task.execute();
        Task task2 = new GenerateReport(new AuditTrail());
        task2.execute();

        Window messWindow = new MessageWindow(new BeforeCloseTask());
        messWindow.closeWindow();

        Window modalWindow = new ModalWindow(new BeforeCloseTask());
        modalWindow.closeWindow();
        /*Template Pattern*/


        /*Strategy Pattern*/
//        ImageStorage imageStorage = new ImageStorage();
//        imageStorage.store("Fardim", new JpegCompressor(), new BlackAndWhiteFilter());
//        imageStorage.store("Kaiser", new PngCompressor(), new ContrastFilter());
//
//        ChatClient client = new ChatClient();
//        client.sendMessage("hello kaiser", new Sha256Encryption());
//        client.sendMessage("hello Fardim", new Sha1Encryption());
        /*Strategy Pattern*/



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

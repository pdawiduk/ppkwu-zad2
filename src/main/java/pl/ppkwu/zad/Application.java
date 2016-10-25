package pl.ppkwu.zad;

import pl.ppkwu.zad.api.FileLibrary;
import pl.ppkwu.zad.impl.FileLibraryImpl;
import pl.ppkwu.zad.impl.IOUtils;
import pl.ppkwu.zad.impl.RetryCallbackImpl;

public class Application {

    private static FileLibrary fileLibrary;
    private static RetryCallbackImpl retryCallback;

    public static void main(String[] args) {
        fileLibrary = new FileLibraryImpl();
        retryCallback = new RetryCallbackImpl();

        fileLibrary.setRetryCallback(retryCallback);

        String correctMessage = IOUtils.getInput("Poprawny string");
        String wrongMessage = IOUtils.getInput("Niepoprawny string");
        String fileName = IOUtils.getInput("Nazwa pliku: ");

        fileLibrary.writeToFile(fileName, correctMessage, wrongMessage);

    }
}

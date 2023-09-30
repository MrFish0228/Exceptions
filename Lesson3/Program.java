package Lesson3;

import Lesson3.src.Presenter.Presenter;
import Lesson3.src.View.ConsoleView;
import Lesson3.src.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}

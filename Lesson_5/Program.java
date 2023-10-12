package Lesson_5;

import Lesson_5.models.TableModel;
import Lesson_5.presenters.BookingPresenter;
import Lesson_5.presenters.Model;
import Lesson_5.presenters.View;
import Lesson_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 3, "Станислав");
        //view.changeReservationTable(1001, new Date(), 2, "Станислав");
    }

}

package MyDAO;
import java.util.ArrayList;


public interface Dao {
	Book getBook(int idbook);//выбор платежа по номеру
	User getUser(int iduser);//выбор плательщика
	ArrayList<Book> getBook();//загрузка таблицы Expenses в коллекцию
	ArrayList<User> getUser();//загрузка таблицы Receivers в коллекцию
	
	int addBook(Book exp);//добавление платежа
	int addUser(User res);//добавление плательщика

}

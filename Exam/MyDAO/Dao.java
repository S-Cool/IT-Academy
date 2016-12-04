package MyDAO;
import java.util.ArrayList;


public interface Dao {
	Book getBook(int idbook);//����� ������� �� ������
	User getUser(int iduser);//����� �����������
	ArrayList<Book> getBook();//�������� ������� Expenses � ���������
	ArrayList<User> getUser();//�������� ������� Receivers � ���������
	
	int addBook(Book exp);//���������� �������
	int addUser(User res);//���������� �����������

}

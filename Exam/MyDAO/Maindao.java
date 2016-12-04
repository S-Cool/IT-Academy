package MyDAO;

import java.util.ArrayList;

public class Maindao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dao dao = new MyDao();

		ArrayList<Book> books = dao.getBook();
		for (int i = 0; i < books.size(); i++) {
			Book boo = books.get(i);
			System.out.println(boo.getIdbook() + " " + boo.getTitle() + " " + boo.getDescription() + " " + boo.getAuthor()+ boo.getCategorybook() + " " + boo.getReleasedate() + " " + boo.getPrice()+ " " + boo.getSurnamebook());
			// System.out.println(exp.getNum()+" "+exp.getPaydate()+" "+dao.getReceiver(exp.getReceiver()).getName()+" "+exp.getValue());
		}
		ArrayList<User> users = dao.getUser();
		for (int i = 0; i < users.size(); i++) {
			User use = users.get(i);
			System.out.println(use.getIduser() + " " + use.getFirst() + " " + use.getSurnameuser() + " " + use.getEmail()+ " " + use.getPassword());
			// System.out.println(exp.getNum()+" "+exp.getPaydate()+" "+dao.getReceiver(exp.getReceiver()).getName()+" "+exp.getValue());
		}
	}

}
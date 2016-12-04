package MyDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MyDao implements Dao {
	private Connection connection;

	public MyDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error loading driver! " + e);
		}
		String sbUrl = "jdbc:mysql://localhost:3306/library";
		try {
			connection = DriverManager.getConnection(sbUrl, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book getBook(int idbook) {

		String query = "select * from book where idbook=" + idbook;
		try {
			Statement st = connection.createStatement();
			ResultSet res = st.executeQuery(query);

			Book boo;

			if (res.next()) {
				boo = new Book();
				boo.setIdbook(res.getInt(1));
				boo.setTitle(res.getString(2));
				boo.setDescription(res.getString(3));
				boo.setCategorybook(res.getString(4));
				boo.setReleasedate(res.getString(5));
				boo.setPrice(res.getString(6));
				boo.setAuthor(res.getString(7));
				boo.setSurnamebook(res.getString(8));	
			} else {
				boo = null;
			}
			return boo;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public User getUser(int iduser) {

		String query = "select * from user where iduser=" + iduser;
		try {
			Statement ts = connection.createStatement();
			ResultSet res = ts.executeQuery(query);

			User use;

			if (res.next()) {
				use = new User();
				use.setIduser(res.getInt(1));
				use.setFirst(res.getString(2));
				use.setSurnameuser(res.getString(3));
				use.setEmail(res.getString(4));
				use.setPassword(res.getString(5));	
			} else {
				use = null;
			}
			return use;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ArrayList<Book> getBook() {
		String query = "select * from book";
		ArrayList<Book> books = new ArrayList<Book>();

		try {
			Statement st = connection.createStatement();
			ResultSet res = st.executeQuery(query);

			Book boo;

			while (res.next()) {
				boo = new Book();
				boo.setIdbook(res.getInt(1));
				boo.setTitle(res.getString(2));
				boo.setDescription(res.getString(3));
				boo.setCategorybook(res.getString(4));
				boo.setReleasedate(res.getString(5));
				boo.setPrice(res.getString(6));
				boo.setAuthor(res.getString(7));
				boo.setSurnamebook(res.getString(8));	
				books.add(boo);
			}
			// return book;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public ArrayList<User> getUser() {
		String query = "select * from user";
		ArrayList<User> users = new ArrayList<User>();

		try {
			Statement st = connection.createStatement();
			ResultSet res = st.executeQuery(query);

			User use;

			while (res.next()) {
				use = new User();
				use = new User();
				use.setIduser(res.getInt(1));
				use.setFirst(res.getString(2));
				use.setSurnameuser(res.getString(3));
				use.setEmail(res.getString(4));
				use.setPassword(res.getString(5));		
				users.add(use);
			}
			// return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}
	
	@Override
	public int addBook(Book exp) {
		String s = "insert into book values(" + exp.getIdbook() + ",'"
				+ exp.getTitle() + "'," + exp.getDescription() + ","
				+ exp.getAuthor() + ")";
		Statement st;
		int n = 0;
		try {
			st = connection.createStatement();
			n = st.executeUpdate(s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

		return n;
	}

	@Override
	public int addUser(User res) {
		// TODO Auto-generated method stub
		return 0;
	}

}

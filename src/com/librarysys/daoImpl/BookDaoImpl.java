package com.librarysys.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.librarysys.dao.BookDao;
import com.librarysys.model.Book;

public class BookDaoImpl implements BookDao {
	// Dependancy Injection
	private  DataSource dataSource;
	
	public void setDataSource( DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void createBook(Book book) {
			Connection connection = null;
			PreparedStatement ps = null;
			
			try {
				connection=dataSource.getConnection();
				String SQL="INSERT INTO book(book_id,book_name,publication_date,sub_classification_id) VALUES(?,?,?,?)";
				ps=connection.prepareStatement(SQL);
			

				ps.setInt(1, book.getBookId());
				ps.setString(2, book.getBookName());
				ps.setString(3, book.getDate());
				ps.setString(4, book.getSubClassificationId());
				int executeUpdate =ps.executeUpdate();
				
				if(executeUpdate>0) {
					System.out.println("Book is created");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}	
			
		}
		
	

	@Override
	public Book fetchBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteBookById(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBookById(String newbookName, int bookId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

}

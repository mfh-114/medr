package org.mfh114.medr;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

/***
 * It is generic interface of CRUD operations of DAO. All DAOs will implements
 * this interface. One DAO must handle one concrete DTO. DAO shoule not
 * represents multiple DTO.
 * 
 * @author fhaider
 *
 * @param <T>
 */
public interface GenericDAO<T extends GenericDTO> {

	void setDataSource(DataSource dataSource);

	DataSource getDataSource();

	List<T> findAll(Integer identifier);

	void create(T t);

	void update(T t);

	void delete(Integer identifier);

	static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// ignore.
			}
		}
	}

	static void closeStatement(Statement stmt) {
		closeStatements(stmt);
	}

	static void closeStatements(Statement... stmts) {
		if (stmts != null && stmts.length > 0) {
			for (Statement stmt : stmts) {
				if (stmt != null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						// ignore
					}
				}
			}
		}
	}

	static void closeResultSet(ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// ignore
			}
		}

	}
}

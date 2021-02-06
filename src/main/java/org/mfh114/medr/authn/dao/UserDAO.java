package org.mfh114.medr.authn.dao;

import java.util.List;

import javax.sql.DataSource;

import org.mfh114.medr.GenericDAO;
import org.mfh114.medr.authn.dto.UserDTO;

public class UserDAO implements GenericDAO<UserDTO> {

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub

	}

	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> findAll(Integer identifier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(UserDTO t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserDTO t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer identifier) {
		// TODO Auto-generated method stub

	}

}

package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.Table;

class TableTest {
	Table table = new Table();
	
	@Test
	public void testCreate() throws SQLException {
		//table.getConnection();
		assertEquals("Table is created.",table.createTable());
	}
	
	@Test
	public void testInsert() throws SQLException {
		assertEquals("2 rows inserted",table.insertData());
	}
	
	@Test
	public void testDelete() throws SQLException {
		assertEquals("1 row deleted",table.deleteData());
	}
	
	@Test
	public void testUpdate() throws SQLException {
		assertEquals("1 row updated",table.updateData());
	}

}

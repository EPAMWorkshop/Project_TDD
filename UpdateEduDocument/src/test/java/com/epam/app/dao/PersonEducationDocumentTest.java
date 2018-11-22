package com.epam.app.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.epam.app.dao.PersonEducationDocument;
import com.epam.app.dao.PersonEducationDocumentDao;

public class PersonEducationDocumentTest {

	@Test
	public void testCreateTable() {
		PersonEducationDocumentDao dao_EduDoc=new PersonEducationDocumentDao();
		PersonEducationDocument eduDoc = new PersonEducationDocument();
		eduDoc.setUserID("103");
		assertEquals("Create table Test", "Table created", dao_EduDoc.createTable(eduDoc));
	}
	
	@Test
	public void testGetUserId() {
		PersonEducationDocumentDao dao_EduDoc=new PersonEducationDocumentDao();
		PersonEducationDocument eduDoc = dao_EduDoc.getUserID();
		assertEquals("Get userId Test", "103", eduDoc.getUserID());
	}
	
	@Test
	public void testUpdateEduDoc() {
		PersonEducationDocumentDao dao_EduDoc=new PersonEducationDocumentDao();
		PersonEducationDocument eduDoc = new PersonEducationDocument();
		eduDoc.setUserID("103");
		eduDoc.setDocument_url("/abc.png");
		assertEquals("Update Edu Doc ", "Successful uploaded", dao_EduDoc.updateUrl(eduDoc));
	}

}

package com.epam.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonEducationDocumentDao {
	SessionFactory sessionFactory=null;
	Session session = null;
	public PersonEducationDocumentDao(){
		sessionFactory = buildSessionFactory(PersonEducationDocument.class);
		session = sessionFactory.openSession();
	}
	public String createTable(PersonEducationDocument eduDoc)
	{
		try{
		session.saveOrUpdate(eduDoc);
		return "Table created";

		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
		
	}
	
	private SessionFactory buildSessionFactory(Class clazz)
	{
		return new Configuration().configure().addAnnotatedClass(clazz).buildSessionFactory();
	}

	public PersonEducationDocument getUserID() {
		PersonEducationDocument personEducationDocument = null;
		try{
		return personEducationDocument=session.get(PersonEducationDocument.class,1);
		}
		catch(Exception e)
		{
			return personEducationDocument;
		}
		
	}
	public String updateUrl(PersonEducationDocument eduDoc) {
		try{
			session.saveOrUpdate(eduDoc);
			return "Successful uploaded";

			}
			catch(Exception e)
			{
				return e.getMessage();
			}
		
	}
	
}

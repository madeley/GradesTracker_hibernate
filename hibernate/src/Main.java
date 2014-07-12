import gradesTracker.SessionFactoryUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();

	}

}

package com.accenture.amtra.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	private static Session amtraSession;
	private static final ThreadLocal<Session> sessionThread = new ThreadLocal<Session>();
	static {
		try {
			sessionFactory = new Configuration().configure(
					"hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session currentSession() {
		amtraSession = sessionThread.get();
		if (amtraSession == null || !amtraSession.isOpen()) {
			amtraSession = sessionFactory.openSession();
			sessionThread.set(amtraSession);
		}
		return amtraSession;
	}
	
}
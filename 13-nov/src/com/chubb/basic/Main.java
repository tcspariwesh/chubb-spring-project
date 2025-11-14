package com.chubb.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(Main.class);

		List<Author> authors = new ArrayList<>();
		authors.add(new Author());
		Book book = new Book(1, "TMH", authors, "Learn Java", 100, 110.2F, EDITION.FIRST, new Date());
		logger.debug(book.getName());
		logger.info(book.getName());

		try {
			int i = 1 / 0;
		} catch (ArithmeticException arithmeticException) {
			logger.error(arithmeticException);
//			arithmeticException.printStackTrace(); //avoid
		}
	}
}

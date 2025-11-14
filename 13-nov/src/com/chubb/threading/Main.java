package com.chubb.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(Main.class);
		Worker worker = new Worker();
		//		worker.start();
//		worker.start();
		int cores=Runtime.getRuntime().availableProcessors();
		logger.debug(cores);//this is not even logging
		ExecutorService service = Executors.newFixedThreadPool(cores);
		service.execute(worker);
		service.execute(worker);
		service.execute(worker);
		service.shutdown();
	}
}

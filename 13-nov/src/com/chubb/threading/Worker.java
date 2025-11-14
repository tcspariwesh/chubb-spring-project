package com.chubb.threading;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.chubb.basic.Main;

public class Worker extends Thread{
	final Logger logger = LogManager.getLogger(Worker.class);
	@Override
	public void run() {
		logger.trace("worker");
	}
}

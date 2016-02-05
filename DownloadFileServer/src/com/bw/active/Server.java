package com.bw.active;

import org.apache.log4j.xml.DOMConfigurator;

import com.commonSocket.net.AppContext;


/**
 * @author dennyzhao
 * 
 */
public class Server {
	/**
	 * 
	 */
	public Server() {
		// 加载日志配置文件
		DOMConfigurator.configure("resources/config/log4j.xml");
		AppContext appContext = AppContext.getInstance();
		MinaServer mina = (MinaServer) appContext.getBean("minaServer");
		mina.start();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Server();
	}

}
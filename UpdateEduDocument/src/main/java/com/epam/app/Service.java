package com.epam.app;

import java.io.IOException;

public interface Service {
	public String askHello();
	public String sayHello(String s) throws IOException;
}

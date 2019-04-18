package co.com.appium.prueba.utils;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class MyBusinessException extends SerenityManagedException {

	public MyBusinessException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }

}

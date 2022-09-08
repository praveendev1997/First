package qsp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class DemoLibrary {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib();
		String cn = f.getExcelData("CreateCustomer", 1, 2);
		System.out.println(cn);

	}

}

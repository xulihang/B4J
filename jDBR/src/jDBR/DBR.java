package jDBR;

import com.dynamsoft.dbr.BarcodeReader;
import com.dynamsoft.dbr.BarcodeReaderException;
import com.dynamsoft.dbr.TextResult;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.ShortName;
import anywheresoftware.b4a.BA.Version;

/**
* The main object that raises the GPS events.
*/
@ShortName("jDBR")
@Version(1f)
public class DBR {

	private BA ba;
	private BarcodeReader reader;
	public void Initialize(final BA ba, String organizationID, String EventName) throws InterruptedException {
		this.ba=ba;
		 try {
			    reader = new BarcodeReader("t0068MgAAAJWPwDybm7nk0f9xYH25MMaVrZYcmhsiVoZrVo2hfcwRS74T6QA79OfzyvhC+9fgFI2noI8zBc66WHFCusVUgqk=");
	        } catch (BarcodeReaderException e) {
	            e.printStackTrace();
	        }
	}
	
	public TextResultWrapper[] decodeBytes(byte[] bytes,String template) throws BarcodeReaderException {
		TextResult[] results=reader.decodeFileInMemory(bytes, template);
		TextResultWrapper[] resultsWrapped = new TextResultWrapper[results.length];
		for (int i=0;i<results.length;i++) {
			TextResultWrapper tr = new TextResultWrapper();
			tr.Initialize(results[i]);
			resultsWrapped[i]= tr;
		}
		return resultsWrapped;
	}


}

package jDBR;

import com.dynamsoft.dbr.Point;
import com.dynamsoft.dbr.TextResult;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.BA.ShortName;

@ShortName("TextResult")
public class TextResultWrapper extends AbsObjectWrapper<TextResult> {
    public void Initialize(TextResult tr) {        
        setObject(tr);
    }    
    public int getBarcodeFormat() {return getObject().barcodeFormat;}
    public String getBarcodeFormatString() {return getObject().barcodeFormatString;}
    public String getBarcodeText() {return getObject().barcodeText;}
    public Point[] getResultPoints() {return getObject().localizationResult.resultPoints;}    
}

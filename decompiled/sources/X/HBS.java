package X;

import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes6.dex */
public final class HBS extends DefaultHandler2 {
    public final /* synthetic */ HB8 A00;

    public HBS(HB8 hb8) {
        this.A00 = hb8;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        HB8.A0S(this.A00, new String(cArr, i, i2));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        HB8.A0T(this.A00, str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        HAp hAp = new HAp(str2);
        HashMap mapA0u = BV4.A0u();
        hAp.A0E();
        while (true) {
            String strA03 = HAp.A03(hAp, '=', false);
            if (strA03 == null) {
                return;
            }
            hAp.A0G('=');
            mapA0u.put(strA03, hAp.A0D());
            hAp.A0E();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.A00.A02 = new HBA();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        HB8.A0U(this.A00, str, str2, str3, attributes);
    }
}

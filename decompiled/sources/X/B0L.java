package X;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public final class B0L implements ContentHandler {
    public int A00;
    public C1968AvZ A01;
    public final Editable A02;
    public final ContentHandler A03;

    private final void A00() {
        C1968AvZ c1968AvZ = this.A01;
        if (c1968AvZ != null) {
            int i = c1968AvZ.A01;
            Editable editable = this.A02;
            editable.setSpan(c1968AvZ, i, editable.length(), 33);
        }
        this.A01 = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.A03.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.A03.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        A00();
                        this.A00--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    A00();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.A02;
                Object[] spans = editable.getSpans(0, editable.length(), AzT.class);
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj : spans) {
                    if (editable.getSpanFlags(obj) == 17) {
                        arrayListA0h.add(obj);
                    }
                }
                int size = arrayListA0h.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = arrayListA0h.get(i);
                    int spanStart = editable.getSpanStart(obj2);
                    int length = editable.length();
                    editable.removeSpan(obj2);
                    if (spanStart != length) {
                        editable.setSpan(obj2, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.A03.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.A03.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.A03.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.A03.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.A03.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.A03.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.A03.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        A00();
                        this.A00++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    A00();
                    this.A01 = new C1968AvZ(C1835Arz.A06, this.A00, this.A02.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            Editable editable = this.A02;
                            int length2 = editable.length();
                            editable.setSpan(new AzT(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.A03.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.A03.startPrefixMapping(str, str2);
    }

    public B0L(Editable editable, ContentHandler contentHandler) {
        this.A03 = contentHandler;
        this.A02 = editable;
    }
}

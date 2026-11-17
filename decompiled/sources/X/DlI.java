package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
public final class DlI implements Attributes {
    public XmlPullParser A00;
    public final /* synthetic */ HB8 A01;

    public DlI(HB8 hb8, XmlPullParser xmlPullParser) {
        this.A01 = hb8;
        this.A00 = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.A00.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i) {
        return this.A00.getAttributeName(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i) {
        XmlPullParser xmlPullParser = this.A00;
        String attributeName = xmlPullParser.getAttributeName(i);
        return xmlPullParser.getAttributePrefix(i) != null ? FGI.A0O(xmlPullParser.getAttributePrefix(i), attributeName, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR) : attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i) {
        return this.A00.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i) {
        return this.A00.getAttributeValue(i);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }
}

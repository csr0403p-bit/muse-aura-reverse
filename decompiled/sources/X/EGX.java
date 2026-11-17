package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public abstract class EGX {
    public static final ThreadLocal<TypedValue> A00 = new ThreadLocal<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109  */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList A00(android.content.res.Resources.Theme r33, android.content.res.Resources r34, android.util.AttributeSet r35, org.xmlpull.v1.XmlPullParser r36) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGX.A00(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.content.res.ColorStateList");
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, XmlPullParser xmlPullParser) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return A00(theme, resources, attributeSetAsAttributeSet, xmlPullParser);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}

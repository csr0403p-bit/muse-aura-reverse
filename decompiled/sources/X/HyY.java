package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes6.dex */
public abstract class HyY {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ea, code lost:
    
        if (r2 == 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
    
        if (r2 == 2) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ee, code lost:
    
        r27 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
    
        r27 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        r2 = new android.graphics.SweepGradient(r20, r19, r0.A01, r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        if (r25 <= 0.0f) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0206, code lost:
    
        r1 = r0.A01;
        r0 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020a, code lost:
    
        if (r2 == 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020c, code lost:
    
        if (r2 == 2) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020e, code lost:
    
        r28 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0211, code lost:
    
        r28 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0214, code lost:
    
        r28 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0216, code lost:
    
        r2 = new android.graphics.RadialGradient(r20, r19, r25, r1, r0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0226, code lost:
    
        r27 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0228, code lost:
    
        r2 = new android.graphics.LinearGradient(r21, r22, r23, r24, r1, r0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        return new X.C8414FdW(null, r2, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cb, code lost:
    
        if (r14.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        r0 = new X.HzW(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
    
        if (r18 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d5, code lost:
    
        r0 = new X.HzW(r5, r17, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        r0 = new X.HzW(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e2, code lost:
    
        if (r11 == 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
    
        if (r11 == 2) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e6, code lost:
    
        r1 = r0.A01;
        r0 = r0.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C8414FdW A02(android.content.res.Resources.Theme r24, android.content.res.TypedArray r25, java.lang.String r26, org.xmlpull.v1.XmlPullParser r27, int r28) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HyY.A02(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.FdW");
    }

    public static ColorStateList A00(Resources.Theme theme, TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (!A03("tint", xmlPullParser)) {
            return null;
        }
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        typedArray.getValue(1, typedValueA0Z);
        int i = typedValueA0Z.type;
        if (i == 2) {
            throw C8j3.A18(AnonymousClass006.A0y(typedValueA0Z, ": ", C60O.A0y("Failed to resolve attribute at index ", 1)));
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValueA0Z.data);
        }
        Resources resources = typedArray.getResources();
        try {
            return EGX.A01(theme, resources, resources.getXml(typedArray.getResourceId(1, 0)));
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static TypedArray A01(Resources.Theme theme, Resources resources, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean A03(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}

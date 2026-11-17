package X;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Util;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.Dkp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5571Dkp extends DefaultHandler implements InterfaceC3126Byr<C5580Dky> {
    public long A00;
    public C3014Bry A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public static final Pattern A0C = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern A08 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A09 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A0A = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final int[] A0B = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public C5571Dkp() {
        this(null, 0, false, false, false, false, false);
    }

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = A0C.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int iA0O = BV7.A0O(matcher, 1);
        float f2 = iA0O;
        return !TextUtils.isEmpty(matcher.group(2)) ? f2 / Integer.parseInt(r1) : f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A01(java.lang.String r6) {
        /*
            r5 = 0
            if (r6 == 0) goto Lf
            int r0 = r6.hashCode()
            r4 = 8
            r3 = 4
            r2 = 2
            r1 = 1
            switch(r0) {
                case -2060497896: goto L10;
                case -1724546052: goto L14;
                case -1580883024: goto L1f;
                case -1574842690: goto L2a;
                case -1408024454: goto L2d;
                case -1396432756: goto L41;
                case 99825: goto L4c;
                case 3343801: goto L57;
                case 3530173: goto L60;
                case 552573414: goto L6c;
                case 899152809: goto L77;
                case 1629013393: goto L36;
                case 1855372047: goto L80;
                default: goto Lf;
            }
        Lf:
            return r5
        L10:
            java.lang.String r0 = "subtitle"
            goto L43
        L14:
            java.lang.String r0 = "description"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 512(0x200, float:7.175E-43)
            return r2
        L1f:
            java.lang.String r0 = "enhanced-audio-intelligibility"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L2a:
            java.lang.String r0 = "forced_subtitle"
            goto L43
        L2d:
            java.lang.String r0 = "alternate"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L40
            return r5
        L36:
            java.lang.String r0 = "emergency"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 32
        L40:
            return r2
        L41:
            java.lang.String r0 = "forced-subtitle"
        L43:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 128(0x80, float:1.794E-43)
            return r2
        L4c:
            java.lang.String r0 = "dub"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 16
            return r2
        L57:
            java.lang.String r0 = "main"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r1
        L60:
            java.lang.String r0 = "sign"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L6c:
            java.lang.String r0 = "caption"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            r2 = 64
            return r2
        L77:
            java.lang.String r0 = "commentary"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r4
        L80:
            java.lang.String r0 = "supplementary"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A01(java.lang.String):int");
    }

    public static int A02(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Integer.parseInt(attributeValue) : i;
    }

    public static final int A04(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Util.A06.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static long A06(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Long.parseLong(attributeValue) : j;
    }

    public static final long A07(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue != null ? "INF".equals(attributeValue) ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : (long) (Float.parseFloat(attributeValue) * 1000000.0f) : j;
    }

    private final C5325DgJ A0B(String str, String str2, XmlPullParser xmlPullParser) throws NumberFormatException {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            long j2 = strArrSplit.length == 2 ? (Long.parseLong(strArrSplit[1]) - j) + 1 : -1L;
            return new C5325DgJ(attributeValue, j, j2);
        }
        j = 0;
        return new C5325DgJ(attributeValue, j, j2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final C7408Eum A0F(C7408Eum c7408Eum, String str, XmlPullParser xmlPullParser) {
        String strSubstring;
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return c7408Eum;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = attributeValue.length();
            if (i2 >= length) {
                return new C7408Eum(iArr, strArr, strArr2, i3);
            }
            int iIndexOf = attributeValue.indexOf("$", i2);
            if (iIndexOf == -1) {
                strArr[i3] = FGI.A0M(strArr[i3], attributeValue.substring(i2));
                i2 = length;
            } else if (iIndexOf != i2) {
                strArr[i3] = FGI.A0M(strArr[i3], attributeValue.substring(i2, iIndexOf));
                i2 = iIndexOf;
            } else if (attributeValue.startsWith("$$", i2)) {
                strArr[i3] = FGI.A0M(strArr[i3], "$");
                i2 += 2;
            } else {
                int i4 = i2 + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i4);
                String strSubstring2 = attributeValue.substring(i4, iIndexOf2);
                if (!strSubstring2.equals("RepresentationID")) {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = FGI.A0M(strSubstring, "d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    switch (strSubstring2.hashCode()) {
                        case -1950496919:
                            if (!strSubstring2.equals("Number")) {
                                break;
                            } else {
                                iArr[i3] = 2;
                                strArr2[i3] = strSubstring;
                                break;
                            }
                        case 2606829:
                            if (!strSubstring2.equals("Time")) {
                                break;
                            } else {
                                i = 4;
                                iArr[i3] = i;
                                strArr2[i3] = strSubstring;
                                break;
                            }
                        case 38199441:
                            if (!strSubstring2.equals("Bandwidth")) {
                                break;
                            } else {
                                i = 3;
                                iArr[i3] = i;
                                strArr2[i3] = strSubstring;
                                break;
                            }
                    }
                } else {
                    iArr[i3] = 1;
                }
                i3++;
                strArr[i3] = "";
                i2 = iIndexOf2 + 1;
            }
        }
        throw C60Q.A0U("Invalid template: ", attributeValue);
    }

    public static String A0H(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return null;
        }
        return attributeValue;
    }

    public static boolean A0M(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return attributeValue.equals("true");
        }
        return false;
    }

    public static boolean A0N(List<C5585DlC> list) {
        String str;
        if (A0O(list, 2)) {
            return true;
        }
        for (C5585DlC c5585DlC : list) {
            if (c5585DlC != null) {
                Iterator<Dl9> it = c5585DlC.A03.iterator();
                while (it.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(it);
                    if (dl9A0b != null && dl9A0b.A06 == 2) {
                        Iterator itA02 = Dl9.A02(dl9A0b);
                        String str2 = "";
                        while (itA02.hasNext()) {
                            AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                            if (abstractC5553DkWA0d != null && (str = abstractC5553DkWA0d.A03.A0b) != null && !TextUtils.isEmpty(str)) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/DlC;>;)Z */
    public static boolean A0O(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5585DlC c5585DlC = (C5585DlC) it.next();
            if (c5585DlC != null) {
                Iterator<Dl9> it2 = c5585DlC.A03.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(it2);
                    if (dl9A0b != null && dl9A0b.A06 == i && (i2 = i2 + 1) > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v6 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v4 int), (r2v3 int), (r2v5 int), (r2v7 int) binds: [B:38:0x0097, B:40:0x00a1, B:50:0x00cb, B:46:0x00b8, B:47:0x00ba, B:43:0x00ad, B:44:0x00af, B:25:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A03(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r0 = "schemeIdUri"
            r3 = 0
            java.lang.String r2 = A0H(r0, r4)
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -2128649360: goto L1b;
                case -1352850286: goto L1f;
                case -1138141449: goto L30;
                case -986633423: goto L34;
                case -79006963: goto L4f;
                case 312179081: goto L66;
                case 2036691300: goto L86;
                default: goto Lf;
            }
        Lf:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = X.DlH.A01(r0, r4)
            if (r0 == 0) goto Lf
            return r1
        L1b:
            java.lang.String r0 = "urn:dts:dash:audio_channel_configuration:2012"
            goto L52
        L1f:
            java.lang.String r0 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "value"
            int r1 = A02(r0, r4, r1)
            goto Lf
        L30:
            java.lang.String r0 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            goto L89
        L34:
            java.lang.String r0 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "value"
            int r3 = A02(r0, r4, r1)
            if (r3 < 0) goto Lf
            int[] r2 = X.C5571Dkp.A0B
            r0 = 21
            if (r3 >= r0) goto Lf
            r1 = r2[r3]
            goto Lf
        L4f:
            java.lang.String r0 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
        L52:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "value"
            int r2 = A02(r0, r4, r1)
            if (r2 <= 0) goto Lf
            r0 = 33
            if (r2 >= r0) goto Lf
            goto La4
        L66:
            java.lang.String r0 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "value"
            java.lang.String r2 = r4.getAttributeValue(r3, r0)
            if (r2 == 0) goto Lf
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r2, r0)
            int r0 = java.lang.Integer.bitCount(r0)
            if (r0 == 0) goto Lf
            r1 = r0
            goto Lf
        L86:
            java.lang.String r0 = "urn:dolby:dash:audio_channel_configuration:2011"
        L89:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.getAttributeValue(r3, r0)
            r2 = -1
            if (r0 == 0) goto La4
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 1596796: goto Lc4;
                case 2937391: goto Lbc;
                case 3094035: goto Lb2;
                case 3133436: goto La7;
                default: goto La4;
            }
        La4:
            r1 = r2
            goto Lf
        La7:
            java.lang.String r0 = "fa01"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La4
            r2 = 8
            goto La4
        Lb2:
            java.lang.String r0 = "f801"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La4
            r2 = 6
            goto La4
        Lbc:
            java.lang.String r0 = "a000"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto Lcb
        Lc4:
            java.lang.String r0 = "4000"
            boolean r0 = r1.equals(r0)
            r1 = 1
        Lcb:
            if (r0 != 0) goto Lf
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A03(org.xmlpull.v1.XmlPullParser):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> A08(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A08(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0308 A[LOOP:1: B:52:0x0183->B:157:0x0308, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x092f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5580Dky A09(android.net.Uri r135, X.C5571Dkp r136, org.xmlpull.v1.XmlPullParser r137) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A09(android.net.Uri, X.Dkp, org.xmlpull.v1.XmlPullParser):X.Dky");
    }

    public static C5493DjV A0A(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String strA0H = A0H(BrowserOperationCatalogKt.VALUE, xmlPullParser);
        String strA0H2 = A0H("id", xmlPullParser);
        do {
            xmlPullParser.next();
        } while (!DlH.A01(str, xmlPullParser));
        return new C5493DjV(attributeValue, strA0H, strA0H2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List<X.DgJ>] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final C5588DlG A0C(C5588DlG c5588DlG, XmlPullParser xmlPullParser, long j, long j2, long j3, long j4) throws XmlPullParserException, IOException, NumberFormatException {
        long j5 = j2;
        long jA06 = A06("timescale", xmlPullParser, c5588DlG != null ? ((AbstractC5554DkX) c5588DlG).A01 : 1L);
        long jA062 = A06("presentationTimeOffset", xmlPullParser, c5588DlG != null ? ((AbstractC5554DkX) c5588DlG).A00 : 0L);
        long jA063 = A06("duration", xmlPullParser, c5588DlG != null ? ((Dl3) c5588DlG).A02 : -9223372036854775807L);
        long jA064 = A06("startNumber", xmlPullParser, c5588DlG != null ? c5588DlG.A05 : 1L);
        if (j3 != -9223372036854775807L) {
            j5 = j3;
        }
        if (j5 == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            j5 = -9223372036854775807L;
        }
        C5325DgJ c5325DgJA0B = null;
        ?? r8 = 0;
        DlJ dlJA0E = null;
        do {
            xmlPullParser.next();
            if (DlH.A02("Initialization", xmlPullParser)) {
                c5325DgJA0B = A0B("sourceURL", "range", xmlPullParser);
                r8 = r8;
            } else if (DlH.A02("SegmentTimeline", xmlPullParser)) {
                dlJA0E = A0E(xmlPullParser);
                r8 = r8;
            } else {
                ArrayList arrayListA0h = r8;
                if (DlH.A02("SegmentURL", xmlPullParser)) {
                    if (r8 == 0) {
                        arrayListA0h = C3cG.A0h();
                    }
                    arrayListA0h.add(A0B(HatchFileOperations.LibraryPreset.media, "mediaRange", xmlPullParser));
                    r8 = arrayListA0h;
                } else {
                    A0L(xmlPullParser);
                    r8 = r8;
                }
            }
        } while (!DlH.A01("SegmentList", xmlPullParser));
        if (c5588DlG != null) {
            if (c5325DgJA0B == null) {
                c5325DgJA0B = ((AbstractC5554DkX) c5588DlG).A02;
            }
            if (dlJA0E == null || dlJA0E.A02 == null) {
                List<DlF> list = c5588DlG.A06;
                int i = ((Dl3) c5588DlG).A00;
                long j6 = c5588DlG.A03;
                dlJA0E = new DlJ();
                dlJA0E.A02 = list;
                dlJA0E.A00 = i;
                dlJA0E.A01 = j6;
            }
            if (r8 == 0) {
                r8 = c5588DlG.A00;
            }
        }
        return new C5588DlG(c5325DgJA0B, dlJA0E.A02, r8, dlJA0E.A00, jA06, jA062, jA064, jA063, j5, Util.A0A(j4), Util.A0A(j), dlJA0E.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (Lorg/xmlpull/v1/XmlPullParser;LX/Dl0;Ljava/util/List<LX/DjV;>;JJJJZ)LX/Dl0; */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.Dl0 A0D(X.Dl0 r23, java.util.List r24, org.xmlpull.v1.XmlPullParser r25, long r26, long r28, long r30, long r32, boolean r34) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A0D(X.Dl0, java.util.List, org.xmlpull.v1.XmlPullParser, long, long, long, long, boolean):X.Dl0");
    }

    public static String A0G(C5571Dkp c5571Dkp, long j) {
        StringBuilder sbA0z = C60O.A0z("parse:", j);
        sbA0z.append("ms;filter:");
        sbA0z.append(c5571Dkp.A00);
        sbA0z.append("ms;");
        sbA0z.append(c5571Dkp.A02);
        C3014Bry c3014Bry = c5571Dkp.A01;
        if (c3014Bry != null) {
            sbA0z.append(";pool:");
            sbA0z.append(c3014Bry.A01.get());
            sbA0z.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            sbA0z.append(c3014Bry.A02.get());
        }
        return sbA0z.toString();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/DlC;>;Ljava/lang/StringBuilder;)Ljava/lang/String; */
    private String A0I(StringBuilder sb, List list) {
        String strA0M = "";
        if (sb != null) {
            sb.append(FGI.A0U("VideoId: ", this.A03, PairsDiscretionDocument.TERMINATOR));
            sb.append("++++++++++++++++++++++++++++++++++++++++\n");
            sb.append("Is MCM: ");
            sb.append(A0N(list));
            sb.append(PairsDiscretionDocument.TERMINATOR);
            HashMap mapA0u = BV4.A0u();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Iterator<Dl9> it2 = ((C5585DlC) it.next()).A03.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Dl9 dl9A0b = BV6.A0b(it2);
                    if (dl9A0b != null && dl9A0b.A06 == 2) {
                        BV7.A1G("Adaptation set ", PairsDiscretionDocument.TERMINATOR, sb, i);
                        i++;
                        Iterator itA02 = Dl9.A02(dl9A0b);
                        int i2 = 0;
                        while (itA02.hasNext()) {
                            AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                            sb.append("  [");
                            sb.append(i2);
                            sb.append("]");
                            C6154Dwx c6154Dwx = abstractC5553DkWA0d.A03;
                            String str = c6154Dwx.A0b;
                            sb.append(str);
                            sb.append(",");
                            sb.append(c6154Dwx.A0Q);
                            sb.append("x");
                            sb.append(c6154Dwx.A0D);
                            sb.append(",aoai: ");
                            Dl5 dl5A00 = Dl5.A00(c6154Dwx);
                            sb.append(dl5A00.A0E);
                            sb.append(",");
                            sb.append(dl5A00.A0A);
                            sb.append(",");
                            sb.append(c6154Dwx.A05);
                            sb.append("bps\n");
                            i2++;
                            Number numberA0R = C3cG.A0R(0);
                            if (mapA0u.containsKey(str) && (numberA0R = BV6.A0j(str, mapA0u)) == null) {
                                numberA0R = C3cG.A0R(0);
                            }
                            C8j4.A1O(str, mapA0u, numberA0R.intValue() + 1);
                        }
                    }
                }
            }
            sb.append("----------------------------------------\n");
            if (!mapA0u.isEmpty()) {
                Iterator itA0i = C3cG.A0i(mapA0u);
                while (itA0i.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0i);
                    strA0M = FGI.A0M(FGI.A0M(strA0M, String.format(Locale.US, "%d%s", entryA0l.getValue(), entryA0l.getKey())), "+");
                }
                int length = strA0M.length();
                if (length > 1) {
                    return strA0M.substring(0, length - 1);
                }
            }
        }
        return strA0M;
    }

    /* JADX WARN: Incorrect types in method signature: (Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List<LX/DhT;>;Z)Ljava/util/List<LX/DhT;>; */
    public static final ArrayList A0J(List list, XmlPullParser xmlPullParser, boolean z) throws XmlPullParserException, NumberFormatException, IOException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = Integer.MIN_VALUE;
            if (z) {
                i = 1;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                A0L(xmlPullParser);
            }
        } while (!DlH.A01("BaseURL", xmlPullParser));
        if (text != null && C0F.A03(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            C5376DhT[] c5376DhTArr = {new C5376DhT(text, attributeValue3, i, i2)};
            ArrayList arrayListA11 = C60O.A11(6);
            Collections.addAll(arrayListA11, c5376DhTArr);
            return arrayListA11;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C5376DhT c5376DhT = (C5376DhT) list.get(i3);
            String strA01 = C0F.A01(c5376DhT.A03, text);
            String str = attributeValue3;
            if (attributeValue3 == null) {
                str = strA01;
            }
            if (z) {
                i = c5376DhT.A00;
                i2 = c5376DhT.A01;
                str = c5376DhT.A02;
            }
            arrayListA0h.add(new C5376DhT(strA01, str, i, i2));
        }
        return arrayListA0h;
    }

    public static void A0K(C6162Dx5 c6162Dx5, C5586DlD c5586DlD, String str, Collection collection) {
        String str2;
        ArrayList<DrmInitData.SchemeData> arrayList = c5586DlD.A04;
        arrayList.addAll(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            UUID uuid = AbstractC5400Dhr.A00;
            if (!uuid.equals(schemeData.A03) || (str2 = schemeData.A01) == null) {
                i++;
            } else {
                arrayList.remove(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
                    if (AbstractC5400Dhr.A01.equals(schemeData2.A03) && schemeData2.A01 == null) {
                        arrayList.set(i2, new DrmInitData.SchemeData(str2, schemeData2.A02, uuid, schemeData2.A04));
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                c6162Dx5.A04(new DrmInitData(str, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false));
                return;
            }
            DrmInitData.SchemeData schemeData3 = arrayList.get(size);
            if (schemeData3.A04 == null) {
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList.size()) {
                        DrmInitData.SchemeData schemeData4 = arrayList.get(i3);
                        if (schemeData4.A04 != null && schemeData3.A04 == null && schemeData4.A00(schemeData3.A03)) {
                            arrayList.remove(size);
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
    }

    public C5556DkZ A0R(C5556DkZ c5556DkZ, XmlPullParser xmlPullParser) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long jA06 = A06("timescale", xmlPullParser, c5556DkZ != null ? ((AbstractC5554DkX) c5556DkZ).A01 : 1L);
        long j2 = 0;
        long jA062 = A06("presentationTimeOffset", xmlPullParser, c5556DkZ != null ? ((AbstractC5554DkX) c5556DkZ).A00 : 0L);
        if (c5556DkZ != null) {
            j = c5556DkZ.A01;
            j2 = c5556DkZ.A00;
        } else {
            j = 0;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        C5325DgJ c5325DgJA0B = c5556DkZ != null ? c5556DkZ.A02 : null;
        do {
            xmlPullParser.next();
            if (DlH.A02("Initialization", xmlPullParser)) {
                c5325DgJA0B = A0B("sourceURL", "range", xmlPullParser);
            } else {
                A0L(xmlPullParser);
            }
        } while (!DlH.A01("SegmentBase", xmlPullParser));
        return new C5556DkZ(c5325DgJA0B, jA06, jA062, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Dkp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final XmlPullParser A0S() throws XmlPullParserException {
        boolean z = this instanceof C5572Dkq;
        ?? r2 = this;
        if (z) {
            C5572Dkq c5572Dkq = (C5572Dkq) this;
            boolean z2 = c5572Dkq.A01.enableThreadLocalManifestParser;
            r2 = c5572Dkq;
            if (z2) {
                ThreadLocal<XmlPullParser> threadLocal = C5572Dkq.A03;
                XmlPullParser xmlPullParser = threadLocal.get();
                if (xmlPullParser != null) {
                    return xmlPullParser;
                }
                XmlPullParserFactory xmlPullParserFactoryNewInstance = C5572Dkq.A05;
                if (xmlPullParserFactoryNewInstance == null) {
                    synchronized (C5572Dkq.class) {
                        xmlPullParserFactoryNewInstance = C5572Dkq.A05;
                        if (xmlPullParserFactoryNewInstance == null) {
                            xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                            C5572Dkq.A05 = xmlPullParserFactoryNewInstance;
                        }
                    }
                }
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                threadLocal.set(xmlPullParserNewPullParser);
                return xmlPullParserNewPullParser;
            }
        }
        return r2.A04.newPullParser();
    }

    private final DlJ A0E(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayListA0h = C3cG.A0h();
        long j = 0;
        long jMax = 0;
        int i = 0;
        do {
            xmlPullParser.next();
            if (DlH.A02("S", xmlPullParser)) {
                long jA06 = A06("t", xmlPullParser, j);
                long jA062 = A06("d", xmlPullParser, -9223372036854775807L);
                int iA02 = A02("r", xmlPullParser, 0) + 1;
                int iA022 = A02("id", xmlPullParser, 0);
                jMax = Math.max(jMax, jA062);
                arrayListA0h.add(new DlF(iA02, i, iA022, jA06, jA062, false));
                j = jA06 + (iA02 * jA062);
                i += iA02;
            } else {
                A0L(xmlPullParser);
            }
        } while (!DlH.A01("SegmentTimeline", xmlPullParser));
        arrayListA0h.isEmpty();
        DlJ dlJ = new DlJ();
        dlJ.A02 = arrayListA0h;
        dlJ.A00 = i;
        dlJ.A01 = jMax;
        return dlJ;
    }

    public static void A0L(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (true) {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                i++;
            } else if (xmlPullParser.getEventType() == 3) {
                i--;
            } else {
                continue;
            }
            if (i == 0) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: XmlPullParserException -> 0x002f, TRY_LEAVE, TryCatch #0 {XmlPullParserException -> 0x002f, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x0011, B:10:0x0018), top: B:16:0x0005 }] */
    @Override // X.InterfaceC3126Byr
    /* renamed from: A0Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5580Dky AXb(android.net.Uri r8, java.io.InputStream r9) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            long r5 = java.lang.System.currentTimeMillis()
            r4 = 0
            X.Bry r2 = r7.A01     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto L18
            java.lang.String r1 = r7.A03     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            if (r0 != 0) goto L18
            X.Dky r2 = r2.A00(r1)     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            if (r2 == 0) goto L18
            goto L23
        L18:
            org.xmlpull.v1.XmlPullParser r0 = r7.A0S()     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            r0.setInput(r9, r4)     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
            X.Dky r2 = A09(r8, r7, r0)     // Catch: org.xmlpull.v1.XmlPullParserException -> L2f
        L23:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            java.lang.String r0 = A0G(r7, r0)
            r2.A01 = r0
            return r2
        L2f:
            r3 = move-exception
            r2 = 1
            r1 = 4
            androidx.media3.common.ParserException r0 = new androidx.media3.common.ParserException
            r0.<init>(r4, r3, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.AXb(android.net.Uri, java.io.InputStream):X.Dky");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Incorrect types in method signature: (Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List<LX/DhT;>;LX/DkX;JJJJZZ)LX/Dl9; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ce A[PHI: r79
  0x03ce: PHI (r79v15 boolean) = (r79v0 boolean), (r79v16 boolean) binds: [B:117:0x03cc, B:115:0x03c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d8 A[PHI: r79
  0x03d8: PHI (r79v14 boolean) = (r79v0 boolean), (r79v15 boolean) binds: [B:117:0x03cc, B:119:0x03d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03dc A[PHI: r78 r79
  0x03dc: PHI (r78v0 boolean) = (r78v13 boolean), (r78v14 boolean) binds: [B:121:0x03da, B:119:0x03d6] A[DONT_GENERATE, DONT_INLINE]
  0x03dc: PHI (r79v1 boolean) = (r79v14 boolean), (r79v15 boolean) binds: [B:121:0x03da, B:119:0x03d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e6 A[PHI: r78 r79
  0x03e6: PHI (r78v12 boolean) = (r78v0 boolean), (r78v13 boolean) binds: [B:123:0x03e4, B:121:0x03da] A[DONT_GENERATE, DONT_INLINE]
  0x03e6: PHI (r79v13 boolean) = (r79v1 boolean), (r79v14 boolean) binds: [B:123:0x03e4, B:121:0x03da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ea A[PHI: r73 r78 r79
  0x03ea: PHI (r73v11 boolean) = (r73v0 boolean), (r73v12 boolean) binds: [B:123:0x03e4, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]
  0x03ea: PHI (r78v11 boolean) = (r78v0 boolean), (r78v12 boolean) binds: [B:123:0x03e4, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]
  0x03ea: PHI (r79v12 boolean) = (r79v1 boolean), (r79v13 boolean) binds: [B:123:0x03e4, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f4 A[PHI: r73 r78 r79
  0x03f4: PHI (r73v1 boolean) = (r73v11 boolean), (r73v12 boolean) binds: [B:127:0x03f2, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]
  0x03f4: PHI (r78v1 boolean) = (r78v11 boolean), (r78v12 boolean) binds: [B:127:0x03f2, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]
  0x03f4: PHI (r79v2 boolean) = (r79v12 boolean), (r79v13 boolean) binds: [B:127:0x03f2, B:125:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03f8 A[PHI: r72 r73 r78 r79
  0x03f8: PHI (r72v9 boolean) = (r72v0 boolean), (r72v10 boolean) binds: [B:129:0x03f6, B:127:0x03f2] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r73v10 boolean) = (r73v1 boolean), (r73v11 boolean) binds: [B:129:0x03f6, B:127:0x03f2] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r78v10 boolean) = (r78v1 boolean), (r78v11 boolean) binds: [B:129:0x03f6, B:127:0x03f2] A[DONT_GENERATE, DONT_INLINE]
  0x03f8: PHI (r79v11 boolean) = (r79v2 boolean), (r79v12 boolean) binds: [B:129:0x03f6, B:127:0x03f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0402 A[PHI: r72 r73 r78 r79
  0x0402: PHI (r72v8 boolean) = (r72v0 boolean), (r72v9 boolean) binds: [B:129:0x03f6, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r73v9 boolean) = (r73v1 boolean), (r73v10 boolean) binds: [B:129:0x03f6, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r78v9 boolean) = (r78v1 boolean), (r78v10 boolean) binds: [B:129:0x03f6, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0402: PHI (r79v10 boolean) = (r79v2 boolean), (r79v11 boolean) binds: [B:129:0x03f6, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0406 A[PHI: r71 r72 r73 r78 r79
  0x0406: PHI (r71v0 boolean) = (r71v7 boolean), (r71v8 boolean) binds: [B:133:0x0404, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0406: PHI (r72v1 boolean) = (r72v8 boolean), (r72v9 boolean) binds: [B:133:0x0404, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0406: PHI (r73v2 boolean) = (r73v9 boolean), (r73v10 boolean) binds: [B:133:0x0404, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0406: PHI (r78v2 boolean) = (r78v9 boolean), (r78v10 boolean) binds: [B:133:0x0404, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]
  0x0406: PHI (r79v3 boolean) = (r79v10 boolean), (r79v11 boolean) binds: [B:133:0x0404, B:131:0x0400] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0410 A[PHI: r71 r72 r73 r78 r79
  0x0410: PHI (r71v6 boolean) = (r71v0 boolean), (r71v7 boolean) binds: [B:135:0x040e, B:133:0x0404] A[DONT_GENERATE, DONT_INLINE]
  0x0410: PHI (r72v7 boolean) = (r72v1 boolean), (r72v8 boolean) binds: [B:135:0x040e, B:133:0x0404] A[DONT_GENERATE, DONT_INLINE]
  0x0410: PHI (r73v8 boolean) = (r73v2 boolean), (r73v9 boolean) binds: [B:135:0x040e, B:133:0x0404] A[DONT_GENERATE, DONT_INLINE]
  0x0410: PHI (r78v8 boolean) = (r78v2 boolean), (r78v9 boolean) binds: [B:135:0x040e, B:133:0x0404] A[DONT_GENERATE, DONT_INLINE]
  0x0410: PHI (r79v9 boolean) = (r79v3 boolean), (r79v10 boolean) binds: [B:135:0x040e, B:133:0x0404] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0414 A[PHI: r69 r71 r72 r73 r78 r79
  0x0414: PHI (r69v5 boolean) = (r69v0 boolean), (r69v6 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x0414: PHI (r71v5 boolean) = (r71v0 boolean), (r71v6 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x0414: PHI (r72v6 boolean) = (r72v1 boolean), (r72v7 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x0414: PHI (r73v7 boolean) = (r73v2 boolean), (r73v8 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x0414: PHI (r78v7 boolean) = (r78v2 boolean), (r78v8 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x0414: PHI (r79v8 boolean) = (r79v3 boolean), (r79v9 boolean) binds: [B:135:0x040e, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041e A[PHI: r69 r71 r72 r73 r78 r79
  0x041e: PHI (r69v1 boolean) = (r69v5 boolean), (r69v6 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x041e: PHI (r71v1 boolean) = (r71v5 boolean), (r71v6 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x041e: PHI (r72v2 boolean) = (r72v6 boolean), (r72v7 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x041e: PHI (r73v3 boolean) = (r73v7 boolean), (r73v8 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x041e: PHI (r78v3 boolean) = (r78v7 boolean), (r78v8 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]
  0x041e: PHI (r79v4 boolean) = (r79v8 boolean), (r79v9 boolean) binds: [B:139:0x041c, B:137:0x0412] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0422 A[PHI: r68 r69 r71 r72 r73 r78 r79
  0x0422: PHI (r68v3 boolean) = (r68v0 boolean), (r68v4 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r69v4 boolean) = (r69v1 boolean), (r69v5 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r71v4 boolean) = (r71v1 boolean), (r71v5 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r72v5 boolean) = (r72v2 boolean), (r72v6 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r73v6 boolean) = (r73v3 boolean), (r73v7 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r78v6 boolean) = (r78v3 boolean), (r78v7 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]
  0x0422: PHI (r79v7 boolean) = (r79v4 boolean), (r79v8 boolean) binds: [B:141:0x0420, B:139:0x041c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x042c A[PHI: r68 r69 r71 r72 r73 r78 r79
  0x042c: PHI (r68v2 boolean) = (r68v0 boolean), (r68v3 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r69v3 boolean) = (r69v1 boolean), (r69v4 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r71v3 boolean) = (r71v1 boolean), (r71v4 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r72v4 boolean) = (r72v2 boolean), (r72v5 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r73v5 boolean) = (r73v3 boolean), (r73v6 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r78v5 boolean) = (r78v3 boolean), (r78v6 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]
  0x042c: PHI (r79v6 boolean) = (r79v4 boolean), (r79v7 boolean) binds: [B:141:0x0420, B:143:0x042a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07e9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v328, types: [X.DkW] */
    /* JADX WARN: Type inference failed for: r0v329, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v332, types: [X.DkW] */
    /* JADX WARN: Type inference failed for: r0v333, types: [X.Dgz, X.Dl1] */
    /* JADX WARN: Type inference failed for: r0v334, types: [X.Dl7] */
    /* JADX WARN: Type inference failed for: r128v0, types: [X.Dkp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.Dl9 A0P(X.AbstractC5554DkX r129, java.util.List r130, org.xmlpull.v1.XmlPullParser r131, long r132, long r134, long r136, long r138, boolean r140, boolean r141) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5571Dkp.A0P(X.DkX, java.util.List, org.xmlpull.v1.XmlPullParser, long, long, long, long, boolean, boolean):X.Dl9");
    }

    public C5571Dkp(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = null;
        this.A00 = 0L;
        this.A05 = z;
        this.A03 = str == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : str;
        this.A06 = z2;
        this.A07 = z5;
        if (z3 && !z4) {
            C3014Bry c3014Bry = C3014Bry.A03;
            if (c3014Bry == null) {
                synchronized (C3014Bry.class) {
                    c3014Bry = C3014Bry.A03;
                    if (c3014Bry == null) {
                        c3014Bry = new C3014Bry(i);
                        C3014Bry.A03 = c3014Bry;
                    }
                }
            }
            this.A01 = c3014Bry;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw BV4.A0d("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}

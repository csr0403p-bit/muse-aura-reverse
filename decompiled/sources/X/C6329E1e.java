package X;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.E1e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6329E1e implements InterfaceC6304E0a {
    public final XmlPullParserFactory A00;
    public static final Pattern A07 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A08 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern A03 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A06 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern A04 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern A05 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern A02 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final C6336E1m A01 = new C6336E1m(1, 30.0f, 1);

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static long A00(C6336E1m c6336E1m, String str) throws SubtitleDecoderException, NumberFormatException {
        double d;
        double d2;
        double d3;
        Matcher matcher = A07.matcher(str);
        if (matcher.matches()) {
            double dA0M = (BV8.A0M(matcher, 1) * TasksViewModel.SECONDS_PER_HOUR) + (BV8.A0M(matcher, 2) * 60) + BV8.A0M(matcher, 3);
            String strGroup = matcher.group(4);
            d = dA0M + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r0) / c6336E1m.A00 : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r0) / c6336E1m.A01) / c6336E1m.A00 : 0.0d);
        } else {
            Matcher matcher2 = A08.matcher(str);
            if (!matcher2.matches()) {
                throw new SubtitleDecoderException(FGI.A0M("Malformed time expression: ", str));
            }
            d = Double.parseDouble(BV6.A0p(matcher2, 1));
            String strA0p = BV6.A0p(matcher2, 2);
            switch (strA0p.hashCode()) {
                case 102:
                    if (strA0p.equals("f")) {
                        d2 = c6336E1m.A00;
                        d /= d2;
                        break;
                    }
                    break;
                case 104:
                    if (strA0p.equals("h")) {
                        d3 = 3600.0d;
                        d *= d3;
                        break;
                    }
                    break;
                case 109:
                    if (strA0p.equals("m")) {
                        d3 = 60.0d;
                        d *= d3;
                        break;
                    }
                    break;
                case 116:
                    if (strA0p.equals("t")) {
                        d2 = c6336E1m.A02;
                        d /= d2;
                        break;
                    }
                    break;
                case 3494:
                    if (strA0p.equals("ms")) {
                        d2 = 1000.0d;
                        d /= d2;
                        break;
                    }
                    break;
            }
        }
        return (long) (d * 1000000.0d);
    }

    public static E1j A02(E1j e1j, Object obj) {
        return obj == null ? new E1j() : e1j;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:239:0x04e9. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b A[Catch: IOException -> 0x0558, XmlPullParserException -> 0x0561, TryCatch #7 {IOException -> 0x0558, XmlPullParserException -> 0x0561, blocks: (B:3:0x0006, B:6:0x0062, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x0084, B:16:0x0088, B:18:0x0090, B:22:0x00a4, B:23:0x00b4, B:25:0x00be, B:26:0x00c2, B:28:0x00cc, B:29:0x00d0, B:31:0x00e1, B:33:0x00f1, B:35:0x00f6, B:40:0x0104, B:43:0x0113, B:45:0x011b, B:47:0x0129, B:48:0x012f, B:49:0x013c, B:41:0x010e, B:51:0x0143, B:53:0x0149, B:55:0x0151, B:57:0x0159, B:59:0x0161, B:61:0x0169, B:63:0x0172, B:65:0x017a, B:67:0x0183, B:69:0x018c, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ac, B:79:0x01b4, B:84:0x01c2, B:171:0x036c, B:85:0x01d1, B:87:0x01d9, B:89:0x01fd, B:90:0x0209, B:121:0x027f, B:92:0x020d, B:94:0x0215, B:97:0x0220, B:99:0x0228, B:100:0x022d, B:102:0x0235, B:103:0x023a, B:105:0x0242, B:106:0x0247, B:108:0x0250, B:110:0x025a, B:111:0x025d, B:114:0x0261, B:115:0x0268, B:117:0x0270, B:119:0x0278, B:123:0x0285, B:127:0x028f, B:130:0x0295, B:135:0x029f, B:137:0x02a4, B:140:0x02ac, B:142:0x02c4, B:144:0x02c8, B:145:0x02ce, B:172:0x0375, B:174:0x0381, B:176:0x0390, B:178:0x039a, B:179:0x039d, B:182:0x03a9, B:180:0x03a0, B:183:0x03b7, B:169:0x0366, B:185:0x03bb, B:186:0x03bf, B:188:0x03c7, B:190:0x03cf, B:192:0x03d7, B:194:0x03dd, B:196:0x03e5, B:199:0x03ef, B:201:0x0403, B:208:0x0439, B:210:0x0441, B:212:0x0447, B:214:0x044f, B:227:0x04ad, B:229:0x04b5, B:231:0x04c1, B:233:0x04c9, B:236:0x04d5, B:238:0x04e1, B:239:0x04e9, B:241:0x04ed, B:247:0x050c, B:242:0x04f7, B:243:0x04ff, B:234:0x04cb, B:216:0x0453, B:218:0x0469, B:219:0x047c, B:222:0x0484, B:224:0x049d, B:168:0x035f, B:167:0x035b, B:223:0x0497, B:202:0x0416, B:205:0x041e, B:206:0x0431, B:248:0x0528, B:250:0x0530, B:252:0x053b, B:254:0x0543, B:255:0x054c, B:147:0x02d4, B:151:0x02e0, B:153:0x031f, B:154:0x0325, B:157:0x032c, B:159:0x0336, B:160:0x034a, B:162:0x0350, B:165:0x0356, B:258:0x0554), top: B:276:0x0006, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0141 A[PHI: r18 r21
  0x0141: PHI (r18v4 int) = (r18v1 int), (r18v5 int), (r18v1 int) binds: [B:44:0x0119, B:49:0x013c, B:47:0x0129] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r21v4 int) = (r21v1 int), (r21v5 int), (r21v1 int) binds: [B:44:0x0119, B:49:0x013c, B:47:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c2 A[Catch: IOException -> 0x0558, XmlPullParserException -> 0x0561, TRY_ENTER, TryCatch #7 {IOException -> 0x0558, XmlPullParserException -> 0x0561, blocks: (B:3:0x0006, B:6:0x0062, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x0084, B:16:0x0088, B:18:0x0090, B:22:0x00a4, B:23:0x00b4, B:25:0x00be, B:26:0x00c2, B:28:0x00cc, B:29:0x00d0, B:31:0x00e1, B:33:0x00f1, B:35:0x00f6, B:40:0x0104, B:43:0x0113, B:45:0x011b, B:47:0x0129, B:48:0x012f, B:49:0x013c, B:41:0x010e, B:51:0x0143, B:53:0x0149, B:55:0x0151, B:57:0x0159, B:59:0x0161, B:61:0x0169, B:63:0x0172, B:65:0x017a, B:67:0x0183, B:69:0x018c, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ac, B:79:0x01b4, B:84:0x01c2, B:171:0x036c, B:85:0x01d1, B:87:0x01d9, B:89:0x01fd, B:90:0x0209, B:121:0x027f, B:92:0x020d, B:94:0x0215, B:97:0x0220, B:99:0x0228, B:100:0x022d, B:102:0x0235, B:103:0x023a, B:105:0x0242, B:106:0x0247, B:108:0x0250, B:110:0x025a, B:111:0x025d, B:114:0x0261, B:115:0x0268, B:117:0x0270, B:119:0x0278, B:123:0x0285, B:127:0x028f, B:130:0x0295, B:135:0x029f, B:137:0x02a4, B:140:0x02ac, B:142:0x02c4, B:144:0x02c8, B:145:0x02ce, B:172:0x0375, B:174:0x0381, B:176:0x0390, B:178:0x039a, B:179:0x039d, B:182:0x03a9, B:180:0x03a0, B:183:0x03b7, B:169:0x0366, B:185:0x03bb, B:186:0x03bf, B:188:0x03c7, B:190:0x03cf, B:192:0x03d7, B:194:0x03dd, B:196:0x03e5, B:199:0x03ef, B:201:0x0403, B:208:0x0439, B:210:0x0441, B:212:0x0447, B:214:0x044f, B:227:0x04ad, B:229:0x04b5, B:231:0x04c1, B:233:0x04c9, B:236:0x04d5, B:238:0x04e1, B:239:0x04e9, B:241:0x04ed, B:247:0x050c, B:242:0x04f7, B:243:0x04ff, B:234:0x04cb, B:216:0x0453, B:218:0x0469, B:219:0x047c, B:222:0x0484, B:224:0x049d, B:168:0x035f, B:167:0x035b, B:223:0x0497, B:202:0x0416, B:205:0x041e, B:206:0x0431, B:248:0x0528, B:250:0x0530, B:252:0x053b, B:254:0x0543, B:255:0x054c, B:147:0x02d4, B:151:0x02e0, B:153:0x031f, B:154:0x0325, B:157:0x032c, B:159:0x0336, B:160:0x034a, B:162:0x0350, B:165:0x0356, B:258:0x0554), top: B:276:0x0006, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1 A[Catch: IOException -> 0x0558, XmlPullParserException -> 0x0561, TryCatch #7 {IOException -> 0x0558, XmlPullParserException -> 0x0561, blocks: (B:3:0x0006, B:6:0x0062, B:8:0x006b, B:11:0x0074, B:13:0x007a, B:15:0x0084, B:16:0x0088, B:18:0x0090, B:22:0x00a4, B:23:0x00b4, B:25:0x00be, B:26:0x00c2, B:28:0x00cc, B:29:0x00d0, B:31:0x00e1, B:33:0x00f1, B:35:0x00f6, B:40:0x0104, B:43:0x0113, B:45:0x011b, B:47:0x0129, B:48:0x012f, B:49:0x013c, B:41:0x010e, B:51:0x0143, B:53:0x0149, B:55:0x0151, B:57:0x0159, B:59:0x0161, B:61:0x0169, B:63:0x0172, B:65:0x017a, B:67:0x0183, B:69:0x018c, B:71:0x0194, B:73:0x019c, B:75:0x01a4, B:77:0x01ac, B:79:0x01b4, B:84:0x01c2, B:171:0x036c, B:85:0x01d1, B:87:0x01d9, B:89:0x01fd, B:90:0x0209, B:121:0x027f, B:92:0x020d, B:94:0x0215, B:97:0x0220, B:99:0x0228, B:100:0x022d, B:102:0x0235, B:103:0x023a, B:105:0x0242, B:106:0x0247, B:108:0x0250, B:110:0x025a, B:111:0x025d, B:114:0x0261, B:115:0x0268, B:117:0x0270, B:119:0x0278, B:123:0x0285, B:127:0x028f, B:130:0x0295, B:135:0x029f, B:137:0x02a4, B:140:0x02ac, B:142:0x02c4, B:144:0x02c8, B:145:0x02ce, B:172:0x0375, B:174:0x0381, B:176:0x0390, B:178:0x039a, B:179:0x039d, B:182:0x03a9, B:180:0x03a0, B:183:0x03b7, B:169:0x0366, B:185:0x03bb, B:186:0x03bf, B:188:0x03c7, B:190:0x03cf, B:192:0x03d7, B:194:0x03dd, B:196:0x03e5, B:199:0x03ef, B:201:0x0403, B:208:0x0439, B:210:0x0441, B:212:0x0447, B:214:0x044f, B:227:0x04ad, B:229:0x04b5, B:231:0x04c1, B:233:0x04c9, B:236:0x04d5, B:238:0x04e1, B:239:0x04e9, B:241:0x04ed, B:247:0x050c, B:242:0x04f7, B:243:0x04ff, B:234:0x04cb, B:216:0x0453, B:218:0x0469, B:219:0x047c, B:222:0x0484, B:224:0x049d, B:168:0x035f, B:167:0x035b, B:223:0x0497, B:202:0x0416, B:205:0x041e, B:206:0x0431, B:248:0x0528, B:250:0x0530, B:252:0x053b, B:254:0x0543, B:255:0x054c, B:147:0x02d4, B:151:0x02e0, B:153:0x031f, B:154:0x0325, B:157:0x032c, B:159:0x0336, B:160:0x034a, B:162:0x0350, B:165:0x0356, B:258:0x0554), top: B:276:0x0006, inners: #0, #2, #3, #4, #6 }] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [float] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.CharSequence] */
    @Override // X.InterfaceC6304E0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.E0T AXf(byte[] r36, int r37, int r38) throws org.xmlpull.v1.XmlPullParserException, androidx.media3.extractor.text.SubtitleDecoderException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6329E1e.AXf(byte[], int, int):X.E0T");
    }

    public C6329E1e() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.A00 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw BV4.A0d("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment A01(java.lang.String r1) {
        /*
            java.lang.String r1 = com.google.common.base.Ascii.toLowerCase(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto Ld;
                case 100571: goto L18;
                case 3317767: goto L1b;
                case 108511772: goto L1e;
                case 109757538: goto L29;
                default: goto Lb;
            }
        Lb:
            r0 = 0
            return r0
        Ld:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        L18:
            java.lang.String r0 = "end"
            goto L20
        L1b:
            java.lang.String r0 = "left"
            goto L2c
        L1e:
            java.lang.String r0 = "right"
        L20:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L29:
            java.lang.String r0 = "start"
        L2c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6329E1e.A01(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E1j A03(X.E1j r12, org.xmlpull.v1.XmlPullParser r13) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6329E1e.A03(X.E1j, org.xmlpull.v1.XmlPullParser):X.E1j");
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    @Override // X.InterfaceC6304E0a
    public final void AXd(InterfaceC5344Dgn interfaceC5344Dgn, E03 e03, byte[] bArr, int i, int i2) {
        E0O.A01(interfaceC5344Dgn, AXf(bArr, i, i2), e03);
    }
}

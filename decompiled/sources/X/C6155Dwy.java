package X;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: X.Dwy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6155Dwy {
    public static final Pattern A00 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<C6222DyD, List<C6153Dwv>> A01 = BV4.A0u();

    public static C6153Dwv A05(String str) {
        List<C6153Dwv> listA04 = A04(str, false, false);
        if (listA04.isEmpty()) {
            return null;
        }
        return listA04.get(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0335, code lost:
    
        if (r8.equals("04") == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0426, code lost:
    
        if (r8.equals("L30") == false) goto L290;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x057d: INVOKE (r10 I:java.lang.String), (r8 I:java.lang.String), (r4 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1405), block:B:407:0x057d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0598: INVOKE (r6v0 ?? I:java.lang.String), (r8v0 ?? I:java.lang.String), (r3 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1432), block:B:415:0x0598 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x057d: INVOKE (r10v0 ?? I:java.lang.String), (r8v0 ?? I:java.lang.String), (r4 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1405), block:B:407:0x057d */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0598: INVOKE (r6 I:java.lang.String), (r8 I:java.lang.String), (r3 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1432), block:B:415:0x0598 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A00(X.C6154Dwx r13) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6155Dwy.A00(X.Dwx):android.util.Pair");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;ZZ)Ljava/util/List<LX/Dwv;>; */
    public static ImmutableList A01(C6154Dwx c6154Dwx, InterfaceC2356BVg interfaceC2356BVg, boolean z, boolean z2) {
        List<C6153Dwv> listAEg = interfaceC2356BVg.AEg(c6154Dwx.A0b, z, z2);
        String strA03 = A03(c6154Dwx);
        List<C6153Dwv> listOf = strA03 == null ? ImmutableList.of() : interfaceC2356BVg.AEg(strA03, z, z2);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(listAEg);
        builder.addAll(listOf);
        return builder.build();
    }

    public static String A03(C6154Dwx c6154Dwx) {
        Pair<Integer, Integer> pairA00;
        String str = c6154Dwx.A0b;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(str) || (pairA00 = A00(c6154Dwx)) == null) {
            return null;
        }
        int iA08 = BV7.A08(pairA00);
        if (iA08 == 16 || iA08 == 256) {
            return "video/hevc";
        }
        if (iA08 == 512) {
            return "video/avc";
        }
        if (iA08 == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160 A[Catch: all -> 0x01b3, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0016, B:13:0x002e, B:17:0x0047, B:18:0x0050, B:21:0x005c, B:24:0x006a, B:26:0x0072, B:28:0x007a, B:63:0x00fc, B:69:0x0118, B:75:0x012b, B:77:0x0139, B:80:0x0150, B:81:0x015d, B:29:0x007d, B:31:0x0086, B:34:0x0092, B:36:0x009a, B:39:0x00a6, B:41:0x00ac, B:43:0x00b4, B:46:0x00c0, B:48:0x00c8, B:51:0x00d3, B:53:0x00db, B:56:0x00e6, B:58:0x00ee, B:68:0x0114, B:83:0x0160, B:84:0x0163, B:86:0x016f, B:89:0x0183, B:91:0x0189, B:93:0x0199, B:94:0x01a0, B:96:0x01a9, B:97:0x01b0), top: B:105:0x0003, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[Catch: all -> 0x01b3, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0016, B:13:0x002e, B:17:0x0047, B:18:0x0050, B:21:0x005c, B:24:0x006a, B:26:0x0072, B:28:0x007a, B:63:0x00fc, B:69:0x0118, B:75:0x012b, B:77:0x0139, B:80:0x0150, B:81:0x015d, B:29:0x007d, B:31:0x0086, B:34:0x0092, B:36:0x009a, B:39:0x00a6, B:41:0x00ac, B:43:0x00b4, B:46:0x00c0, B:48:0x00c8, B:51:0x00d3, B:53:0x00db, B:56:0x00e6, B:58:0x00ee, B:68:0x0114, B:83:0x0160, B:84:0x0163, B:86:0x016f, B:89:0x0183, B:91:0x0189, B:93:0x0199, B:94:0x01a0, B:96:0x01a9, B:97:0x01b0), top: B:105:0x0003, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List<X.C6153Dwv> A04(java.lang.String r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6155Dwy.A04(java.lang.String, boolean, boolean):java.util.List");
    }

    public static boolean A06(C6154Dwx c6154Dwx) {
        String str;
        return AbstractC5653Dmh.A03(EnumC5618Dlz.A0z) && C6180DxO.A03(c6154Dwx.A0S) && BV6.A1W(c6154Dwx, "video/dolby-vision") && (str = c6154Dwx.A0W) != null && str.startsWith("dav1.10.") && "video/av01".equals(A03(c6154Dwx));
    }

    public static boolean A07(C6154Dwx c6154Dwx, String str) {
        return "meta.dav1d.av1.decoder".equals(str) && c6154Dwx.A0T == null && A06(c6154Dwx);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;ZZZZ)Ljava/util/List<LX/Dwv;>; */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.common.collect.ImmutableList A02(X.C6154Dwx r21, X.InterfaceC2356BVg r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r12 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r11 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builder()
            r5 = r21
            r4 = r23
            r3 = r24
            if (r25 == 0) goto L27
            boolean r0 = A06(r5)
            if (r0 == 0) goto L27
            androidx.media3.common.DrmInitData r0 = r5.A0T
            if (r0 != 0) goto L27
            if (r23 != 0) goto L27
            r9 = 1
            if (r24 == 0) goto L28
        L27:
            r9 = 0
        L28:
            r13 = 0
            if (r9 == 0) goto Lc5
            r17 = 0
            java.lang.String r14 = "meta.dav1d.av1.decoder"
            java.lang.String r15 = "video/av01"
            r18 = 1
            r16 = r15
            r19 = r17
            r20 = r17
            r21 = r17
            X.Dwv r7 = X.C6153Dwv.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L40:
            r0 = r22
            com.google.common.collect.ImmutableList r0 = A01(r5, r0, r4, r3)
            java.util.Iterator r8 = r0.iterator()
        L4a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r6 = r8.next()
            X.Dwv r6 = (X.C6153Dwv) r6
            if (r7 == 0) goto L67
            java.lang.String r1 = "video/dolby-vision"
            java.lang.String r0 = r6.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L67
            r2.add(r7)
            r7 = r13
        L67:
            if (r23 == 0) goto L6d
            boolean r0 = r6.A0B
            if (r0 == 0) goto L4a
        L6d:
            if (r24 == 0) goto L73
            boolean r0 = r6.A0D
            if (r0 == 0) goto L4a
        L73:
            java.lang.String r1 = "meta.dav1d.av1.decoder"
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L89
            if (r9 != 0) goto L4a
            boolean r0 = A06(r5)
            if (r0 == 0) goto L89
            androidx.media3.common.DrmInitData r0 = r5.A0T
            if (r0 != 0) goto L4a
        L89:
            java.lang.String r1 = r6.A05
            boolean r0 = X.BV6.A1W(r5, r1)
            if (r0 != 0) goto L9b
            java.lang.String r0 = A03(r5)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4a
        L9b:
            r0 = 0
            boolean r0 = X.C6153Dwv.A03(r5, r6, r0)
            if (r0 == 0) goto L4a
            if (r26 == 0) goto Lae
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 == 0) goto Laf
        Lae:
            r1 = 0
        Laf:
            boolean r0 = r6.A08(r5)
            if (r0 == 0) goto Lbd
            r0 = r2
            if (r1 == 0) goto Lb9
            r0 = r12
        Lb9:
            r0.add(r6)
            goto L4a
        Lbd:
            r0 = r11
            if (r1 == 0) goto Lc1
            r0 = r10
        Lc1:
            r0.add(r6)
            goto L4a
        Lc5:
            r7 = r13
            goto L40
        Lc8:
            if (r7 == 0) goto Lcd
            r2.add(r7)
        Lcd:
            com.google.common.collect.ImmutableList r0 = r12.build()
            r2.addAll(r0)
            com.google.common.collect.ImmutableList r0 = r11.build()
            r2.addAll(r0)
            com.google.common.collect.ImmutableList r0 = r10.build()
            r2.addAll(r0)
            com.google.common.collect.ImmutableList r0 = r2.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6155Dwy.A02(X.Dwx, X.BVg, boolean, boolean, boolean, boolean):com.google.common.collect.ImmutableList");
    }
}

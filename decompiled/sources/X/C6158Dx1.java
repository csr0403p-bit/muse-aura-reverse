package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.Dx1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6158Dx1 {
    public final C5882DrI A00;
    public final C5882DrI A01;
    public final boolean A02;

    public final C6158Dx1 A04(long j, long j2) {
        C5882DrI c5882DrI = this.A00;
        C5882DrI c5882DrI2 = new C5882DrI(c5882DrI.A00, c5882DrI.A03, c5882DrI.A02, j, c5882DrI.A04, c5882DrI.A05);
        C5882DrI c5882DrI3 = this.A01;
        return new C6158Dx1(c5882DrI2, new C5882DrI(c5882DrI3.A00, c5882DrI3.A03, c5882DrI3.A02, j2, c5882DrI3.A04, c5882DrI3.A05), this.A02);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x039f, code lost:
    
        if (r9.equals("L30") == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x063c, code lost:
    
        if (r9.equals("04") == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0128, code lost:
    
        if (r9.equals("fLaC") == false) goto L73;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x01af. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x029a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0049. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:301:0x0467. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:302:0x046a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:303:0x046d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:304:0x0470. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:305:0x0473. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:328:0x04c2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:397:0x05bd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x0111. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x065f: INVOKE (r11 I:java.lang.String), (r9 I:java.lang.String), (r5 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1631), block:B:438:0x065f */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0519: INVOKE (r6v0 ?? I:java.lang.String), (r9v0 ?? I:java.lang.String), (r5 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1305), block:B:351:0x0519 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x065f: INVOKE (r11v0 ?? I:java.lang.String), (r9v0 ?? I:java.lang.String), (r5 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1631), block:B:438:0x065f */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0519: INVOKE (r6 I:java.lang.String), (r9 I:java.lang.String), (r5 I:java.lang.String) STATIC call: X.BV6.A1I(java.lang.String, java.lang.String, java.lang.String):void A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1305), block:B:351:0x0519 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04ce A[PHI: r1
  0x04ce: PHI (r1v78 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:304:0x0470, B:122:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d2 A[PHI: r1
  0x04d2: PHI (r1v68 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:301:0x0467, B:107:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04d5 A[PHI: r1
  0x04d5: PHI (r1v71 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:302:0x046a, B:113:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04d9 A[PHI: r1
  0x04d9: PHI (r1v72 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:302:0x046a, B:115:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04dd A[PHI: r1
  0x04dd: PHI (r1v73 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:302:0x046a, B:117:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04e1 A[PHI: r1
  0x04e1: PHI (r1v74 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:303:0x046d, B:119:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04e5 A[PHI: r1
  0x04e5: PHI (r1v75 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:303:0x046d, B:121:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04e9 A[PHI: r1
  0x04e9: PHI (r1v77 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:304:0x0470, B:122:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04ed A[PHI: r1
  0x04ed: PHI (r1v76 int) = (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:328:0x04c2, B:304:0x0470, B:122:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04f1 A[PHI: r1
  0x04f1: PHI (r1v17 int) = (r1v13 int), (r1v24 int) binds: [B:328:0x04c2, B:301:0x0467] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04f4 A[PHI: r1
  0x04f4: PHI (r1v18 int) = (r1v13 int), (r1v24 int) binds: [B:328:0x04c2, B:303:0x046d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04f8 A[PHI: r1
  0x04f8: PHI (r1v21 int) = (r1v13 int), (r1v24 int) binds: [B:328:0x04c2, B:305:0x0473] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04fc A[PHI: r1
  0x04fc: PHI (r1v20 int) = (r1v13 int), (r1v24 int) binds: [B:328:0x04c2, B:305:0x0473] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0501 A[PHI: r1
  0x0501: PHI (r1v19 int) = (r1v13 int), (r1v24 int) binds: [B:328:0x04c2, B:305:0x0473] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0584 A[PHI: r1
  0x0584: PHI (r1v70 int) = (r1v5 int), (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:380:0x057a, B:328:0x04c2, B:301:0x0467, B:111:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0587 A[PHI: r1
  0x0587: PHI (r1v69 int) = (r1v5 int), (r1v13 int), (r1v24 int), (r1v83 int) binds: [B:379:0x0578, B:328:0x04c2, B:301:0x0467, B:109:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x058a A[PHI: r1
  0x058a: PHI (r1v67 int) = (r1v5 int), (r1v13 int), (r1v83 int) binds: [B:376:0x0573, B:328:0x04c2, B:105:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.C6154Dwx r15) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6158Dx1.A00(X.Dwx):int");
    }

    public static long A01(C6154Dwx c6154Dwx) {
        int i;
        int i2 = c6154Dwx.A0Q;
        if (i2 <= 0 || (i = c6154Dwx.A0D) <= 0) {
            return -1L;
        }
        return i2 * i;
    }

    public C6158Dx1(C5882DrI c5882DrI, C5882DrI c5882DrI2, boolean z) {
        this.A00 = c5882DrI;
        this.A01 = c5882DrI2;
        this.A02 = z;
    }

    public static boolean A02(C6154Dwx c6154Dwx) {
        if (!A03(c6154Dwx)) {
            return false;
        }
        int iA00 = A00(c6154Dwx);
        return (iA00 == 8 || iA00 == 10) && A01(c6154Dwx) > 0;
    }

    public static boolean A03(C6154Dwx c6154Dwx) {
        if (BV6.A1W(c6154Dwx, "video/av01")) {
            return true;
        }
        String str = c6154Dwx.A0W;
        return str != null && str.startsWith("av01");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.C6154Dwx r14) {
        /*
            r13 = this;
            boolean r0 = A03(r14)
            r12 = 1
            if (r0 == 0) goto L3f
            int r2 = A00(r14)
            long r10 = A01(r14)
            r1 = 8
            if (r2 == r1) goto L17
            r0 = 10
            if (r2 != r0) goto L3f
        L17:
            r4 = 0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3f
            boolean r0 = r13.A02
            if (r0 == 0) goto L43
            if (r2 <= r1) goto L40
            X.DrI r1 = r13.A01
        L25:
            long r2 = r1.A00
            r8 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L43
            long r6 = r1.A02
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L3a
            r0 = 1
            long r2 = r2 - r0
            long r2 = java.lang.Math.max(r4, r2)
        L3a:
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            r12 = 0
        L3f:
            return r12
        L40:
            X.DrI r1 = r13.A00
            goto L25
        L43:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6158Dx1.A05(X.Dwx):boolean");
    }

    public final boolean A06(C6154Dwx c6154Dwx) {
        C5882DrI c5882DrI;
        if (!A03(c6154Dwx)) {
            return false;
        }
        int iA00 = A00(c6154Dwx);
        long jA01 = A01(c6154Dwx);
        if (iA00 > 8) {
            c5882DrI = this.A01;
            if (iA00 != 10) {
                return false;
            }
        } else {
            c5882DrI = this.A00;
            if (iA00 != 8) {
                return false;
            }
        }
        long jA07 = c5882DrI.A00;
        if (jA07 == -1) {
            jA07 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        } else if (c5882DrI.A02 == -1) {
            jA07 = BV5.A07(jA07 - 1);
        }
        return jA01 > jA07 && c5882DrI.A05;
    }
}

package X;

import android.os.Trace;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BBG implements BCN, InterfaceC2230BCa, InterfaceC1377Ai3, Ai6 {
    public int A00;
    public int A01;
    public C0918AHu<Object, Object> A02;
    public BBG A03;
    public C1373Ahz A04;
    public InterfaceC2246BCr A05;
    public G0V<? super BFM, ? super Integer, Unit> A06;
    public boolean A07;
    public final C0918AHu<Object, Object> A08;
    public final C0918AHu<Object, Object> A09;
    public final InterfaceC1370Ahw<?> A0A;
    public final AbstractC2249BCu A0B;
    public final AbstractC2249BCu A0C;
    public final BBV A0D;
    public final C2243BCo A0E;
    public final BBI A0F;
    public final ApK A0G;
    public final AlX A0H;
    public final Set<InterfaceC1559AlZ> A0J;
    public final C0918AHu<Object, Object> A0L;
    public final C0917AHt<BBb> A0M;
    public final C0917AHt<BBb> A0N;
    public final AtomicReference<Object> A0K = new AtomicReference<>(null);
    public final Object A0I = C3cG.A0T();

    /* JADX WARN: Incorrect types in method signature: (LX/BBV;LX/Ahw<*>;)V */
    public BBG(InterfaceC1370Ahw interfaceC1370Ahw, BBV bbv) {
        this.A0D = bbv;
        this.A0A = interfaceC1370Ahw;
        C0917AHt c0917AHt = new C0917AHt(6);
        Set agw = c0917AHt.A02;
        if (agw == null) {
            agw = new AGW(c0917AHt);
            c0917AHt.A02 = agw;
        }
        this.A0J = agw;
        BBW bbw = new BBW();
        if (bbv.A0W()) {
            bbw.A04 = new Ab2<>(6);
        }
        if (bbv.A0Y()) {
            bbw.A06 = new HashMap();
        }
        this.A0G = bbw;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A09 = new C0918AHu<>(6);
        this.A0N = new C0917AHt<>(6);
        this.A0M = new C0917AHt<>(6);
        this.A08 = new C0918AHu<>(6);
        this.A0B = new C2232BCc();
        this.A0C = new C2232BCc();
        this.A0L = new C0918AHu<>(6);
        this.A02 = new C0918AHu<>(6);
        this.A0E = new C2243BCo(bbv);
        this.A0H = new AlX();
        BBI bbi = new BBI(this.A0A, this.A0B, this.A0C, this.A0D, this, this.A0E, BCA.A01(this.A0G), this.A0J);
        bbv.A0M(bbi);
        this.A0F = bbi;
        this.A06 = C8kh.A01;
    }

    public static final C1373Ahz A00(BBG bbg, G0V g0v, boolean z) {
        if (bbg.A04 != null) {
            AK7.A00("A pausable composition is in progress");
            throw F60.createAndThrow();
        }
        C1373Ahz c1373Ahz = new C1373Ahz(bbg.A0A, bbg.A0D, bbg, bbg.A0F, bbg.A0I, bbg.A0J, g0v, z);
        bbg.A04 = c1373Ahz;
        return c1373Ahz;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[Catch: all -> 0x00f4, PHI: r6
  0x004c: PHI (r6v1 X.BBG) = (r6v0 X.BBG), (r6v3 X.BBG) binds: [B:5:0x000d, B:25:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000f, B:9:0x001b, B:10:0x0022, B:11:0x0023, B:13:0x0027, B:15:0x0031, B:26:0x004c, B:28:0x0052, B:32:0x005c, B:36:0x0062, B:37:0x006a, B:40:0x0070, B:41:0x0076, B:43:0x007c, B:45:0x0080, B:48:0x008c, B:50:0x00a0, B:52:0x00ab, B:54:0x00b5, B:58:0x00c3, B:62:0x00ce, B:63:0x00d1, B:66:0x00d6), top: B:80:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d6 A[Catch: all -> 0x00f4, EDGE_INSN: B:82:0x00d6->B:66:0x00d6 BREAK  A[LOOP:0: B:48:0x008c->B:62:0x00ce], EDGE_INSN: B:83:0x00d6->B:66:0x00d6 BREAK  A[LOOP:0: B:48:0x008c->B:62:0x00ce], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x000f, B:9:0x001b, B:10:0x0022, B:11:0x0023, B:13:0x0027, B:15:0x0031, B:26:0x004c, B:28:0x0052, B:32:0x005c, B:36:0x0062, B:37:0x006a, B:40:0x0070, B:41:0x0076, B:43:0x007c, B:45:0x0080, B:48:0x008c, B:50:0x00a0, B:52:0x00ab, B:54:0x00b5, B:58:0x00c3, B:62:0x00ce, B:63:0x00d1, B:66:0x00d6), top: B:80:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer A01(X.B1X r16, X.BBb r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.A01(X.B1X, X.BBb, java.lang.Object):java.lang.Integer");
    }

    @Override // X.InterfaceC2230BCa
    public final void AZi() {
        this.A07 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.A02():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0193, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:19:0x0047, B:21:0x004b, B:22:0x004d, B:25:0x005e, B:29:0x0078, B:32:0x0086, B:34:0x009b, B:37:0x00a7, B:39:0x00b1, B:41:0x00be, B:44:0x00d1, B:46:0x00e1, B:48:0x00ec, B:50:0x00f2, B:52:0x00fd, B:54:0x0101, B:57:0x010e, B:58:0x0111, B:61:0x011a, B:69:0x0139, B:71:0x013d, B:62:0x011d, B:64:0x0128, B:66:0x012c, B:72:0x0140, B:76:0x014e, B:77:0x0153, B:87:0x016f, B:88:0x0173, B:24:0x005b), top: B:103:0x0047, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(X.AbstractC2249BCu r33) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.A03(X.BCu):void");
    }

    public static final void A04(BBG bbg) {
        String strA0a;
        AtomicReference<Object> atomicReference = bbg.A0K;
        Object obj = AbstractC2247BCs.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                strA0a = "pending composition has not been applied";
            } else {
                if (andSet instanceof Set) {
                    A07(bbg, (Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        A07(bbg, set, true);
                    }
                    return;
                }
                strA0a = AnonymousClass007.A0a("corrupt pendingModifications drain: ", atomicReference);
            }
            BBL.A02(strA0a);
            throw F60.createAndThrow();
        }
    }

    public static final void A05(BBG bbg) {
        AtomicReference<Object> atomicReference = bbg.A0K;
        Object objA10 = C8j3.A10(atomicReference);
        if (C7384Etj.areEqual(objA10, AbstractC2247BCs.A00)) {
            return;
        }
        if (objA10 instanceof Set) {
            A07(bbg, (Set) objA10, false);
            return;
        }
        if (!(objA10 instanceof Object[])) {
            if (objA10 != null) {
                BBL.A02(AnonymousClass007.A0a("corrupt pendingModifications drain: ", atomicReference));
            } else if (bbg.A04 != null) {
                return;
            } else {
                BBL.A01("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
            throw F60.createAndThrow();
        }
        for (Set set : (Set[]) objA10) {
            A07(bbg, set, false);
        }
    }

    public static final void A06(BBG bbg) {
        String str;
        int i = bbg.A01;
        if (i != 0) {
            str = i != 1 ? i != 2 ? "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.";
        } else if (bbg.A04 == null) {
            return;
        } else {
            str = "A pausable composition is in progress";
        }
        AK7.A00(str);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[EDGE_INSN: B:35:0x00aa->B:171:0x005c BREAK  A[LOOP:2: B:26:0x007c->B:36:0x00ac]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121 A[EDGE_INSN: B:65:0x0121->B:215:0x00c1 BREAK  A[LOOP:13: B:56:0x00f5->B:66:0x0123]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.BBG r37, java.util.Set r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.A07(X.BBG, java.util.Set, boolean):void");
    }

    private final void A08(Object obj) {
        Integer numANt;
        Integer numANt2;
        Object objA05 = this.A09.A05(obj);
        if (objA05 == null) {
            return;
        }
        if (!(objA05 instanceof C0917AHt)) {
            BBb bBb = (BBb) objA05;
            InterfaceC2230BCa interfaceC2230BCa = bBb.A05;
            if (interfaceC2230BCa == null || (numANt = interfaceC2230BCa.ANt(bBb, obj)) == null) {
                numANt = C79.A00;
            }
            if (numANt == C79.A0K) {
                AI3.A01(this.A0L, obj, bBb);
                return;
            }
            return;
        }
        AbstractC0916AHs abstractC0916AHs = (AbstractC0916AHs) objA05;
        Object[] objArr = abstractC0916AHs.A04;
        long[] jArr = abstractC0916AHs.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        BBb bBb2 = (BBb) objArr[(i << 3) + i3];
                        InterfaceC2230BCa interfaceC2230BCa2 = bBb2.A05;
                        if (interfaceC2230BCa2 == null || (numANt2 = interfaceC2230BCa2.ANt(bBb2, obj)) == null) {
                            numANt2 = C79.A00;
                        }
                        if (numANt2 == C79.A0K) {
                            AI3.A01(this.A0L, obj, bBb2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void A09(Object obj, boolean z) {
        Integer numANt;
        Integer numANt2;
        Object objA05 = this.A09.A05(obj);
        if (objA05 == null) {
            return;
        }
        if (!(objA05 instanceof C0917AHt)) {
            BBb bBb = (BBb) objA05;
            if (AI3.A02(this.A0L, obj, bBb)) {
                return;
            }
            InterfaceC2230BCa interfaceC2230BCa = bBb.A05;
            if (interfaceC2230BCa == null || (numANt = interfaceC2230BCa.ANt(bBb, obj)) == null) {
                numANt = C79.A00;
            }
            if (numANt != C79.A00) {
                ((bBb.A03 == null || z) ? this.A0N : this.A0M).A0B(bBb);
                return;
            }
            return;
        }
        AbstractC0916AHs abstractC0916AHs = (AbstractC0916AHs) objA05;
        Object[] objArr = abstractC0916AHs.A04;
        long[] jArr = abstractC0916AHs.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if (((((-1) ^ j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - (((i - length) ^ (-1)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        BBb bBb2 = (BBb) objArr[(i << 3) + i3];
                        if (!AI3.A02(this.A0L, obj, bBb2)) {
                            InterfaceC2230BCa interfaceC2230BCa2 = bBb2.A05;
                            if (interfaceC2230BCa2 == null || (numANt2 = interfaceC2230BCa2.ANt(bBb2, obj)) == null) {
                                numANt2 = C79.A00;
                            }
                            if (numANt2 != C79.A00) {
                                ((bBb2.A03 == null || z) ? this.A0N : this.A0M).A0B(bBb2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final boolean A0A(BBG bbg) {
        boolean z;
        synchronized (bbg.A0I) {
            z = true;
            if (bbg.A01 == 1) {
                bbg.A01 = 0;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.BCN
    public final void A2q() {
        this.A0K.set(null);
        ((C2232BCc) this.A0B).A00.A00();
        ((C2232BCc) this.A0C).A00.A00();
        Set<InterfaceC1559AlZ> set = this.A0J;
        if (set.isEmpty()) {
            return;
        }
        AlX alX = this.A0H;
        try {
            alX.A05(this.A0F.A0W(), set);
            alX.A02();
        } finally {
            alX.A01();
        }
    }

    @Override // X.BCN
    public final void A4T() {
        synchronized (this.A0I) {
            try {
                A03(this.A0B);
                A05(this);
            } catch (Throwable th) {
                try {
                    Set<InterfaceC1559AlZ> set = this.A0J;
                    if (set.isEmpty()) {
                        throw th;
                    }
                    AlX alX = this.A0H;
                    try {
                        alX.A05(this.A0F.A0W(), set);
                        alX.A02();
                        alX.A01();
                        throw th;
                    } catch (Throwable th2) {
                        alX.A01();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    A2q();
                    throw th3;
                }
            }
        }
    }

    @Override // X.BCN
    public final void A4W() {
        synchronized (this.A0I) {
            try {
                AbstractC2249BCu abstractC2249BCu = this.A0C;
                if (((C2232BCc) abstractC2249BCu).A00.A02 != 0) {
                    A03(abstractC2249BCu);
                }
            } catch (Throwable th) {
                try {
                    Set<InterfaceC1559AlZ> set = this.A0J;
                    if (set.isEmpty()) {
                        throw th;
                    }
                    AlX alX = this.A0H;
                    try {
                        alX.A05(this.A0F.A0W(), set);
                        alX.A02();
                        alX.A01();
                        throw th;
                    } catch (Throwable th2) {
                        alX.A01();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    A2q();
                    throw th3;
                }
            }
        }
    }

    @Override // X.BCN
    public final void A68() {
        AlX alX;
        synchronized (this.A0I) {
            try {
                BBI bbi = this.A0F;
                bbi.A08 = null;
                Set<InterfaceC1559AlZ> set = this.A0J;
                if (!set.isEmpty()) {
                    alX = this.A0H;
                    try {
                        alX.A05(bbi.A0W(), set);
                        alX.A02();
                    } finally {
                        alX.A01();
                    }
                }
            } catch (Throwable th) {
                try {
                    Set<InterfaceC1559AlZ> set2 = this.A0J;
                    if (set2.isEmpty()) {
                        throw th;
                    }
                    alX = this.A0H;
                    try {
                        alX.A05(this.A0F.A0W(), set2);
                        alX.A02();
                        throw th;
                    } finally {
                        alX.A01();
                    }
                } catch (Throwable th2) {
                    A2q();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    @Override // X.InterfaceC2230BCa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer ANt(X.BBb r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r3 = r5.A01
            r1 = r3 & 2
            r0 = 0
            if (r1 == 0) goto L8
            r0 = 1
        L8:
            r2 = 1
            if (r0 == 0) goto Lf
            r0 = r3 | 4
            r5.A01 = r0
        Lf:
            X.B1X r3 = r5.A04
            if (r3 == 0) goto L5d
            r0 = r3
            X.BCR r0 = (X.BCR) r0
            int r1 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            if (r0 == 0) goto L5d
            X.ApK r1 = r4.A0G
            X.BBW r1 = (X.BBW) r1
            X.BCR r0 = X.BCV.A00(r3)
            boolean r1 = r1.A04(r0)
            r0 = 0
            if (r1 != r2) goto L30
            r0 = 1
        L30:
            if (r0 != 0) goto L50
            java.lang.Object r1 = r4.A0I
            monitor-enter(r1)
            X.BBG r0 = r4.A03     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)
            if (r0 == 0) goto L5d
            X.BBI r1 = r0.A0F
            boolean r0 = r1.A0N
            if (r0 == 0) goto L47
            boolean r1 = r1.A0a(r5, r6)
            r0 = 1
            if (r1 != 0) goto L48
        L47:
            r0 = 0
        L48:
            if (r0 != r2) goto L5d
            java.lang.Integer r0 = X.C79.A0K
            return r0
        L4d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L50:
            X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r1 = r5.A06
            r0 = 0
            if (r1 == 0) goto L56
            r0 = 1
        L56:
            if (r0 == 0) goto L5d
            java.lang.Integer r0 = r4.A01(r3, r5, r6)
            return r0
        L5d:
            java.lang.Integer r0 = X.C79.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.ANt(X.BBb, java.lang.Object):java.lang.Integer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BCN
    public final void AZm(Set<? extends Object> set) {
        AtomicReference<Object> atomicReference;
        Object obj;
        Set<? extends Object> set2;
        do {
            atomicReference = this.A0K;
            obj = atomicReference.get();
            if (obj == null || obj.equals(AbstractC2247BCs.A00)) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{(Set) obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw C3cG.A0Q(AnonymousClass007.A0a("corrupt pendingModifications: ", atomicReference));
                }
                Object[] objArr = (Object[]) obj;
                C7384Etj.A0Y(objArr, 0);
                int length = objArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
                objArrCopyOf[length] = set;
                set2 = objArrCopyOf;
            }
        } while (!Bs8.A00(obj, set2, atomicReference));
        if (obj == null) {
            synchronized (this.A0I) {
                A05(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    @Override // X.BCN, X.InterfaceC2230BCa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZo(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.AZo(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // X.BCN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZq(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.Object r11 = r15.A0I
            monitor-enter(r11)
            r1 = r16
            r15.A08(r1)     // Catch: java.lang.Throwable -> L64
            X.AHu<java.lang.Object, java.lang.Object> r0 = r15.A08     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r0.A05(r1)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L62
            boolean r0 = r1 instanceof X.C0917AHt     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5d
            X.AHt r1 = (X.C0917AHt) r1     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r12 = r1.A04     // Catch: java.lang.Throwable -> L64
            long[] r10 = r1.A03     // Catch: java.lang.Throwable -> L64
            int r0 = r10.length     // Catch: java.lang.Throwable -> L64
            int r9 = r0 + (-2)
            if (r9 < 0) goto L62
            r8 = 0
        L20:
            r13 = r10[r8]     // Catch: java.lang.Throwable -> L64
            r3 = -1
            long r3 = r3 ^ r13
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r13
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L3d:
            if (r5 >= r6) goto L56
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r12[r0]     // Catch: java.lang.Throwable -> L64
            X.BCS r0 = (X.BCS) r0     // Catch: java.lang.Throwable -> L64
            r15.A08(r0)     // Catch: java.lang.Throwable -> L64
        L52:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L3d
        L56:
            if (r6 != r7) goto L62
        L58:
            if (r8 == r9) goto L62
            int r8 = r8 + 1
            goto L20
        L5d:
            X.BCS r1 = (X.BCS) r1     // Catch: java.lang.Throwable -> L64
            r15.A08(r1)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r11)
            return
        L64:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.AZq(java.lang.Object):void");
    }

    @Override // X.InterfaceC1377Ai3
    public final void deactivate() {
        AlX alX;
        synchronized (this.A0I) {
            if (this.A04 != null) {
                AK7.A00("Deactivate is not supported while pausable composition is in progress");
                throw F60.createAndThrow();
            }
            BBW bbw = (BBW) this.A0G;
            boolean z = false;
            try {
                try {
                    if (bbw.A00 == 0) {
                        z = true;
                        if (!this.A0J.isEmpty()) {
                        }
                        this.A09.A0D();
                        this.A08.A0D();
                        this.A02.A0D();
                        ((C2232BCc) this.A0B).A00.A00();
                        ((C2232BCc) this.A0C).A00.A00();
                        BBI bbi = this.A0F;
                        bbi.A0c.clear();
                        bbi.A0e.clear();
                        ((C2232BCc) bbi.A09).A00.A00();
                        bbi.A08 = null;
                        this.A01 = 1;
                    }
                    alX.A05(this.A0F.A0W(), this.A0J);
                    if (!z) {
                        InterfaceC1370Ahw<?> interfaceC1370Ahw = this.A0A;
                        BBJ bbjA02 = bbw.A02();
                        try {
                            bbjA02.A0Y(bbjA02.A00, new BTC(13, alX, bbjA02));
                            bbjA02.A0c(true);
                            interfaceC1370Ahw.ASy();
                            alX.A03();
                        } catch (Throwable th) {
                            bbjA02.A0c(false);
                            throw th;
                        }
                    }
                    alX.A02();
                    alX.A01();
                    Trace.endSection();
                    this.A09.A0D();
                    this.A08.A0D();
                    this.A02.A0D();
                    ((C2232BCc) this.A0B).A00.A00();
                    ((C2232BCc) this.A0C).A00.A00();
                    BBI bbi2 = this.A0F;
                    bbi2.A0c.clear();
                    bbi2.A0e.clear();
                    ((C2232BCc) bbi2.A09).A00.A00();
                    bbi2.A08 = null;
                    this.A01 = 1;
                } catch (Throwable th2) {
                    alX.A01();
                    throw th2;
                }
                alX = this.A0H;
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
            Trace.beginSection("Compose:deactivate");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8.A0J.isEmpty() == false) goto L17;
     */
    @Override // X.BMy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispose() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBG.dispose():void");
    }

    @Override // X.BMy
    public final void Ad8(G0V<? super BFM, ? super Integer, Unit> g0v) {
        boolean zA0A = A0A(this);
        A06(this);
        if (!zA0A) {
            this.A06 = g0v;
            this.A0D.A0U(this, g0v);
            return;
        }
        BBI bbi = this.A0F;
        bbi.A05 = 0;
        bbi.A0Q = true;
        this.A06 = g0v;
        this.A0D.A0U(this, g0v);
        bbi.A0Y();
    }
}

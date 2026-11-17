package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BBO {
    public AOY A00;
    public BBS A01;
    public boolean A02;
    public boolean A03;
    public final G0U<Function0<Unit>, Unit> A08;
    public final AtomicReference<Object> A07 = new AtomicReference<>(null);
    public final G0V<Set<? extends Object>, Snapshot, Unit> A09 = new C2296BSw(this, 18);
    public final G0U<Object, Unit> A0A = C2297BSx.A00(this, 35);
    public final C0910AHm<BBS> A05 = C0910AHm.A01(new BBS[16]);
    public final Object A06 = C3cG.A0T();
    public long A04 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0538, code lost:
    
        return r29;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0201 A[PHI: r34
  0x0201: PHI (r34v43 boolean) = (r34v42 boolean), (r34v44 boolean) binds: [B:100:0x01dd, B:107:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025d A[EDGE_INSN: B:129:0x025d->B:321:0x0267 BREAK  A[LOOP:10: B:120:0x022d->B:130:0x025f], PHI: r34
  0x025d: PHI (r34v36 boolean) = (r34v35 boolean), (r34v37 boolean) binds: [B:121:0x0239, B:128:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026f A[PHI: r34
  0x026f: PHI (r34v30 boolean) = (r34v29 boolean), (r34v31 boolean) binds: [B:28:0x0090, B:133:0x026d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0354 A[EDGE_INSN: B:183:0x0354->B:374:0x0365 BREAK  A[LOOP:18: B:173:0x0320->B:184:0x0356], PHI: r34
  0x0354: PHI (r34v23 boolean) = (r34v22 boolean), (r34v24 boolean) binds: [B:174:0x032c, B:182:0x0352] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0371 A[PHI: r34
  0x0371: PHI (r34v18 boolean) = (r34v17 boolean), (r34v19 boolean) binds: [B:156:0x02cd, B:190:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03de A[PHI: r34
  0x03de: PHI (r34v13 boolean) = (r34v12 boolean), (r34v14 boolean) binds: [B:206:0x03b7, B:214:0x03dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x043c A[EDGE_INSN: B:237:0x043c->B:365:0x027d BREAK  A[LOOP:22: B:227:0x040a->B:238:0x043e], PHI: r34
  0x043c: PHI (r34v5 boolean) = (r34v4 boolean), (r34v6 boolean) binds: [B:228:0x0415, B:236:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ca A[EDGE_INSN: B:266:0x04ca->B:348:0x04e3 BREAK  A[LOOP:13: B:253:0x0487->B:267:0x04cc]] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d A[EDGE_INSN: B:78:0x017d->B:330:0x018e BREAK  A[LOOP:6: B:69:0x014d->B:79:0x017f], PHI: r34
  0x017d: PHI (r34v53 boolean) = (r34v52 boolean), (r34v54 boolean) binds: [B:70:0x0159, B:77:0x017b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196 A[PHI: r34
  0x0196: PHI (r34v48 boolean) = (r34v47 boolean), (r34v49 boolean) binds: [B:51:0x00f7, B:84:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.BBO r53) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBO.A00(X.BBO):boolean");
    }

    public final void A01() {
        synchronized (this.A06) {
            C0910AHm<BBS> c0910AHm = this.A05;
            BBS[] bbsArr = c0910AHm.A01;
            int i = c0910AHm.A00;
            for (int i2 = 0; i2 < i; i2++) {
                BBS bbs = bbsArr[i2];
                bbs.A07.A0D();
                bbs.A06.A0D();
                bbs.A05.A0D();
                bbs.A0B.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r8 = r0.A06
            monitor-enter(r8)
            X.AHm<X.BBS> r9 = r0.A05     // Catch: java.lang.Throwable -> L83
            int r7 = r9.A00     // Catch: java.lang.Throwable -> L83
            r11 = 0
            r20 = 0
        Lc:
            if (r11 >= r7) goto L78
            T[] r0 = r9.A01     // Catch: java.lang.Throwable -> L83
            r12 = r0[r11]     // Catch: java.lang.Throwable -> L83
            X.BBS r12 = (X.BBS) r12     // Catch: java.lang.Throwable -> L83
            X.AHu<java.lang.Object, X.AeA<java.lang.Object>> r0 = r12.A06     // Catch: java.lang.Throwable -> L83
            r13 = r21
            java.lang.Object r0 = r0.A0B(r13)     // Catch: java.lang.Throwable -> L83
            X.AeA r0 = (X.AeA) r0     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L62
            java.lang.Object[] r10 = r0.A04     // Catch: java.lang.Throwable -> L83
            long[] r6 = r0.A03     // Catch: java.lang.Throwable -> L83
            int r0 = r6.length     // Catch: java.lang.Throwable -> L83
            int r5 = r0 + (-2)
            if (r5 < 0) goto L62
            r4 = 0
        L2a:
            r18 = r6[r4]     // Catch: java.lang.Throwable -> L83
            long r14 = X.C8j5.A0A(r18)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = X.C8j3.A0E(r4, r5)
            r3 = 8
            int r2 = 8 - r0
            r1 = 0
        L43:
            if (r1 >= r2) goto L5b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r14 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L56
            java.lang.Object r0 = X.C8j3.A11(r10, r4, r1)     // Catch: java.lang.Throwable -> L83
            X.BBS.A01(r12, r13, r0)     // Catch: java.lang.Throwable -> L83
        L56:
            long r18 = r18 >> r3
            int r1 = r1 + 1
            goto L43
        L5b:
            if (r2 != r3) goto L62
        L5d:
            if (r4 == r5) goto L62
            int r4 = r4 + 1
            goto L2a
        L62:
            X.AHu<java.lang.Object, X.AeA<java.lang.Object>> r0 = r12.A06     // Catch: java.lang.Throwable -> L83
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L73
            if (r20 <= 0) goto L75
            T[] r2 = r9.A01     // Catch: java.lang.Throwable -> L83
            int r1 = r11 - r20
            r0 = r2[r11]     // Catch: java.lang.Throwable -> L83
            r2[r1] = r0     // Catch: java.lang.Throwable -> L83
            goto L75
        L73:
            int r20 = r20 + 1
        L75:
            int r11 = r11 + 1
            goto Lc
        L78:
            T[] r1 = r9.A01     // Catch: java.lang.Throwable -> L83
            int r0 = r7 - r20
            X.AbstractC0903AHf.A04(r1, r0, r7)     // Catch: java.lang.Throwable -> L83
            r9.A00 = r0     // Catch: java.lang.Throwable -> L83
            monitor-exit(r8)
            return
        L83:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBO.A02(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BBO(G0U<? super Function0<Unit>, Unit> g0u) {
        this.A08 = g0u;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(TT;LX/G0U<-TT;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(java.lang.Object r28, kotlin.jvm.functions.Function0 r29, X.G0U r30) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBO.A03(java.lang.Object, kotlin.jvm.functions.Function0, X.G0U):void");
    }
}

package X;

/* renamed from: X.31t, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C31t {
    public static final C1003AOr<Integer> A00;
    public static final C1003AOr<Float> A01 = new C1003AOr<>(null, 1.0f, 1500.0f);
    public static final C1003AOr<C1DG> A02 = new C1003AOr<>(new C1DG(0.4f), 1.0f, 1500.0f);
    public static final C1003AOr<C2ae> A03;
    public static final C1003AOr<BL4> A04;
    public static final C1003AOr<AWx> A05;
    public static final C1003AOr<AaC> A06;
    public static final C1003AOr<AWA> A07;

    static {
        long jA0N = AnonymousClass003.A0N(Float.floatToRawIntBits(1.0f));
        A07 = new C1003AOr<>(new AWA(jA0N), 1.0f, 1500.0f);
        A05 = new C1003AOr<>(new AWx(jA0N), 1.0f, 1500.0f);
        A06 = new C1003AOr<>(AbstractC1005AOw.A00, 1.0f, 1500.0f);
        A00 = new C1003AOr<>(1, 1.0f, 1500.0f);
        long j = 1 | (1 << 32);
        A03 = new C1003AOr<>(new C2ae(j), 1.0f, 1500.0f);
        A04 = new C1003AOr<>(new BL4(j), 1.0f, 1500.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1BO A00(X.AOc r10, X.C31w r11, X.BFM r12, java.lang.Object r13, X.G0U r14, int r15) {
        /*
            r9 = 0
            java.lang.Object r2 = r12.AaT()
            java.lang.Object r1 = X.C78N.A00
            if (r2 != r1) goto Ld
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.AnonymousClass004.A11(r12, r9)
        Ld:
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            java.lang.Object r6 = r12.AaT()
            if (r6 != r1) goto L1d
            X.AT5 r6 = new X.AT5
            r6.<init>(r11, r13, r9)
            r12.Ai0(r6)
        L1d:
            X.AT5 r6 = (X.AT5) r6
            androidx.compose.runtime.MutableState r8 = X.C1er.A00(r12, r14)
            androidx.compose.runtime.MutableState r7 = X.C1er.A00(r12, r10)
            java.lang.Object r10 = r12.AaT()
            if (r10 != r1) goto L37
            r3 = -1
            java.lang.Integer r0 = X.C79.A00
            X.GCV r10 = X.AbstractC10623Hzj.A00(r0, r3)
            r12.Ai0(r10)
        L37:
            X.HzR r10 = (X.HzR) r10
            boolean r5 = r12.A67(r10)
            r0 = r15 & 14
            r0 = r0 ^ 6
            r4 = 4
            if (r0 <= r4) goto L4a
            boolean r0 = r12.A67(r13)
            if (r0 != 0) goto L4f
        L4a:
            r3 = r15 & 6
            r0 = 0
            if (r3 != r4) goto L50
        L4f:
            r0 = 1
        L50:
            r0 = r0 | r5
            java.lang.Object r3 = r12.AaT()
            if (r0 != 0) goto L59
            if (r3 != r1) goto L62
        L59:
            r0 = 0
            X.3bX r3 = new X.3bX
            r3.<init>(r0, r13, r10)
            r12.Ai0(r3)
        L62:
            X.AnonymousClass001.A15(r12, r3)
            boolean r0 = r12.A67(r10)
            boolean r0 = X.AnonymousClass005.A1W(r12, r6, r7, r8, r0)
            java.lang.Object r5 = r12.AaT()
            if (r0 != 0) goto L75
            if (r5 != r1) goto L7d
        L75:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r5 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            r5.<init>(r6, r7, r8, r9, r10)
            r12.Ai0(r5)
        L7d:
            X.AnonymousClass001.A18(r12, r5, r10)
            java.lang.Object r0 = r2.getValue()
            X.1BO r0 = (X.C1BO) r0
            if (r0 != 0) goto L8a
            X.AT7<T, V extends X.AOd> r0 = r6.A04
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31t.A00(X.AOc, X.31w, X.BFM, java.lang.Object, X.G0U, int):X.1BO");
    }

    public static final C1BO A01(AOc aOc, BFM bfm, float f, int i, int i2) {
        AOc aOc2 = aOc;
        if ((i2 & 2) != 0) {
            aOc2 = A01;
        }
        if (aOc2 == A01) {
            bfm.AgE(1144115775);
            boolean z = bfm.A62(0.01f);
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0Q(Float.valueOf(0.01f));
                bfm.Ai0(objAaT);
            }
            aOc2 = (C1003AOr) objAaT;
            AnonymousClass001.A1V(bfm);
        } else {
            AnonymousClass004.A1P(bfm, 1144225701);
        }
        return A00(aOc2, AVd.A02, bfm, Float.valueOf(f), null, AnonymousClass001.A0A(i << 3, i & 14));
    }

    public static final C1BO A02(AOc aOc, BFM bfm, G0U g0u, float f, int i, int i2) {
        AOc aOc2 = aOc;
        G0U g0u2 = g0u;
        if ((i2 & 2) != 0) {
            aOc2 = A02;
        }
        if ((i2 & 8) != 0) {
            g0u2 = null;
        }
        return A00(aOc2, AVd.A01, bfm, new C1DG(f), g0u2, AnonymousClass001.A0A(i << 6, (i << 3) & 896));
    }
}

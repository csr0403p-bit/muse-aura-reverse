package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AgA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1265AgA extends AbstractC1439Aj8 implements InterfaceC1407Aic, InterfaceC1286AgW, C1Z2 {
    public C3MW A01;
    public EnumC1108AYu A02;
    public Function0<AaC> A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final ScrollingLogic A08;
    public final C1270AgF A07 = new C1270AgF();
    public long A00 = AbstractC1288AgY.A00;

    public static final void A02(C1265AgA c1265AgA, long j) {
        C3MW c3mw = c1265AgA.A01;
        if (c3mw == null) {
            c3mw = (C3MW) ARZ.A01(AbstractC1280AgQ.A01, c1265AgA);
        }
        if (c1265AgA.A04) {
            throw C3cG.A0Q("launchAnimation called when previous animation was running");
        }
        if (c1265AgA.A01 == null) {
            ARZ.A01(AbstractC1280AgQ.A01, c1265AgA);
        }
        UpdatableAnimationState updatableAnimationState = new UpdatableAnimationState(C3MX.A00);
        C8j3.A1I(C79.A0K, new BUH(c3mw, c1265AgA, updatableAnimationState, (HtJ) null, j), c1265AgA.getCoroutineScope());
    }

    @Override // X.InterfaceC1407Aic
    public final void AVH(long j) {
        int i;
        long j2;
        long j3;
        long j4 = this.A00;
        long j5 = AbstractC1288AgY.A00;
        if (j4 == j5) {
            j4 = 0;
        }
        this.A00 = j;
        EnumC1108AYu enumC1108AYu = this.A02;
        int iOrdinal = enumC1108AYu.ordinal();
        if (iOrdinal == 0) {
            i = (int) (j & 4294967295L);
            j2 = j4 & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            i = (int) (j >> 32);
            j2 = j4 >> 32;
        }
        if (C7384Etj.A00(i, (int) j2) < 0) {
            if (this.A05) {
                j3 = 0;
            } else if (enumC1108AYu == EnumC1108AYu.A03) {
                j3 = (0 << 32) | ((((int) (j4 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
            } else {
                j3 = (((int) (j4 >> 32)) - ((int) (j >> 32))) << 32;
            }
            AaC aaCInvoke = this.A03.invoke();
            if (aaCInvoke == null || this.A04 || this.A06 || !A03(this, aaCInvoke, j4, 0L)) {
                return;
            }
            long j6 = this.A00;
            if (j6 == j5) {
                j6 = 0;
            }
            if (A03(this, aaCInvoke, j6, j3)) {
                return;
            }
            this.A06 = true;
            A02(this, j3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r12 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(X.C3MW r13, X.C1265AgA r14, long r15) {
        /*
            long r4 = r14.A00
            X.AgF r0 = r14.A07
            X.AHm<X.AgR> r1 = r0.A00
            int r0 = r1.A00
            int r8 = r0 + (-1)
            T[] r7 = r1.A01
            int r0 = r7.length
            r12 = 0
            if (r8 >= r0) goto L68
        L10:
            if (r8 < 0) goto L65
            r0 = r7[r8]
            X.AgR r0 = (X.C1281AgR) r0
            kotlin.jvm.functions.Function0<X.AaC> r0 = r0.A00
            java.lang.Object r6 = r0.invoke()
            X.AaC r6 = (X.AaC) r6
            if (r6 == 0) goto L50
            long r2 = r6.A01()
            long r0 = r14.A00
            long r10 = X.AbstractC1288AgY.A00
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L2e
            r0 = 0
        L2e:
            long r9 = X.AQY.A01(r0)
            X.AYu r0 = r14.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L53
            r0 = 1
            if (r1 != r0) goto L5e
            r0 = 32
            float r2 = X.AnonymousClass001.A00(r2)
            long r9 = r9 >> r0
        L45:
            float r0 = X.C8j3.A05(r9)
            int r0 = java.lang.Float.compare(r2, r0)
            if (r0 > 0) goto L63
            r12 = r6
        L50:
            int r8 = r8 + (-1)
            goto L10
        L53:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r2 = X.AnonymousClass001.A01(r2, r0)
            long r9 = r9 & r0
            goto L45
        L5e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L63:
            if (r12 == 0) goto L78
        L65:
            r6 = r12
            if (r12 != 0) goto L78
        L68:
            boolean r0 = r14.A06
            if (r0 == 0) goto L76
            kotlin.jvm.functions.Function0<X.AaC> r0 = r14.A03
            java.lang.Object r6 = r0.invoke()
            X.AaC r6 = (X.AaC) r6
            if (r6 != 0) goto L78
        L76:
            r0 = 0
            return r0
        L78:
            long r7 = X.AQY.A01(r4)
            X.AYu r0 = r14.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L9e
            r0 = 1
            if (r1 != r0) goto Lb1
            float r4 = r6.A01
            r1 = 32
            long r15 = r15 >> r1
            int r0 = (int) r15
            float r0 = (float) r0
            float r3 = r4 - r0
            float r2 = r6.A02
            float r2 = r2 - r4
            long r7 = r7 >> r1
        L95:
            float r0 = X.C8j3.A05(r7)
            float r0 = r13.calculateScrollDistance(r3, r2, r0)
            return r0
        L9e:
            float r1 = r6.A03
            int r0 = X.AnonymousClass002.A09(r15)
            float r0 = (float) r0
            float r3 = r1 - r0
            float r2 = r6.A00
            float r2 = r2 - r1
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r0
            goto L95
        Lb1:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1265AgA.A00(X.3MW, X.AgA, long):float");
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AYu;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLX/3MW;Lkotlin/jvm/functions/Function0<LX/AaC;>;)V */
    public C1265AgA(C3MW c3mw, EnumC1108AYu enumC1108AYu, ScrollingLogic scrollingLogic, Function0 function0, boolean z) {
        this.A02 = enumC1108AYu;
        this.A08 = scrollingLogic;
        this.A05 = z;
        this.A01 = c3mw;
        this.A03 = function0;
    }

    public static final long A01(C1265AgA c1265AgA, AaC aaC, long j, long j2) {
        long jA0P;
        long jA0P2;
        long jA01 = AQY.A01(j);
        int iOrdinal = c1265AgA.A02.ordinal();
        if (iOrdinal == 0) {
            C3MW c3mw = c1265AgA.A01;
            if (c3mw == null) {
                c3mw = (C3MW) ARZ.A01(AbstractC1280AgQ.A01, c1265AgA);
            }
            float f = aaC.A03;
            float fCalculateScrollDistance = c3mw.calculateScrollDistance(f - AnonymousClass002.A09(j2), aaC.A00 - f, AnonymousClass001.A01(jA01, 4294967295L));
            jA0P = C8j3.A0P(0.0f);
            jA0P2 = C8j3.A0P(fCalculateScrollDistance);
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            C3MW c3mw2 = c1265AgA.A01;
            if (c3mw2 == null) {
                c3mw2 = (C3MW) ARZ.A01(AbstractC1280AgQ.A01, c1265AgA);
            }
            float f2 = aaC.A01;
            jA0P = C8j3.A0P(c3mw2.calculateScrollDistance(f2 - ((int) (j2 >> 32)), aaC.A02 - f2, AnonymousClass001.A00(jA01)));
            jA0P2 = C8j3.A0P(0.0f);
        }
        return (jA0P << 32) | (jA0P2 & 4294967295L);
    }

    public static final boolean A03(C1265AgA c1265AgA, AaC aaC, long j, long j2) {
        long jA01 = A01(c1265AgA, aaC, j, j2);
        return Math.abs(AnonymousClass003.A03(jA01)) <= 0.5f && Math.abs(AnonymousClass004.A00(jA01)) <= 0.5f;
    }
}

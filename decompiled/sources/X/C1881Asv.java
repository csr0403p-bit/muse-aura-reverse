package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Asv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1881Asv {
    public C1892AtB A00;
    public G0V<? super AXN, ? super Function0<C1958Aux>, Unit> A01;
    public final InterfaceC1866Asg A02;
    public final C1892AtB A03;
    public final MutableState A04;
    public final MutableState A05;
    public final MutableState A06;
    public final MutableState A07;

    public static InterfaceC1497Ak4 A00(C1881Asv c1881Asv) {
        return (InterfaceC1497Ak4) c1881Asv.A07.getValue();
    }

    public static C1958Aux A01(C1881Asv c1881Asv) {
        return (C1958Aux) c1881Asv.A03.getValue();
    }

    public C1881Asv() {
        C1892AtB c1892AtB = new C1892AtB();
        this.A00 = c1892AtB;
        this.A03 = c1892AtB;
        AGG agg = AGG.A00;
        this.A07 = C3cG.A08(agg, null);
        this.A04 = C3cG.A08(agg, null);
        this.A05 = C3cG.A08(agg, null);
        this.A06 = AbstractC1798ArH.A06(C1DG.A03());
        this.A02 = new BringIntoViewRequesterImpl();
    }

    public final int A02(long j, boolean z) {
        C1958Aux c1958AuxA01 = A01(this);
        if (c1958AuxA01 == null) {
            return -1;
        }
        if (z) {
            j = A03(j);
        }
        return c1958AuxA01.A03.A0B(AbstractC1882Asw.A00(this, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A03(long r4) {
        /*
            r3 = this;
            X.Ak4 r2 = A00(r3)
            if (r2 == 0) goto L1d
            boolean r0 = r2.isAttached()
            if (r0 == 0) goto L24
            androidx.compose.runtime.MutableState r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            X.Ak4 r1 = (X.InterfaceC1497Ak4) r1
            if (r1 == 0) goto L1d
            r0 = 1
            X.AaC r0 = r1.APk(r2, r0)
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            X.AaC r0 = X.AaC.A04
        L1f:
            long r0 = X.AbstractC1882Asw.A01(r0, r4)
            return r0
        L24:
            X.AaC r0 = X.AaC.A04
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1881Asv.A03(long):long");
    }

    public final boolean A04(long j) {
        C1958Aux c1958AuxA01 = A01(this);
        if (c1958AuxA01 == null) {
            return false;
        }
        long jA00 = AbstractC1882Asw.A00(this, A03(j));
        int iA08 = c1958AuxA01.A03.A08(C8j5.A03(jA00));
        float fA03 = AnonymousClass003.A03(jA00);
        return fA03 >= c1958AuxA01.A00(iA08) && fA03 <= c1958AuxA01.A01(iA08);
    }
}

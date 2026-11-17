package X;

import androidx.compose.runtime.MutableState;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BBM extends BBV {
    public Set<Set<InterfaceC1656Anf>> A00;
    public final C0917AHt<BBI> A01 = C0917AHt.A02();
    public final MutableState A02 = C3cG.A08(AG5.A00, C0967AJu.A00);
    public final long A03;
    public final C2243BCo A04;
    public final boolean A05;
    public final boolean A06;
    public final /* synthetic */ BBI A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:long), (r2 I:X.BBM) (LINE:5) X.BBM.A03 long, block:B:2:0x0000 */
    public BBM(C2243BCo c2243BCo, long j, boolean z, boolean z2, C2243BCo c2243BCo2) {
        long j2;
        this.A07 = j;
        this.A03 = j2;
        this.A05 = z2;
        this.A06 = c2243BCo2;
        this.A04 = c2243BCo;
    }

    @Override // X.BBV
    public final AKQ A0I() {
        return (AKQ) this.A02.getValue();
    }

    @Override // X.BBV
    public final void A0J() {
        BBI bbi = this.A07;
        bbi.A00--;
    }

    @Override // X.BBV
    public final void A0K() {
        this.A07.A00++;
    }

    @Override // X.BBV
    public final void A0M(BFM bfm) {
        this.A01.A0B(bfm);
    }

    @Override // X.BBV
    public final long A0S() {
        return this.A03;
    }

    @Override // X.BBV
    public final C78T A0T() {
        return this.A07.A0W.A0T();
    }

    @Override // X.BBV
    public final void A0U(BCN bcn, G0V<? super BFM, ? super Integer, Unit> g0v) {
        this.A07.A0W.A0U(bcn, g0v);
    }

    @Override // X.BBV
    public final boolean A0W() {
        return this.A07.A0W.A0W();
    }

    @Override // X.BBV
    public final boolean A0X() {
        return this.A05;
    }

    @Override // X.BBV
    public final boolean A0Y() {
        return this.A06;
    }

    @Override // X.BBV
    public final boolean A0Z() {
        return this.A07.A0W.A0Z();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a() {
        /*
            r15 = this;
            X.AHt<X.BBI> r12 = r15.A01
            int r0 = r12.A01
            if (r0 == 0) goto L72
            java.util.Set<java.util.Set<X.Anf>> r13 = r15.A00
            if (r13 == 0) goto L6f
            java.lang.Object[] r11 = r12.A04
            long[] r10 = r12.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L6f
            r8 = 0
        L14:
            r14 = r10[r8]
            r3 = -1
            long r3 = r3 ^ r14
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r14
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L31:
            if (r5 >= r6) goto L68
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r0 = r8 << 3
            int r0 = r0 + r5
            r4 = r11[r0]
            X.BBI r4 = (X.BBI) r4
            java.util.Iterator r3 = r13.iterator()
        L47:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r2 = r3.next()
            java.util.Set r2 = (java.util.Set) r2
            X.Anf r1 = r4.A0K
            if (r1 != 0) goto L60
            X.BBG r0 = r4.A0X
            X.Amb r1 = new X.Amb
            r1.<init>(r0)
            r4.A0K = r1
        L60:
            r2.remove(r1)
            goto L47
        L64:
            long r14 = r14 >> r7
            int r5 = r5 + 1
            goto L31
        L68:
            if (r6 != r7) goto L6f
        L6a:
            if (r8 == r9) goto L6f
            int r8 = r8 + 1
            goto L14
        L6f:
            r12.A06()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBM.A0a():void");
    }
}

package X;

import android.graphics.Path;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class B0n {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2172B0l A00(X.BFM r12, X.B0q r13) {
        /*
            X.AKH<X.AXN> r0 = X.Am0.A04
            r6 = r12
            X.BBI r6 = (X.BBI) r6
            X.AXN r4 = X.AKO.A04(r0, r6)
            int r0 = r13.A04
            float r1 = (float) r0
            float r0 = r4.AEm()
            long r7 = X.C8j3.A0P(r1)
            long r2 = X.C8j3.A0P(r0)
            r0 = 32
            long r7 = r7 << r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            long r2 = r2 | r7
            boolean r2 = r12.A64(r2)
            java.lang.Object r7 = r12.AaT()
            if (r2 != 0) goto L30
            java.lang.Object r2 = X.C78N.A00
            if (r7 != r2) goto L99
        L30:
            X.B0k r8 = new X.B0k
            r8.<init>()
            X.B0o r2 = r13.A07
            A01(r8, r2)
            float r3 = r13.A01
            float r2 = r13.A00
            float r3 = r4.Ah4(r3)
            float r2 = r4.Ah4(r2)
            long r4 = X.AnonymousClass005.A0L(r3, r2)
            float r7 = r13.A03
            float r3 = r13.A02
            boolean r2 = java.lang.Float.isNaN(r7)
            if (r2 == 0) goto L58
            float r7 = X.AnonymousClass001.A00(r4)
        L58:
            boolean r2 = java.lang.Float.isNaN(r3)
            if (r2 == 0) goto L62
            float r3 = X.AnonymousClass001.A01(r4, r0)
        L62:
            long r2 = X.AnonymousClass005.A0L(r7, r3)
            X.B0l r7 = new X.B0l
            r7.<init>(r8)
            java.lang.String r8 = r13.A08
            long r0 = r13.A06
            int r12 = r13.A05
            r10 = 16
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 == 0) goto L9c
            X.Aio r9 = new X.Aio
            r9.<init>(r0, r12)
        L7c:
            boolean r1 = r13.A09
            androidx.compose.runtime.MutableState r0 = r7.A04
            X.AWA.A05(r0, r4)
            androidx.compose.runtime.MutableState r0 = r7.A02
            androidx.compose.runtime.MutableState.A09(r1, r0)
            X.B0j r1 = r7.A05
            androidx.compose.runtime.MutableState r0 = r1.A07
            r0.Af8(r9)
            androidx.compose.runtime.MutableState r0 = r1.A08
            X.AWA.A05(r0, r2)
            r1.A02 = r8
            X.BBI.A0O(r6, r7)
        L99:
            X.B0l r7 = (X.C2172B0l) r7
            return r7
        L9c:
            r9 = 0
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0n.A00(X.BFM, X.B0q):X.B0l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C2171B0k c2171B0k, B0o b0o) {
        C2171B0k c2171B0k2;
        List<AbstractC2181B0z> list = b0o.A08;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2181B0z abstractC2181B0z = list.get(i);
            if (abstractC2181B0z instanceof B0p) {
                C2173B0m c2173B0m = new C2173B0m();
                B0p b0p = (B0p) abstractC2181B0z;
                c2173B0m.A0E = b0p.A0D;
                c2173B0m.A0F = true;
                c2173B0m.A03();
                ((C1710Aot) c2173B0m.A0C).A03.setFillType(b0p.A07 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                c2173B0m.A03();
                c2173B0m.A03();
                c2173B0m.A09 = b0p.A0A;
                c2173B0m.A03();
                c2173B0m.A00 = b0p.A00;
                c2173B0m.A03();
                c2173B0m.A0A = b0p.A0B;
                c2173B0m.A03();
                c2173B0m.A01 = b0p.A01;
                c2173B0m.A03();
                c2173B0m.A03 = b0p.A03;
                c2173B0m.A0G = true;
                c2173B0m.A03();
                c2173B0m.A07 = b0p.A08;
                c2173B0m.A0G = true;
                c2173B0m.A03();
                c2173B0m.A08 = b0p.A09;
                c2173B0m.A0G = true;
                c2173B0m.A03();
                c2173B0m.A02 = b0p.A02;
                c2173B0m.A0G = true;
                c2173B0m.A03();
                c2173B0m.A06 = b0p.A06;
                c2173B0m.A0H = true;
                c2173B0m.A03();
                c2173B0m.A04 = b0p.A04;
                c2173B0m.A0H = true;
                c2173B0m.A03();
                c2173B0m.A05 = b0p.A05;
                c2173B0m.A0H = true;
                c2173B0m.A03();
                c2171B0k2 = c2173B0m;
            } else if (abstractC2181B0z instanceof B0o) {
                C2171B0k c2171B0k3 = new C2171B0k();
                B0o b0o2 = (B0o) abstractC2181B0z;
                c2171B0k3.A09 = b0o2.A07;
                c2171B0k3.A03();
                c2171B0k3.A02 = b0o2.A02;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A03 = b0o2.A03;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A04 = b0o2.A04;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A05 = b0o2.A05;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A06 = b0o2.A06;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A00 = b0o2.A00;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A01 = b0o2.A01;
                c2171B0k3.A0D = true;
                c2171B0k3.A03();
                c2171B0k3.A0A = b0o2.A09;
                c2171B0k3.A0C = true;
                c2171B0k3.A03();
                A01(c2171B0k3, b0o2);
                c2171B0k2 = c2171B0k3;
            }
            List<AbstractC2175B0t> list2 = c2171B0k.A0G;
            if (i < list2.size()) {
                list2.set(i, c2171B0k2);
            } else {
                list2.add(c2171B0k2);
            }
            C2171B0k.A02(c2171B0k, c2171B0k2);
            G0U<AbstractC2175B0t, Unit> g0u = c2171B0k.A0H;
            if (c2171B0k2 instanceof C2171B0k) {
                c2171B0k2.A0B = g0u;
            } else {
                ((AbstractC2175B0t) c2171B0k2).A00 = g0u;
            }
            c2171B0k.A03();
        }
    }
}

package X;

import java.util.HashMap;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BBS {
    public int A00 = -1;
    public int A01;
    public AeA<Object> A02;
    public Object A03;
    public boolean A04;
    public final C0918AHu<Object, Object> A05;
    public final C0918AHu<Object, AeA<Object>> A06;
    public final C0918AHu<Object, Object> A07;
    public final C0917AHt<Object> A08;
    public final InterfaceC2236BCg A09;
    public final C0910AHm<BCS<?>> A0A;
    public final HashMap<BCS<?>, Object> A0B;
    public final G0U<Object, Unit> A0C;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AeA r17, X.BBS r18, java.lang.Object r19, java.lang.Object r20, int r21) {
        /*
            r9 = r18
            int r0 = r9.A01
            if (r0 > 0) goto La6
            r12 = -1
            r2 = r17
            r8 = r19
            int r1 = X.AeA.A01(r2, r8)
            if (r1 >= 0) goto L8d
            r1 = r1 ^ (-1)
        L13:
            java.lang.Object[] r0 = r2.A04
            r0[r1] = r19
            int[] r0 = r2.A02
            r2 = r21
            r0[r1] = r21
            boolean r0 = r8 instanceof X.BCS
            r10 = 2
            if (r0 == 0) goto L92
            if (r12 == r2) goto L92
            r0 = r8
            X.BCS r0 = (X.BCS) r0
            X.BBX r2 = r0.AEX()
            java.util.HashMap<X.BCS<?>, java.lang.Object> r1 = r9.A0B
            java.lang.Object r0 = r2.A04
            r1.put(r8, r0)
            X.Ae9<X.BDs> r0 = r2.A03
            X.AHu<java.lang.Object, java.lang.Object> r13 = r9.A05
            X.AI3.A00(r13, r8)
            java.lang.Object[] r11 = r0.A04
            long[] r7 = r0.A03
            int r6 = r7.length
            int r6 = r6 - r10
            if (r6 < 0) goto L92
            r5 = 0
        L42:
            r18 = r7[r5]
            r3 = -1
            long r3 = r3 ^ r18
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r18
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L88
            int r0 = r5 - r6
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L61:
            if (r2 >= r3) goto L86
            r0 = 255(0xff, double:1.26E-321)
            long r16 = r18 & r0
            r14 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L81
            int r0 = r5 << 3
            int r0 = r0 + r2
            r1 = r11[r0]
            X.BDs r1 = (X.BDs) r1
            boolean r0 = r1 instanceof X.AbstractC1798ArH
            if (r0 == 0) goto L7e
            r0 = r1
            X.ArH r0 = (X.AbstractC1798ArH) r0
            r0.A0B(r10)
        L7e:
            X.AI3.A01(r13, r1, r8)
        L81:
            long r18 = r18 >> r4
            int r2 = r2 + 1
            goto L61
        L86:
            if (r3 != r4) goto L92
        L88:
            if (r5 == r6) goto L92
            int r5 = r5 + 1
            goto L42
        L8d:
            int[] r0 = r2.A02
            r12 = r0[r1]
            goto L13
        L92:
            r0 = -1
            if (r12 != r0) goto La6
            boolean r0 = r8 instanceof X.AbstractC1798ArH
            if (r0 == 0) goto L9f
            r0 = r8
            X.ArH r0 = (X.AbstractC1798ArH) r0
            r0.A0B(r10)
        L9f:
            X.AHu<java.lang.Object, java.lang.Object> r0 = r9.A07
            r1 = r20
            X.AI3.A01(r0, r8, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBS.A00(X.AeA, X.BBS, java.lang.Object, java.lang.Object, int):void");
    }

    public static final void A01(BBS bbs, Object obj, Object obj2) {
        C0918AHu<Object, Object> c0918AHu = bbs.A07;
        AI3.A02(c0918AHu, obj2, obj);
        if (!(obj2 instanceof BCS) || c0918AHu.A07(obj2)) {
            return;
        }
        AI3.A00(bbs.A05, obj2);
        bbs.A0B.remove(obj2);
    }

    public BBS(G0U<Object, Unit> g0u) {
        this.A0C = g0u;
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A07 = new C0918AHu<>(6);
        this.A06 = new C0918AHu<>(6);
        this.A08 = new C0917AHt<>(6);
        this.A0A = new C0910AHm<>(0, new BCS[16]);
        this.A09 = new BCZ(this);
        this.A05 = new C0918AHu<>(6);
        this.A0B = new HashMap<>();
    }
}

package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AGD implements AFx, BN2 {
    public final C0917AHt<Object> A00 = C0917AHt.A02();
    public final BN2 A01;
    public final AFx A02;

    /* JADX WARN: Incorrect types in method signature: (LX/AFx;Ljava/util/Map<Ljava/lang/String;+Ljava/util/List<+Ljava/lang/Object;>;>;LX/BN2;)V */
    public AGD(BN2 bn2, AFx aFx, Map map) {
        this.A02 = new AGA(map, C2295BSv.A00(aFx, 40));
        this.A01 = bn2;
    }

    @Override // X.AFx
    public final boolean A5t(Object obj) {
        return this.A02.A5t(obj);
    }

    @Override // X.AFx
    public final Object A71(String str) {
        return this.A02.A71(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // X.AFx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> AXs() {
        /*
            r14 = this;
            X.AHt<java.lang.Object> r0 = r14.A00
            java.lang.Object[] r11 = r0.A04
            long[] r10 = r0.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L49
            r8 = 0
        Lc:
            r12 = r10[r8]
            r3 = -1
            long r3 = r3 ^ r12
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r12
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L44
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L29:
            if (r5 >= r6) goto L42
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r12
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3e
            int r0 = r8 << 3
            int r0 = r0 + r5
            r1 = r11[r0]
            X.BN2 r0 = r14.A01
            r0.Aay(r1)
        L3e:
            long r12 = r12 >> r7
            int r5 = r5 + 1
            goto L29
        L42:
            if (r6 != r7) goto L49
        L44:
            if (r8 == r9) goto L49
            int r8 = r8 + 1
            goto Lc
        L49:
            X.AFx r0 = r14.A02
            java.util.Map r0 = r0.AXs()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGD.AXs():java.util.Map");
    }

    @Override // X.AFx
    public final AG2 Aa3(String str, Function0<? extends Object> function0) {
        return this.A02.Aa3(str, function0);
    }

    @Override // X.BN2
    public final void Aay(Object obj) {
        this.A01.Aay(obj);
    }

    @Override // X.BN2
    public final void A2e(Object obj, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-858296452);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            this.A01.A2e(obj, g0v, bfm, iA0T & 126);
            boolean zA1M = AnonymousClass003.A1M(bfm, this, obj);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = BTA.A00(bfm, obj, this, 34);
            }
            AnonymousClass001.A17(bfm, objAaT, obj);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(this, obj, g0v, i, 0);
        }
    }
}

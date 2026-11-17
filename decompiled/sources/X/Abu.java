package X;

import android.os.Trace;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class Abu {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public final C1143Abw A08;
    public final Ab2<List<Ac3>> A09;
    public final Ab2<C1140Abs> A0A;
    public final Ac7 A0B;
    public final Aeh A0C;

    private final int A00(InterfaceC1144Abx interfaceC1144Abx, int i, boolean z) {
        List<Ac3> listA04;
        List<Ac3> listA042;
        int i2 = 0;
        Ab2<C1140Abs> ab2 = this.A0A;
        if (ab2.A05(i)) {
            C1140Abs c1140AbsA04 = ab2.A04(i);
            C7384Etj.A0X(c1140AbsA04);
            return c1140AbsA04.A00;
        }
        Ab2<List<Ac3>> ab22 = this.A09;
        if (ab22.A05(i)) {
            if (!z || (listA042 = ab22.A04(i)) == null) {
                return -1;
            }
            int size = listA042.size();
            while (i2 < size) {
                listA042.get(i2).AQ7();
                i2++;
            }
            return -1;
        }
        BTC btc = new BTC(2, this, interfaceC1144Abx);
        C1135Abl c1135Abl = (C1135Abl) interfaceC1144Abx;
        long j = C1135Abl.A00(c1135Abl).A08;
        C1229Af7 c1229Af7 = c1135Abl.A00;
        if (c1229Af7 == null) {
            C7384Etj.A0b("state");
            throw F60.createAndThrow();
        }
        ab22.A0B(i, Collections.singletonList(c1229Af7.A00(BTA.A01(c1135Abl, btc, 36), i, j, true)));
        if (!z || (listA04 = ab22.A04(i)) == null) {
            return -1;
        }
        int size2 = listA04.size();
        while (i2 < size2) {
            listA04.get(i2).AQ7();
            i2++;
        }
        return -1;
    }

    public static final void A01(Abu abu) {
        Trace.setCounter("prefetchWindowStartExtraSpace", abu.A04);
        Trace.setCounter("prefetchWindowEndExtraSpace", abu.A02);
        Trace.setCounter("prefetchWindowStartIndex", abu.A05);
        Trace.setCounter("prefetchWindowEndIndex", abu.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.Abu r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Abu.A02(X.Abu, int, int):void");
    }

    public Abu(Ac7 ac7) {
        this.A0B = ac7;
        Ab2 ab2 = AbstractC1489Ajw.A00;
        this.A09 = new Ab2<>(6);
        int[] iArr = Ac1.A00;
        this.A0C = new Aeh(6);
        C1143Abw c1143Abw = AbstractC1146Abz.A00;
        C1143Abw c1143Abw2 = new C1143Abw();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        C1143Abw.A01(c1143Abw2, 6);
        this.A08 = c1143Abw2;
        this.A0A = new Ab2<>(6);
        this.A06 = -1;
        this.A05 = Integer.MAX_VALUE;
        this.A03 = Integer.MIN_VALUE;
    }

    /* JADX WARN: Path cross not found for [B:21:0x004f, B:19:0x0045], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:41:0x009b, B:39:0x0091], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0056 -> B:10:0x002a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a2 -> B:32:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.Abu r6, X.InterfaceC1144Abx r7, float r8, int r9, int r10, int r11, int r12, int r13, boolean r14) {
        /*
            float r1 = java.lang.Math.signum(r8)
            float r0 = r6.A00
            float r0 = java.lang.Math.signum(r0)
            r5 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r4 = 0
            r3 = -1
            if (r14 == 0) goto L67
            if (r0 == 0) goto L60
            boolean r0 = r6.A07
            if (r0 != 0) goto L60
            int r1 = r6.A02
            float r0 = java.lang.Math.abs(r8)
            int r0 = X.Ab3.A01(r0)
            int r1 = r1 + r0
            int r11 = r11 - r12
            if (r1 <= r11) goto L2a
            r1 = r11
        L2a:
            r6.A02 = r1
        L2c:
            if (r1 <= 0) goto Lb3
            int r2 = r6.A03
            if (r2 == r3) goto Lb3
            int r0 = r6.A01
            int r0 = r0 - r5
            if (r2 >= r0) goto Lb3
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            boolean r1 = X.C8j3.A1S(r0)
            int r2 = r2 + 1
            int r0 = r10 + 1
            if (r2 != r0) goto L4f
            if (r1 == 0) goto L4f
            float r1 = java.lang.Math.abs(r8)
            float r0 = (float) r12
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L50
        L4f:
            r0 = 0
        L50:
            int r2 = r6.A00(r7, r2, r0)
            if (r2 == r3) goto Lb3
            int r0 = r6.A03
            int r0 = r0 + 1
            r6.A03 = r0
            int r1 = r6.A02
            int r1 = r1 - r2
            goto L2a
        L60:
            int r1 = r11 - r12
            r6.A02 = r1
            r6.A03 = r10
            goto L2c
        L67:
            if (r0 == 0) goto Lac
            boolean r0 = r6.A07
            if (r0 != 0) goto Lac
            int r1 = r6.A04
            float r0 = java.lang.Math.abs(r8)
            int r0 = X.Ab3.A01(r0)
            int r1 = r1 + r0
            int r11 = r11 - r13
            if (r1 <= r11) goto L7c
            r1 = r11
        L7c:
            r6.A04 = r1
        L7e:
            if (r1 <= 0) goto Lb3
            int r2 = r6.A05
            if (r2 <= 0) goto Lb3
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            boolean r1 = X.C8j3.A1S(r0)
            int r2 = r2 - r5
            int r0 = r9 + (-1)
            if (r2 != r0) goto L9b
            if (r1 == 0) goto L9b
            float r1 = java.lang.Math.abs(r8)
            float r0 = (float) r13
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L9c
        L9b:
            r0 = 0
        L9c:
            int r2 = r6.A00(r7, r2, r0)
            if (r2 == r3) goto Lb3
            int r0 = r6.A05
            int r0 = r0 + (-1)
            r6.A05 = r0
            int r1 = r6.A04
            int r1 = r1 - r2
            goto L7c
        Lac:
            int r1 = r11 - r13
            r6.A04 = r1
            r6.A05 = r9
            goto L7e
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Abu.A03(X.Abu, X.Abx, float, int, int, int, int, int, boolean):void");
    }

    public final void A04() {
        this.A05 = Integer.MAX_VALUE;
        this.A03 = Integer.MIN_VALUE;
        this.A04 = 0;
        this.A02 = 0;
        this.A07 = false;
        this.A08.A03();
        this.A0A.A09();
        Ab2<List<Ac3>> ab2 = this.A09;
        long[] jArr = ab2.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        int i3 = (i << 3) + i2;
                        List list = (List) ab2.A04[i3];
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((Ac3) list.get(i4)).cancel();
                        }
                        ab2.A08(i3);
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
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
}

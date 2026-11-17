package X;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;

/* renamed from: X.Adb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1172Adb implements SubcomposeSlotReusePolicy {
    public final AeA<Object> A00;
    public final C1131Abf A01;

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean A4k(Object obj, Object obj2) {
        C1131Abf c1131Abf = this.A01;
        return C7384Etj.areEqual(c1131Abf.A00(obj), c1131Abf.A00(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void AKj(AIS ais) {
        int i;
        AeA<Object> aeA = this.A00;
        aeA.A05();
        AIR<Object> air = ais.A00;
        Object[] objArr = air.A06;
        long[] jArr = air.A05;
        int i2 = air.A03;
        while (i2 != Integer.MAX_VALUE) {
            int iA05 = C8j5.A05(i2, jArr);
            Object obj = objArr[i2];
            Object objA00 = this.A01.A00(obj);
            int iA04 = aeA.A04(objA00);
            if (iA04 >= 0) {
                i = aeA.A02[iA04];
                if (i == 7) {
                    ais.remove(obj);
                }
                i2 = iA05;
            } else {
                i = 0;
            }
            aeA.A07(objA00, i + 1);
            i2 = iA05;
        }
    }

    public C1172Adb(C1131Abf c1131Abf) {
        this.A01 = c1131Abf;
        AeA<Object> aeA = AbstractC1189Ads.A00;
        this.A00 = new AeA<>(6);
    }
}

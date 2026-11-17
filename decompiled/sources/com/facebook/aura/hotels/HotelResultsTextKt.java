package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BFM;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.R;

/* loaded from: classes3.dex */
public abstract class HotelResultsTextKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1 r2
  0x0045: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v5 java.lang.String) binds: [B:15:0x0042, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r2v4 X.BBI) = (r2v2 X.BBI), (r2v5 X.BBI) binds: [B:15:0x0042, B:10:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String hotelResultsTitle(com.facebook.aura.hotels.HotelResults r4, X.BFM r5, int r6) {
        /*
            r2 = 0
            if (r4 == 0) goto L5
            java.lang.String r2 = r4.location
        L5:
            r3 = 0
            if (r2 != 0) goto L26
            r0 = -528168309(0xffffffffe084ca8b, float:-7.6548906E19)
            X.BBI r2 = X.AnonymousClass002.A0M(r5, r0)
        Lf:
            if (r4 == 0) goto L15
            java.lang.String r1 = r4.title
            if (r1 != 0) goto L45
        L15:
            r0 = 1506988404(0x59d2d174, float:7.4175052E15)
            r5.AgE(r0)
            r0 = 2131886925(0x7f12034d, float:1.9408443E38)
            java.lang.String r1 = X.AbstractC2271BQs.A01(r5, r0)
        L22:
            X.BBI.A0R(r2, r3)
            return r1
        L26:
            r0 = -528168308(0xffffffffe084ca8c, float:-7.654891E19)
            r5.AgE(r0)
            r1 = 2131886920(0x7f120348, float:1.9408432E38)
            android.text.BidiFormatter r0 = android.text.BidiFormatter.getInstance()
            java.lang.String r0 = r0.unicodeWrap(r2)
            X.C7384Etj.A0U(r0)
            java.lang.String r1 = X.AnonymousClass001.A0t(r5, r0, r1)
            X.BBI r2 = X.C3cG.A07(r5)
            if (r1 != 0) goto L45
            goto Lf
        L45:
            r0 = 1506982452(0x59d2ba34, float:7.4143097E15)
            r5.AgE(r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelResultsTextKt.hotelResultsTitle(com.facebook.aura.hotels.HotelResults, X.BFM, int):java.lang.String");
    }

    public static final String hotelResultsTripSummary(HotelTrip hotelTrip, BFM bfm, int i) {
        C7384Etj.A0Y(hotelTrip, 0);
        return AnonymousClass006.A0w(bfm, HotelResultsFormattingKt.dateRange$default(hotelTrip, null, null, 3, null), AnonymousClass007.A0Y(hotelTrip.getAdults() + hotelTrip.getChildren(), bfm, R.plurals._name_removed__res_0x7f10000c), R.string._name_removed__res_0x7f12034e);
    }

    public static final String hotelTotalPrice(HotelMoney hotelMoney, BFM bfm, int i) {
        C7384Etj.A0Y(hotelMoney, 0);
        return AnonymousClass001.A0t(bfm, HotelResultsFormattingKt.formatted(hotelMoney, C60Q.A0w()), R.string._name_removed__res_0x7f12035d);
    }
}

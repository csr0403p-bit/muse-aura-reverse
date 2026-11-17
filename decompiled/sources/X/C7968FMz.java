package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.FMz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7968FMz implements FD8 {
    public final FNU A06;
    public final FN2 A07;
    public final FN4 A08;
    public final C7863FHz A09;
    public final HrW A0A;
    public final HsN A0B;
    public final AtomicLong A0D = new AtomicLong();
    public final AtomicReference<HoB> A0E = BV4.A16(HoB.A02);
    public final AtomicReference<Huk> A0F = new AtomicReference<>();
    public FNA A01 = null;
    public FOG A02 = null;
    public FNC A00 = null;
    public Integer A03 = C79.A00;
    public final List<FDF> A0C = C3cG.A0h();
    public boolean A05 = false;
    public boolean A04 = false;

    public static String A00(String str, int i) {
        return FGI.A0M(i == 2 ? "cc_" : "nc_", str);
    }

    public static void A01(C7968FMz c7968FMz) {
        if (c7968FMz.A04 || c7968FMz.A05 || c7968FMz.A03 != C79.A01 || c7968FMz.ACs() == null) {
            return;
        }
        AbstractC8162FXe.A01(new FN8(c7968FMz, c7968FMz));
    }

    public static void A02(C7968FMz c7968FMz, FNA fna, HoB hoB) {
        long jNow = c7968FMz.A0A.now();
        if (hoB.A01.A00) {
            Iterator itA0i = C3cG.A0i(BV4.A0u());
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                fna.AQI(C60O.A0t(entryA0l), C3cG.A05(entryA0l.getValue()));
            }
            HashMap mapA0u = BV4.A0u();
            if ("".length() > 0) {
                mapA0u.put(BV3.A00(63), "");
            }
            Iterator itA0i2 = C3cG.A0i(mapA0u);
            while (itA0i2.hasNext()) {
                Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
                fna.AQF(C60O.A0t(entryA0l2), (String) entryA0l2.getValue());
            }
        }
        if (hoB.A00 != 2) {
            fna.AR7("bloks_query", true);
        } else {
            fna.A5f(0L, "bloks_query", true, jNow);
        }
    }

    @Override // X.FD8
    public final void A3u(FDF fdf) {
        this.A0C.add(fdf);
    }

    @Override // X.FD8
    public final Context ACP() {
        return this.A07.A02;
    }

    @Override // X.FD8
    public final FBB ACs() {
        C7729FCg c7729FCg = this.A07.A00;
        if (c7729FCg != null) {
            return c7729FCg.A02();
        }
        return null;
    }

    @Override // X.FD8
    public final Integer AE2() {
        return null;
    }

    @Override // X.FD8
    public final String AK4() {
        return null;
    }

    public C7968FMz(FN2 fn2, FN4 fn4, HsN hsN) {
        C7863FHz c7863FHz = C6979Edd.A00().A00;
        this.A09 = c7863FHz;
        HrW hrW = c7863FHz.A00;
        this.A0A = hrW;
        this.A07 = fn2;
        this.A08 = fn4;
        this.A0B = hsN;
        this.A06 = new FNU(hrW.now());
    }
}

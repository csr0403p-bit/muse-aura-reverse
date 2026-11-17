package X;

import android.os.Build;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Frr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8878Frr implements Fx5 {
    public static final Map<Integer, String> A05;
    public static final Map<String, Integer> A06;
    public final double A00;
    public final int A01;
    public final C9086FyD A02;
    public final Instant A03;
    public final ZoneOffset A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8878Frr) {
                C8878Frr c8878Frr = (C8878Frr) obj;
                if (this.A00 != c8878Frr.A00 || this.A01 != c8878Frr.A01 || !this.A03.equals(c8878Frr.A03) || !C7384Etj.areEqual(this.A04, c8878Frr.A04) || !this.A02.equals(c8878Frr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Map<String, Integer> mapA0D = AGH.A0D(AnonymousClass002.A0p(DeviceSmsReaderKt.ATTACHMENT_OTHER, 0), AnonymousClass002.A0p("metabolic_cart", 1), AnonymousClass002.A0p("heart_rate_ratio", 2), AnonymousClass002.A0p("cooper_test", 3), AnonymousClass002.A0p("multistage_fitness_test", 4), AnonymousClass002.A0p("rockport_fitness_test", 5));
        A06 = mapA0D;
        A05 = AbstractC8873Frm.A00(mapA0D);
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A02;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A03;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, (AnonymousClass005.A0F(this.A03, ((AnonymousClass002.A0A(Double.doubleToLongBits(this.A00)) * 31) + this.A01) * 31) + C60R.A01(this.A04)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Vo2MaxRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A03);
        sbA0x.append(this.A04);
        sbA0x.append(", vo2MillilitersPerMinuteKilogram=");
        sbA0x.append(this.A00);
        sbA0x.append(", measurementMethod=");
        AbstractC7608F5v.A1N(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C8878Frr(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, double d, int i) {
        this.A03 = instant;
        this.A04 = zoneOffset;
        this.A02 = c9086FyD;
        this.A00 = d;
        this.A01 = i;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else {
            AbstractC8873Frm.A03("vo2MillilitersPerMinuteKilogram", d);
            AbstractC8873Frm.A02(Double.valueOf(d), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
        }
    }
}

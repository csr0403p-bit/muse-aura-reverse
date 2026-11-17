package X;

import android.os.Build;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Fwa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8997Fwa implements InterfaceC9020Fwx {
    public static final C8993FwW<Duration> A06;
    public static final C8993FwW<Duration> A07;
    public static final C8993FwW<Duration> A08;
    public static final C8993FwW<Duration> A09;
    public static final Map<Integer, String> A0A;
    public static final Map<String, Integer> A0B;
    public final int A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8997Fwa) {
                C8997Fwa c8997Fwa = (C8997Fwa) obj;
                if (this.A00 != c8997Fwa.A00 || !this.A03.equals(c8997Fwa.A03) || !C7384Etj.areEqual(this.A05, c8997Fwa.A05) || !this.A02.equals(c8997Fwa.A02) || !C7384Etj.areEqual(this.A04, c8997Fwa.A04) || !this.A01.equals(c8997Fwa.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A00;
        C8989FwR c8989FwR = C8989FwR.A00;
        A08 = new C8993FwW<>(c8989FwR, num, "ActivityIntensity", "moderateDuration");
        A09 = new C8993FwW<>(c8989FwR, num, "ActivityIntensity", "vigorousDuration");
        A06 = new C8993FwW<>(c8989FwR, num, "ActivityIntensity", "duration");
        A07 = new C8993FwW<>(c8989FwR, num, "ActivityIntensity", "intensityMinutes");
        Map<String, Integer> mapA0d = AnonymousClass007.A0d("vigorous", BV4.A0W(), AnonymousClass002.A0p("moderate", 0));
        A0B = mapA0d;
        A0A = AbstractC8873Frm.A00(mapA0d);
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AFC() {
        return this.A02;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AFE() {
        return this.A04;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.InterfaceC9020Fwx
    public final Instant AKy() {
        return this.A03;
    }

    @Override // X.InterfaceC9020Fwx
    public final ZoneOffset AKz() {
        return this.A05;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0F(this.A03, this.A00 * 31) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ActivityIntensityRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", activityIntensityType=");
        AbstractC7608F5v.A1N(sbA0x, this.A00);
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8997Fwa(C9086FyD c9086FyD, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, int i) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A01 = c9086FyD;
        this.A00 = i;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
    }
}

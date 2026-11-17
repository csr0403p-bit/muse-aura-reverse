package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Frt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8880Frt implements Fx5 {
    public final long A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final ZoneOffset A03;
    public static final C8993FwW<Long> A04 = C8993FwW.A01(C79.A01, "RestingHeartRate", "bpm");
    public static final C8993FwW<Long> A06 = C8993FwW.A01(C79.A0C, "RestingHeartRate", "bpm");
    public static final C8993FwW<Long> A05 = C8993FwW.A01(C79.A0K, "RestingHeartRate", "bpm");

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8880Frt) {
                C8880Frt c8880Frt = (C8880Frt) obj;
                if (this.A00 != c8880Frt.A00 || !this.A02.equals(c8880Frt.A02) || !C7384Etj.areEqual(this.A03, c8880Frt.A03) || !this.A01.equals(c8880Frt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A02;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, C3cI.A01(this.A00)) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RestingHeartRateRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", beatsPerMinute=");
        sbA0x.append(this.A00);
        sbA0x.append(", metadata=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8880Frt(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, long j) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A00 = j;
        this.A01 = c9086FyD;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else {
            if (j < 0) {
                throw C60Q.A0U("beatsPerMinute", " must not be negative");
            }
            AbstractC8873Frm.A02(Long.valueOf(j), 300L, "beatsPerMinute");
        }
    }
}

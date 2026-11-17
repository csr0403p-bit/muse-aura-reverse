package X;

import com.facebook.aura.gateway.service.GeofenceEventWorker;
import java.time.Instant;

/* renamed from: X.FxG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9034FxG {
    public final double A00;
    public final double A01;
    public final Fy1 A02;
    public final Fy1 A03;
    public final Fy1 A04;
    public final Instant A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9034FxG) {
                C9034FxG c9034FxG = (C9034FxG) obj;
                if (!this.A05.equals(c9034FxG.A05) || this.A00 != c9034FxG.A00 || this.A01 != c9034FxG.A01 || !C7384Etj.areEqual(this.A03, c9034FxG.A03) || !C7384Etj.areEqual(this.A04, c9034FxG.A04) || !C7384Etj.areEqual(this.A02, c9034FxG.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((HsK.A01(this.A01, HsK.A01(this.A00, AnonymousClass005.A0E(this.A05))) + C60R.A01(this.A03)) * 31) + C60R.A01(this.A04)) * 31) + C8j4.A0E(this.A02, 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Location(time=");
        sbA0x.append(this.A05);
        sbA0x.append(", latitude=");
        sbA0x.append(this.A00);
        sbA0x.append(", longitude=");
        sbA0x.append(this.A01);
        sbA0x.append(", horizontalAccuracy=");
        sbA0x.append(this.A03);
        sbA0x.append(", verticalAccuracy=");
        sbA0x.append(this.A04);
        sbA0x.append(", altitude=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C9034FxG(Fy1 fy1, Fy1 fy12, Fy1 fy13, Instant instant, double d, double d2) {
        this.A05 = instant;
        this.A00 = d;
        this.A01 = d2;
        this.A03 = fy1;
        this.A04 = fy12;
        this.A02 = fy13;
        Double dValueOf = Double.valueOf(d);
        AbstractC8873Frm.A01(dValueOf, Double.valueOf(-90.0d), GeofenceEventWorker.KEY_LATITUDE);
        AbstractC8873Frm.A02(dValueOf, Double.valueOf(90.0d), GeofenceEventWorker.KEY_LATITUDE);
        Double dValueOf2 = Double.valueOf(d2);
        AbstractC8873Frm.A01(dValueOf2, Double.valueOf(-180.0d), GeofenceEventWorker.KEY_LONGITUDE);
        AbstractC8873Frm.A02(dValueOf2, Double.valueOf(180.0d), GeofenceEventWorker.KEY_LONGITUDE);
        if (fy1 != null) {
            AbstractC8873Frm.A01(fy1, (Fy1) AbstractC7610F5x.A0s(fy1.A01, Fy1.A03), "horizontalAccuracy");
        }
        if (fy12 != null) {
            AbstractC8873Frm.A01(fy12, (Fy1) AbstractC7610F5x.A0s(fy12.A01, Fy1.A03), "verticalAccuracy");
        }
    }
}

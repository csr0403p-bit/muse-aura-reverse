package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9066Fxo implements InterfaceC9020Fwx {
    public static final C8993FwW<Fy1> A06;
    public static final Fy1 A07;
    public static final Fy1 A08;
    public final C9086FyD A00;
    public final Fy1 A01;
    public final Instant A02;
    public final Instant A03;
    public final ZoneOffset A04;
    public final ZoneOffset A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9066Fxo) {
                C9066Fxo c9066Fxo = (C9066Fxo) obj;
                if (!this.A01.equals(c9066Fxo.A01) || !this.A03.equals(c9066Fxo.A03) || !C7384Etj.areEqual(this.A05, c9066Fxo.A05) || !this.A02.equals(c9066Fxo.A02) || !C7384Etj.areEqual(this.A04, c9066Fxo.A04) || !this.A00.equals(c9066Fxo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C9119Fyk c9119Fyk = Fy1.A02;
        EnumC9152FzL enumC9152FzL = EnumC9152FzL.A02;
        A07 = new Fy1(enumC9152FzL, 1000000.0d);
        A08 = new Fy1(enumC9152FzL, -1000000.0d);
        A06 = C8993FwW.A02(C79.A0P, "ElevationGained", "elevation", AbstractC7607F5u.A1B(Fy1.A02, 9));
    }

    public C9066Fxo(C9086FyD c9086FyD, Fy1 fy1, Instant instant, Instant instant2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.A03 = instant;
        this.A05 = zoneOffset;
        this.A02 = instant2;
        this.A04 = zoneOffset2;
        this.A01 = fy1;
        this.A00 = c9086FyD;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
        } else {
            AbstractC8873Frm.A01(fy1, A08, "elevation");
            AbstractC8873Frm.A02(fy1, A07, "elevation");
        }
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
        return this.A00;
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
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, (AnonymousClass005.A0F(this.A03, AnonymousClass005.A0E(this.A01)) + C60R.A01(this.A05)) * 31) + C8j4.A0E(this.A04, 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ElevationGainedRecord(startTime=");
        AbstractC7608F5v.A1T(sbA0x, this.A03);
        AbstractC7608F5v.A1P(sbA0x, this.A05);
        AbstractC7608F5v.A1S(sbA0x, this.A02);
        sbA0x.append(this.A04);
        sbA0x.append(", elevation=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}

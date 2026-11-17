package X;

import android.os.Build;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9063Fxl implements Fx5 {
    public static final C8993FwW<Fy1> A04;
    public static final C8993FwW<Fy1> A05;
    public static final C8993FwW<Fy1> A06;
    public static final Fy1 A07;
    public final C9086FyD A00;
    public final Fy1 A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9063Fxl) {
                C9063Fxl c9063Fxl = (C9063Fxl) obj;
                if (!this.A01.equals(c9063Fxl.A01) || !this.A02.equals(c9063Fxl.A02) || !C7384Etj.areEqual(this.A03, c9063Fxl.A03) || !this.A00.equals(c9063Fxl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C9119Fyk c9119Fyk = Fy1.A02;
        A07 = new Fy1(EnumC9152FzL.A02, 3.0d);
        Integer num = C79.A01;
        C9119Fyk c9119Fyk2 = Fy1.A02;
        A04 = C8993FwW.A02(num, "Height", HatchWebPageParserKt.HEIGHT_ATTR, AbstractC7607F5u.A1B(c9119Fyk2, 10));
        A06 = C8993FwW.A02(C79.A0C, "Height", HatchWebPageParserKt.HEIGHT_ATTR, AbstractC7607F5u.A1B(c9119Fyk2, 12));
        A05 = C8993FwW.A02(C79.A0K, "Height", HatchWebPageParserKt.HEIGHT_ATTR, AbstractC7607F5u.A1B(c9119Fyk2, 11));
    }

    public C9063Fxl(C9086FyD c9086FyD, Fy1 fy1, Instant instant, ZoneOffset zoneOffset) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = fy1;
        this.A00 = c9086FyD;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        AbstractC8873Frm.A01(fy1, (Fy1) AbstractC7610F5x.A0s(fy1.A01, Fy1.A03), HatchWebPageParserKt.HEIGHT_ATTR);
        AbstractC8873Frm.A02(fy1, A07, HatchWebPageParserKt.HEIGHT_ATTR);
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
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
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HeightRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", height=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}

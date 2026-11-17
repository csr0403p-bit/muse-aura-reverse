package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.time.Instant;

/* renamed from: X.FyC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9085FyC {
    public static final C9082Fy9 A02;
    public static final C9082Fy9 A03;
    public final C9082Fy9 A00;
    public final Instant A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.SkinTemperatureRecord.Delta");
                C9085FyC c9085FyC = (C9085FyC) obj;
                if (!this.A01.equals(c9085FyC.A01) || !this.A00.equals(c9085FyC.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC9112Fyd enumC9112Fyd = EnumC9112Fyd.A02;
        A03 = new C9082Fy9(enumC9112Fyd, -30.0d);
        A02 = new C9082Fy9(enumC9112Fyd, 30.0d);
    }

    public C9085FyC(C9082Fy9 c9082Fy9, Instant instant) {
        this.A01 = instant;
        this.A00 = c9082Fy9;
        AbstractC8873Frm.A01(c9082Fy9, A03, BrowserOperationCatalogKt.DELTA);
        AbstractC8873Frm.A02(c9082Fy9, A02, BrowserOperationCatalogKt.DELTA);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Delta(time=");
        sbA0x.append(this.A01);
        sbA0x.append(", delta=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }
}

package X;

import android.app.Application;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.Calendar;

/* loaded from: classes5.dex */
public final class C6P implements InterfaceC3231C4o {
    public Application A00;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0S;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        Application application = this.A00;
        if (C6S.A01 == null) {
            synchronized (C6S.class) {
                if (C6S.A01 == null) {
                    if (application == null) {
                        throw BV4.A0a("getApplicationContext");
                    }
                    C6S.A01 = new C6S(application);
                }
            }
        }
        C6S c6s = C6S.A01;
        C3228C4l.A01(C6B.A2K, c3228C4l, BV4.A04(C3cH.A04(Calendar.getInstance().getTimeInMillis())));
        C3221C4e c3221C4e = C6B.A2J;
        String strA00 = c6s.A00(c3221C4e.name, HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        if (strA00 != null) {
            C3228C4l.A01(c3221C4e, c3228C4l, Long.parseLong(strA00));
        }
        C3221C4e c3221C4e2 = C6B.A2L;
        String strA002 = c6s.A00(c3221C4e2.name, HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        if (strA002 != null) {
            C3228C4l.A01(c3221C4e2, c3228C4l, Long.parseLong(strA002));
        }
    }
}

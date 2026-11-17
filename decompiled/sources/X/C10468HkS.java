package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.Map;

/* renamed from: X.HkS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10468HkS implements EWH {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;
    public final /* synthetic */ HsM A02;

    @Override // X.EWH
    public final void onPttError(Throwable th, Integer num, Boolean bool) {
        C7384Etj.A0Y(th, 0);
        th.getCause();
        HxE hxEA0r = C3cG.A0r("exception", th.toString());
        HxE hxEA0r2 = C3cG.A0r("error_code", String.valueOf(0));
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        Map mapA16 = AbstractC7608F5v.A16(hxEA0r, hxEA0r2, C3cG.A0r(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, message), C3cG.A0r("remaining_attempts", num != null ? String.valueOf(num.intValue()) : null), C3cG.A0r("auth_factor_expired", bool));
        AbstractC7691FAk.A00(this.A00, C9115Fyg.A04(mapA16), this.A01);
    }

    @Override // X.EWH
    public final void onPttSigned(String str) {
        C7384Etj.A0Y(str, 0);
        HsM hsM = this.A02;
        AbstractC7691FAk.A00(this.A00, C9115Fyg.A04(str), hsM);
    }

    public C10468HkS(HsM hsM, F6D f6d, HsM hsM2) {
        this.A02 = hsM;
        this.A00 = f6d;
        this.A01 = hsM2;
    }
}

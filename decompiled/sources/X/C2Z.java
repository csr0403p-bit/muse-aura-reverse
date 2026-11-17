package X;

import com.facebook.errorreporting.field.ReportFieldBase;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C2Z extends AbstractC3225C4i {
    public final C2Y A00;
    public final Map<String, String> A01 = C60O.A1C();
    public final Map<String, F18<String>> A02 = C60O.A1C();

    @Override // X.AbstractC3225C4i
    public final void A00(ReportFieldBase reportFieldBase, EnumC3223C4g enumC3223C4g, String str) {
        String strA0M = FGI.A0M(enumC3223C4g.prefix, reportFieldBase.name);
        C2Y c2y = this.A00;
        if (c2y.A02(strA0M)) {
            c2y.A01(strA0M, str);
        } else {
            this.A01.put(strA0M, str);
        }
    }

    @Override // X.AbstractC3225C4i
    public final void A01(ReportFieldBase reportFieldBase, EnumC3223C4g enumC3223C4g, String str) {
        String strA0U = FGI.A0U(enumC3223C4g.prefix, "cadm_", reportFieldBase.name);
        C2Y c2y = this.A00;
        if (c2y.A02(strA0U)) {
            c2y.A01(strA0U, str);
        } else {
            this.A01.put(strA0U, str);
        }
    }

    public C2Z(C2Y c2y) {
        this.A00 = c2y;
    }
}

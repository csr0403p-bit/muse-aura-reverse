package X;

import android.content.Context;
import android.util.Base64;

/* renamed from: X.F5r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7604F5r implements CUK {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C7604F5r(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.CUK
    public final Object get() {
        if (this.$t != 0) {
            CUL cul = (CUL) this.A00;
            C3565CUi c3565CUi = (C3565CUi) this.A01;
            return c3565CUi.A02.A7X(new CUP(cul, c3565CUi));
        }
        C3554CTr c3554CTr = (C3554CTr) this.A00;
        Context context = (Context) this.A01;
        C3554CTr.A01(c3554CTr);
        String strEncodeToString = Base64.encodeToString(BV7.A1a(c3554CTr.A04), 11);
        C3554CTr.A01(c3554CTr);
        return new CTN(context, (CTQ) c3554CTr.A02.A02(CTQ.class), FGI.A0U(strEncodeToString, "+", Base64.encodeToString(BV7.A1a(c3554CTr.A01.A00), 11)));
    }
}

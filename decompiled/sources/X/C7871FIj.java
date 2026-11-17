package X;

import android.text.Layout;
import android.text.Spannable;

/* renamed from: X.FIj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7871FIj implements F6U {
    public final /* synthetic */ FDW A00;
    public final /* synthetic */ HsM A01;

    public C7871FIj(FDW fdw, HsM hsM) {
        this.A01 = hsM;
        this.A00 = fdw;
    }

    @Override // X.F6U
    public final void A4a(Layout layout, Spannable spannable, FJF fjf, int i, int i2) {
        boolean zA1b = AnonymousClass004.A1b(fjf, spannable);
        HsM hsM = this.A01;
        FDW fdw = this.A00;
        spannable.setSpan(new C7886FJe(fdw, fdw, hsM, null, null, zA1b), fjf.A01, fjf.A00, 33);
    }
}

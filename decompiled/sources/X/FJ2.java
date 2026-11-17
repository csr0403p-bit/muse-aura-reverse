package X;

import android.text.Layout;
import android.text.Spannable;

/* loaded from: classes6.dex */
public final class FJ2 implements F6U {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Object A01;

    public FJ2(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // X.F6U
    public final void A4a(Layout layout, Spannable spannable, FJF fjf, int i, int i2) {
        AnonymousClass003.A0u(fjf, spannable);
        spannable.setSpan(this.A01, fjf.A01, fjf.A00, this.A00);
    }
}

package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CJF implements CFD {
    public final CFD A00;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        Context context = ((CJD) this.A00).A00.A00;
        if (context != null) {
            return new CJK(context);
        }
        throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
    }

    public CJF(CFD cfd) {
        this.A00 = cfd;
    }
}

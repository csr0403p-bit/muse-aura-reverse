package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CJD implements CFD {
    public final CFB A00;

    @Override // X.CFD
    public final /* synthetic */ Object AjF() {
        Context context = this.A00.A00;
        if (context != null) {
            return context;
        }
        throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
    }

    public CJD(CFB cfb) {
        this.A00 = cfb;
    }
}

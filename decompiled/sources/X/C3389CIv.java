package X;

import android.content.Context;

/* renamed from: X.CIv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3389CIv implements CFD {
    public final CFB A00;

    @Override // X.CFD
    public final /* synthetic */ Object AjF() {
        CJ6 cj6;
        Context context = this.A00.A00;
        synchronized (CJ6.class) {
            cj6 = CJ6.A08;
            if (cj6 == null) {
                cj6 = new CJ6(context, EnumC3387CIt.A02);
                CJ6.A08 = cj6;
            }
        }
        return cj6;
    }

    public C3389CIv(CFB cfb) {
        this.A00 = cfb;
    }
}

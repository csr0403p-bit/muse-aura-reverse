package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public final class CJA implements CFD {
    public final CFD A00;
    public final CFD A01;
    public final CFD A02;
    public final CFD A03;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        Context context = ((CJD) this.A00).A00.A00;
        if (context == null) {
            throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
        }
        File file = (File) this.A01.AjF();
        return new CIl(context, new CJC(this.A03), (CJK) this.A02.AjF(), file);
    }

    public CJA(CFD cfd, CFD cfd2, CFD cfd3, CFD cfd4) {
        this.A00 = cfd;
        this.A01 = cfd2;
        this.A02 = cfd3;
        this.A03 = cfd4;
    }
}

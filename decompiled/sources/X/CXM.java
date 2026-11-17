package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CXM implements CXN {
    public final Context A00;
    public final CXN A01;

    public CXM(Context context) {
        CXJ cxj = new CXJ();
        this.A00 = context.getApplicationContext();
        this.A01 = cxj;
    }

    @Override // X.CXN
    public final /* bridge */ /* synthetic */ C1J createDataSource() {
        return new C3605CWv(this.A00, this.A01.createDataSource());
    }
}

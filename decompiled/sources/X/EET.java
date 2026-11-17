package X;

import android.content.Context;
import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EET implements EEV {
    public boolean A00;
    public final Context A01;
    public final ECx A02;
    public final String A03;
    public final F0C<C6528ECv> A04 = C5322DgG.A01((Function0) new C7589F5c(this, 9));
    public final boolean A05;
    public final boolean A06;

    @Override // X.EEV
    public final EI3 AMs() {
        return this.A04.getValue().A01();
    }

    @Override // X.EEV, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        F0C<C6528ECv> f0c = this.A04;
        if (f0c.AOX()) {
            f0c.getValue().close();
        }
    }

    public EET(Context context, ECx eCx, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = eCx;
        this.A06 = z;
        this.A05 = z2;
    }
}

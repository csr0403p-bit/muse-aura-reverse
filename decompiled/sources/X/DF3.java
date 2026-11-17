package X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DF3<T> implements InterfaceC5231Ddp {
    public final int A00;
    public final long A01 = C5072DTn.A05.getAndIncrement();
    public final C1O A02;
    public final DF4 A03;
    public final InterfaceC3126Byr<? extends T> A04;
    public volatile T A05;

    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
    }

    public static C5072DTn A00(DF3 df3, long j) {
        long j2 = df3.A01;
        C1O c1o = df3.A02;
        DF4 df4 = df3.A03;
        return new C5072DTn(df4.A01, c1o, df4.A02, j2, j);
    }

    @Override // X.InterfaceC5231Ddp
    public final void APf() throws IOException {
        DF4 df4 = this.A03;
        df4.A00 = 0L;
        C1Q c1q = new C1Q(df4, this.A02);
        try {
            if (!c1q.A00) {
                c1q.A03.open(c1q.A04);
                c1q.A00 = true;
            }
            Uri uri = df4.A03.getUri();
            uri.getClass();
            this.A05 = this.A04.AXb(uri, c1q);
        } finally {
            try {
                c1q.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/C1J;LX/C1O;ILX/Byr<+TT;>;)V */
    public DF3(C1J c1j, C1O c1o, InterfaceC3126Byr interfaceC3126Byr, int i) {
        this.A03 = new DF4(c1j);
        this.A02 = c1o;
        this.A00 = i;
        this.A04 = interfaceC3126Byr;
    }
}

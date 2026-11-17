package X;

import java.io.IOException;

/* renamed from: X.Dgv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5352Dgv implements DhA {
    public final /* synthetic */ C5358Dh3 A00;

    public C5352Dgv(C5358Dh3 c5358Dh3) {
        this.A00 = c5358Dh3;
    }

    @Override // X.DhA
    public final void AQQ() throws IOException {
        C5358Dh3 c5358Dh3 = this.A00;
        C5358Dh3 c5358Dh32 = C5358Dh3.$redex_init_class;
        c5358Dh3.A0C.AQQ();
        IOException iOException = c5358Dh3.A0F;
        if (iOException != null) {
            throw iOException;
        }
    }
}

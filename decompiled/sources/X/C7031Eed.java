package X;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.Eed, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7031Eed implements InterfaceC7015EeM<EfF<InterfaceC7064EfB>> {
    public final ContentResolver A00;
    public final Executor A01;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<EfF<InterfaceC7064EfB>> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
        C7183Eht c7183Eht = c7185Ehv.A07;
        interfaceC7029Eea.AYq("local", "thumbnail_bitmap");
        Eec eec = new Eec(new CancellationSignal(), interfaceC7028EeZ, this, interfaceC7029Eea, interfaceC7029Eea, interfaceC7027EeY, interfaceC7027EeY, c7183Eht);
        InterfaceC7029Eea.A00(interfaceC7029Eea, eec, this, 3);
        this.A01.execute(eec);
    }

    public C7031Eed(ContentResolver contentResolver, Executor executor) {
        this.A01 = executor;
        this.A00 = contentResolver;
    }
}

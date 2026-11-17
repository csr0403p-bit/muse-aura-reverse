package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: X.Edl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6985Edl implements InterfaceC7013EeK<C6988Edo> {
    public final ContentResolver A00;
    public final C7011EeI A01;
    public final Executor A02;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
        C7183Eht c7183Eht = c7185Ehv.A07;
        interfaceC7029Eea.AYq("local", "exif");
        C6983Edj c6983Edj = new C6983Edj(interfaceC7028EeZ, this, interfaceC7029Eea, interfaceC7027EeY, c7183Eht);
        InterfaceC7029Eea.A00(interfaceC7029Eea, c6983Edj, this, 1);
        this.A02.execute(c6983Edj);
    }

    @Override // X.InterfaceC7013EeK
    public final boolean A5u(C7481Exe c7481Exe) {
        return AbstractC6999Ee1.A00(c7481Exe, 512, 512);
    }

    public C6985Edl(ContentResolver contentResolver, C7011EeI c7011EeI, Executor executor) {
        this.A02 = executor;
        this.A01 = c7011EeI;
        this.A00 = contentResolver;
    }
}

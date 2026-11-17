package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Eek, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7038Eek extends AbstractC7043Eep {
    public final C7040Eem A00;
    public final Eh5 A01;
    public final InterfaceC7029Eea A02;
    public final /* synthetic */ C7041Een A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7038Eek(C7040Eem c7040Eem, Eh5 eh5, InterfaceC7028EeZ interfaceC7028EeZ, C7041Een c7041Een, InterfaceC7029Eea interfaceC7029Eea) {
        super(interfaceC7028EeZ, c7041Een, interfaceC7029Eea);
        this.A03 = c7041Een;
        this.A02 = interfaceC7029Eea;
        this.A00 = c7040Eem;
        this.A01 = eh5;
        ((AbstractC7043Eep) this).A00 = 0;
    }

    public static final void A00(InputStream inputStream, long j) throws IOException {
        if (j < 0) {
            throw BV4.A0O();
        }
        while (j > 0) {
            long jSkip = inputStream.skip(j);
            if (jSkip > 0) {
                j -= jSkip;
            } else if (inputStream.read() == -1) {
                return;
            } else {
                j--;
            }
        }
    }
}

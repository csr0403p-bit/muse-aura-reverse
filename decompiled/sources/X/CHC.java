package X;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class CHC {
    public final /* synthetic */ CHD A00;

    public CHC(CHD chd) {
        this.A00 = chd;
    }

    public final void A00(Writer writer, Object obj) throws IOException {
        CHD chd = this.A00;
        InterfaceC3289C9n<Boolean> interfaceC3289C9n = CHD.A05;
        C9j c9j = new C9j(chd.A00, writer, chd.A02, chd.A03, chd.A01);
        c9j.A00(obj);
        c9j.A00.flush();
    }
}

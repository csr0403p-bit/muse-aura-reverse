package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class CVP implements InterfaceC3587CVm<Closeable> {
    @Override // X.InterfaceC3587CVm
    public final /* bridge */ /* synthetic */ void Aa9(Closeable closeable) throws IOException {
        Closeable closeable2 = closeable;
        if (closeable2 != null) {
            try {
                try {
                    closeable2.close();
                } catch (IOException e) {
                    CVO.A00.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                }
            } catch (IOException unused) {
            }
        }
    }
}

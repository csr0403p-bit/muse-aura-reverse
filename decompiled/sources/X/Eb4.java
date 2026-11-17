package X;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class Eb4 implements Closeable {
    public final long A00() {
        if (this instanceof C6851Eb9) {
            return ((C6851Eb9) this).A00;
        }
        return 0L;
    }

    public final InterfaceC6831Eaj A01() {
        return this instanceof C6851Eb9 ? ((C6851Eb9) this).A01 : ((Eb8) this).A00;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        AbstractC6843Eav.A0A(A01());
    }
}

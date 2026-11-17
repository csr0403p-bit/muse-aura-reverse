package X;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.Byu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3129Byu extends BufferedOutputStream {
    public boolean A00;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.A00 = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((FilterOutputStream) this).out.close();
            if (th == null) {
                return;
            }
        } catch (Throwable th2) {
            if (th == null) {
                throw th2;
            }
        }
        throw th;
    }

    public final void A00(OutputStream outputStream) {
        C1G.A08(this.A00);
        ((FilterOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.A00 = false;
    }
}

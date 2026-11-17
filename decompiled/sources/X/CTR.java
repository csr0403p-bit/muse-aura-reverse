package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class CTR implements Closeable {
    public CSA<Bitmap> A00;
    public final URL A01;
    public volatile InputStream A02;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    CTS.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    throw BV4.A0N(e2);
                }
            }
        }
    }

    public CTR(URL url) {
        this.A01 = url;
    }
}

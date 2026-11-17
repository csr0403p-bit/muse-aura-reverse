package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* loaded from: classes5.dex */
public final class DXF extends URLStreamHandler {
    public byte[] A00;

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return new DXE(url, this.A00);
    }
}

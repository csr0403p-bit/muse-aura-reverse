package X;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes5.dex */
public final class DXE extends URLConnection {
    public byte[] A00;

    @Override // java.net.URLConnection
    public final void connect() {
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return BV4.A0E(this.A00);
    }

    public DXE(URL url, byte[] bArr) {
        super(url);
        this.A00 = bArr;
    }
}

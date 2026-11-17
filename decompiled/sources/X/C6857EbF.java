package X;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: X.EbF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6857EbF extends ProxySelector {
    public static final C6857EbF A00 = new C6857EbF();

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw C60O.A0i("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}

package X;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: X.EZm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6778EZm implements InterfaceC6780EZp {
    @Override // X.InterfaceC6780EZp
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return EZV.A02 && (sSLSocket instanceof BCSSLSocket);
    }

    @Override // X.InterfaceC6780EZp
    public final InterfaceC6776EZk A7Y(SSLSocket sSLSocket) {
        return new C6767EZb();
    }
}

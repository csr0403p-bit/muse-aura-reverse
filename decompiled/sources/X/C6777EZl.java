package X;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: X.EZl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6777EZl implements InterfaceC6780EZp {
    @Override // X.InterfaceC6780EZp
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return EZU.A02 && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // X.InterfaceC6780EZp
    public final InterfaceC6776EZk A7Y(SSLSocket sSLSocket) {
        return new C6769EZd();
    }
}

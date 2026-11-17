package X;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: X.EZa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6766EZa implements InterfaceC6776EZk {
    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<+LX/Ec1;>;)V */
    @Override // X.InterfaceC6776EZk
    public final void A6r(String str, List list, SSLSocket sSLSocket) throws IOException {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Logger logger = EZT.A00;
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // X.InterfaceC6776EZk
    public final String AKH(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AP7() {
        Logger logger = EZT.A00;
        return AnonymousClass002.A1L(BV8.A1W() ? 1 : 0);
    }
}

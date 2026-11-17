package X;

import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: X.EZb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6767EZb implements InterfaceC6776EZk {
    public static final InterfaceC6780EZp A00 = new C6778EZm();

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<+LX/Ec1;>;)V */
    @Override // X.InterfaceC6776EZk
    public final void A6r(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Logger logger = EZT.A00;
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // X.InterfaceC6776EZk
    public final String AKH(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AP7() {
        return EZV.A02;
    }
}

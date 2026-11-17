package X;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes5.dex */
public final class EZV extends EZT {
    public static final C6785EZu A01;
    public static final boolean A02;
    public final Provider A00 = new BouncyCastleJsseProvider();

    @Override // X.EZT
    public final String A03(SSLSocket sSLSocket) {
        String applicationProtocol;
        C7384Etj.A0Y(sSLSocket, 0);
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<LX/Ec1;>;)V */
    @Override // X.EZT
    public final void A08(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    static {
        C6785EZu c6785EZu = new C6785EZu();
        A01 = c6785EZu;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c6785EZu.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        A02 = z;
    }
}

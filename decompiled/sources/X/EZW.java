package X;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes5.dex */
public final class EZW extends EZT {
    public static final C6786EZv A01;
    public static final boolean A02;
    public final Provider A00 = new OpenJSSE();

    @Override // X.EZT
    public final String A03(SSLSocket sSLSocket) {
        String applicationProtocol;
        C7384Etj.A0Y(sSLSocket, 0);
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<LX/Ec1;>;)V */
    @Override // X.EZT
    public final void A08(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
                if (array == null) {
                    throw BV6.A0h();
                }
                sSLParameters2.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
            }
        }
    }

    static {
        C6786EZv c6786EZv = new C6786EZv();
        A01 = c6786EZv;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c6786EZv.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        A02 = z;
    }
}

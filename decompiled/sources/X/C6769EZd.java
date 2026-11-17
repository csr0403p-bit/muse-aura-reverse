package X;

import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: X.EZd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6769EZd implements InterfaceC6776EZk {
    public static final InterfaceC6780EZp A00 = new C6777EZl();

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<+LX/Ec1;>;)V */
    @Override // X.InterfaceC6776EZk
    public final void A6r(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Logger logger = EZT.A00;
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // X.InterfaceC6776EZk
    public final String AKH(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AP7() {
        return EZU.A02;
    }
}

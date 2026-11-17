package X;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: X.EZj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6775EZj implements InterfaceC6776EZk {
    public InterfaceC6776EZk A00;
    public final InterfaceC6780EZp A01;

    private final synchronized InterfaceC6776EZk A00(SSLSocket sSLSocket) {
        if (this.A00 == null) {
            InterfaceC6780EZp interfaceC6780EZp = this.A01;
            if (interfaceC6780EZp.AQL(sSLSocket)) {
                this.A00 = interfaceC6780EZp.A7Y(sSLSocket);
            }
        }
        return this.A00;
    }

    @Override // X.InterfaceC6776EZk
    public final String AKH(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        InterfaceC6776EZk interfaceC6776EZkA00 = A00(sSLSocket);
        if (interfaceC6776EZkA00 == null) {
            return null;
        }
        return interfaceC6776EZkA00.AKH(sSLSocket);
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return this.A01.AQL(sSLSocket);
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AP7() {
        return true;
    }

    public C6775EZj(InterfaceC6780EZp interfaceC6780EZp) {
        this.A01 = interfaceC6780EZp;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<+LX/Ec1;>;)V */
    @Override // X.InterfaceC6776EZk
    public final void A6r(String str, List list, SSLSocket sSLSocket) {
        AnonymousClass003.A0v(sSLSocket, list);
        InterfaceC6776EZk interfaceC6776EZkA00 = A00(sSLSocket);
        if (interfaceC6776EZkA00 != null) {
            interfaceC6776EZkA00.A6r(str, list, sSLSocket);
        }
    }
}

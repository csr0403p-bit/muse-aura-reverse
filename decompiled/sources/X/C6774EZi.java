package X;

import javax.net.ssl.SSLSocket;

/* renamed from: X.EZi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6774EZi implements InterfaceC6780EZp {
    @Override // X.InterfaceC6780EZp
    public final InterfaceC6776EZk A7Y(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw BV4.A0N(AnonymousClass006.A0y(cls, "No OpenSSLSocketImpl superclass of socket of type ", C60O.A0w()));
            }
        }
        return new C6772EZg(superclass);
    }

    @Override // X.InterfaceC6780EZp
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        String strA0e = C60Q.A0e(sSLSocket);
        String strA0y = AnonymousClass006.A0y(".", "com.google.android.gms.org.conscrypt", C60O.A0w());
        C7384Etj.A0Y(strA0y, 1);
        return strA0e.startsWith(strA0y);
    }
}

package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* renamed from: X.EZg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6772EZg implements InterfaceC6776EZk {
    public static final InterfaceC6780EZp A05 = new C6774EZi();
    public final Class<? super SSLSocket> A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<+LX/Ec1;>;)V */
    @Override // X.InterfaceC6776EZk
    public final void A6r(String str, List list, SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AnonymousClass002.A1A(sSLSocket, 0, list);
        if (this.A00.isInstance(sSLSocket)) {
            try {
                this.A04.invoke(sSLSocket, AnonymousClass001.A0i());
                if (str != null) {
                    this.A03.invoke(sSLSocket, str);
                }
                Method method = this.A02;
                Logger logger = EZT.A00;
                C6818EaW c6818EaW = new C6818EaW();
                Iterator<String> it = AbstractC6773EZh.A00(list).iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    int length = strA0j.length();
                    c6818EaW.Aif(length);
                    c6818EaW.A0B(strA0j, 0, length);
                }
                method.invoke(sSLSocket, c6818EaW.AZB(c6818EaW.A00));
            } catch (IllegalAccessException e) {
                throw BV4.A0N(e);
            } catch (InvocationTargetException e2) {
                throw BV4.A0N(e2);
            }
        }
    }

    @Override // X.InterfaceC6776EZk
    public final String AKH(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        String strA0o = null;
        if (this.A00.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.A01.invoke(sSLSocket, null);
                if (bArr != null) {
                    strA0o = BV4.A0o(bArr);
                    return strA0o;
                }
            } catch (IllegalAccessException e) {
                throw BV4.A0N(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if ((cause instanceof NullPointerException) && "ssl == null".equals(cause.getMessage())) {
                    return strA0o;
                }
                throw BV4.A0N(e2);
            }
        }
        return null;
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AQL(SSLSocket sSLSocket) {
        C7384Etj.A0Y(sSLSocket, 0);
        return this.A00.isInstance(sSLSocket);
    }

    @Override // X.InterfaceC6776EZk
    public final boolean AP7() {
        return C6770EZe.A02;
    }

    public C6772EZg(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        this.A00 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C7384Etj.A0U(declaredMethod);
        this.A04 = declaredMethod;
        this.A03 = cls.getMethod("setHostname", String.class);
        this.A01 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.A02 = cls.getMethod("setAlpnProtocols", byte[].class);
    }
}

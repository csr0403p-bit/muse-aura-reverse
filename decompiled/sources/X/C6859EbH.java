package X;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.EbH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6859EbH implements Cloneable, Ecj {
    public final ProxySelector A00;
    public final List<C6872EbU> A01;
    public final List<InterfaceC6926EcZ> A02;
    public final List<InterfaceC6926EcZ> A03;
    public final List<EnumC6905Ec1> A04;
    public final SocketFactory A05;
    public final HostnameVerifier A06;
    public final SSLSocketFactory A07;
    public final X509TrustManager A08;
    public final Eb3 A09;
    public final Eb3 A0A;
    public final C6787EZw A0B;
    public final C6914EcF A0C;
    public final InterfaceC6803EaE A0D;
    public final C6869EbR A0E;
    public final DWp A0F;
    public final C6927Eca A0G;
    public final EcL A0H;
    public final AbstractC6792Ea1 A0I;
    public static final List<EnumC6905Ec1> A0K = AbstractC6843Eav.A07(EnumC6905Ec1.HTTP_2, EnumC6905Ec1.HTTP_1_1);
    public static final List<C6872EbU> A0J = AbstractC6843Eav.A07(C6872EbU.A06, C6872EbU.A04);

    public C6859EbH() {
        C6869EbR c6869EbR = new C6869EbR();
        C6914EcF c6914EcF = new C6914EcF();
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        C6932Ecg c6932Ecg = C6932Ecg.A00;
        byte[] bArr = AbstractC6843Eav.A06;
        C6927Eca c6927Eca = new C6927Eca(c6932Ecg);
        Eb3 eb3 = Eb3.A01;
        InterfaceC6803EaE interfaceC6803EaE = InterfaceC6803EaE.A00;
        DWp dWp = DWp.A00;
        SocketFactory socketFactory = SocketFactory.getDefault();
        C7384Etj.A0U(socketFactory);
        this(A0J, arrayListA0h, arrayListA0h2, A0K, socketFactory, C6559EEv.A00, eb3, eb3, C6787EZw.A02, c6914EcF, interfaceC6803EaE, c6869EbR, dWp, c6927Eca);
    }

    public final Object clone() {
        return super.clone();
    }

    public C6859EbH(List list, List list2, List list3, List list4, SocketFactory socketFactory, HostnameVerifier hostnameVerifier, Eb3 eb3, Eb3 eb32, C6787EZw c6787EZw, C6914EcF c6914EcF, InterfaceC6803EaE interfaceC6803EaE, C6869EbR c6869EbR, DWp dWp, C6927Eca c6927Eca) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, NoSuchProviderException {
        SSLSocketFactory socketFactory2;
        this.A0E = c6869EbR;
        this.A0C = c6914EcF;
        byte[] bArr = AbstractC6843Eav.A06;
        this.A02 = BV5.A13(list2);
        this.A03 = BV5.A13(list3);
        this.A0G = c6927Eca;
        this.A09 = eb3;
        this.A0D = interfaceC6803EaE;
        this.A0F = dWp;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.A00 = proxySelector == null ? C6857EbF.A00 : proxySelector;
        this.A0A = eb32;
        this.A05 = socketFactory;
        this.A01 = list;
        this.A04 = list4;
        this.A06 = hostnameVerifier;
        this.A0H = new EcL();
        if ((list instanceof Collection) && list.isEmpty()) {
            this.A07 = null;
            this.A0I = null;
            this.A08 = null;
            c6787EZw = C6787EZw.A02;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C6872EbU) it.next()).A00) {
                    X509TrustManager x509TrustManagerA05 = EZT.A01.A05();
                    this.A08 = x509TrustManagerA05;
                    EZT ezt = EZT.A01;
                    C7384Etj.A0X(x509TrustManagerA05);
                    if (ezt instanceof EZU) {
                        SSLContext sSLContextA04 = ezt.A04();
                        sSLContextA04.init(null, new TrustManager[]{x509TrustManagerA05}, null);
                        socketFactory2 = sSLContextA04.getSocketFactory();
                        C7384Etj.A0U(socketFactory2);
                    } else {
                        try {
                            SSLContext sSLContextA042 = ezt.A04();
                            sSLContextA042.init(null, new TrustManager[]{x509TrustManagerA05}, null);
                            socketFactory2 = sSLContextA042.getSocketFactory();
                            C7384Etj.A0U(socketFactory2);
                        } catch (GeneralSecurityException e) {
                            throw Bb9.A00(AnonymousClass006.A0y(e, "No System TLS: ", C60O.A0w()), e);
                        }
                    }
                    this.A07 = socketFactory2;
                    AbstractC6792Ea1 abstractC6792Ea1A06 = EZT.A01.A06(x509TrustManagerA05);
                    this.A0I = abstractC6792Ea1A06;
                    C7384Etj.A0X(abstractC6792Ea1A06);
                    if (!C7384Etj.areEqual(c6787EZw.A01, abstractC6792Ea1A06)) {
                        c6787EZw = new C6787EZw(c6787EZw.A00, abstractC6792Ea1A06);
                    }
                }
            }
            this.A07 = null;
            this.A0I = null;
            this.A08 = null;
            c6787EZw = C6787EZw.A02;
        }
        this.A0B = c6787EZw;
        List<InterfaceC6926EcZ> list5 = this.A02;
        if (!list5.contains(null)) {
            List<InterfaceC6926EcZ> list6 = this.A03;
            if (!list6.contains(null)) {
                List<C6872EbU> list7 = this.A01;
                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                    Iterator<C6872EbU> it2 = list7.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().A00) {
                            if (this.A07 != null) {
                                if (this.A0I != null) {
                                    if (this.A08 == null) {
                                        throw C3cG.A0Q("x509TrustManager == null");
                                    }
                                    return;
                                }
                                throw C3cG.A0Q("certificateChainCleaner == null");
                            }
                            throw C3cG.A0Q("sslSocketFactory == null");
                        }
                    }
                }
                if (this.A07 == null) {
                    if (this.A0I == null) {
                        if (this.A08 == null) {
                            if (!this.A0B.equals(C6787EZw.A02)) {
                                throw C3cG.A0Q("Check failed.");
                            }
                            return;
                        }
                        throw C3cG.A0Q("Check failed.");
                    }
                    throw C3cG.A0Q("Check failed.");
                }
                throw C3cG.A0Q("Check failed.");
            }
            throw C3cG.A0Q(AnonymousClass006.A0y(list6, "Null network interceptor: ", C60O.A0w()));
        }
        throw C3cG.A0Q(AnonymousClass006.A0y(list5, "Null interceptor: ", C60O.A0w()));
    }
}

package X;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public class EZT {
    public static final Logger A00;
    public static volatile EZT A01;

    public static final void A01(String str, int i, Throwable th) {
        C7384Etj.A0Y(str, 0);
        A00.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public AbstractC6792Ea1 A06(X509TrustManager x509TrustManager) {
        C7384Etj.A0Y(x509TrustManager, 0);
        return new EZX(A07(x509TrustManager));
    }

    public InterfaceC6781EZq A07(X509TrustManager x509TrustManager) {
        C7384Etj.A0Y(x509TrustManager, 0);
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C7384Etj.A0U(acceptedIssuers);
        return new EWU((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public final Object A02() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!(this instanceof C6770EZe)) {
            if (A00.isLoggable(Level.FINE)) {
                return new Throwable("response.body().close()");
            }
            return null;
        }
        C6779EZo c6779EZo = ((C6770EZe) this).A01;
        Method method = c6779EZo.A00;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = c6779EZo.A01;
            C7384Etj.A0X(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r1 == null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A03(javax.net.ssl.SSLSocket r6) throws java.lang.IllegalArgumentException {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.EZY
            if (r0 == 0) goto L1d
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            r2 = 0
            java.lang.String r1 = r6.getApplicationProtocol()     // Catch: java.lang.UnsupportedOperationException -> L1c
            if (r1 != 0) goto L10
            goto L17
        L10:
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)     // Catch: java.lang.UnsupportedOperationException -> L1c
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 == 0) goto L1b
            return r2
        L1b:
            return r1
        L1c:
            return r2
        L1d:
            boolean r0 = r5 instanceof X.EZZ
            if (r0 == 0) goto L5d
            X.EZZ r5 = (X.EZZ) r5
            java.lang.String r4 = "failed to get ALPN selected protocol"
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.lang.reflect.Method r1 = r5.A02     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L57
            r3 = 0
            java.lang.Object r0 = r1.invoke(r3, r0)     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.InvocationHandler r2 = java.lang.reflect.Proxy.getInvocationHandler(r0)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L50
            X.Eu3 r2 = (X.Eu3) r2     // Catch: java.lang.Throwable -> L57
            boolean r1 = r2.A01     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L4b
            java.lang.String r0 = r2.A00     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L4b
            java.lang.String r1 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r0 = 4
            A01(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            return r3
        L4b:
            if (r1 != 0) goto L85
            java.lang.String r3 = r2.A00     // Catch: java.lang.Throwable -> L57
            return r3
        L50:
            java.lang.String r0 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            java.lang.AssertionError r0 = X.Bb9.A00(r4, r0)
            throw r0
        L5d:
            boolean r0 = r5 instanceof X.C6770EZe
            if (r0 == 0) goto L88
            X.EZe r5 = (X.C6770EZe) r5
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.util.List<X.EZk> r0 = r5.A00
            java.util.Iterator r2 = r0.iterator()
        L6d:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L86
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.EZk r0 = (X.InterfaceC6776EZk) r0
            boolean r0 = r0.AQL(r6)
            if (r0 == 0) goto L6d
        L81:
            X.EZk r1 = (X.InterfaceC6776EZk) r1
            if (r1 != 0) goto Lb3
        L85:
            return r3
        L86:
            r1 = r3
            goto L81
        L88:
            boolean r0 = r5 instanceof X.C6771EZf
            if (r0 == 0) goto Lb8
            X.EZf r5 = (X.C6771EZf) r5
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.util.List<X.EZk> r0 = r5.A00
            java.util.Iterator r2 = r0.iterator()
        L98:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto Lb1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.EZk r0 = (X.InterfaceC6776EZk) r0
            boolean r0 = r0.AQL(r6)
            if (r0 == 0) goto L98
        Lac:
            X.EZk r1 = (X.InterfaceC6776EZk) r1
            if (r1 != 0) goto Lb3
            return r3
        Lb1:
            r1 = r3
            goto Lac
        Lb3:
            java.lang.String r3 = r1.AKH(r6)
            return r3
        Lb8:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZT.A03(javax.net.ssl.SSLSocket):java.lang.String");
    }

    public final SSLContext A04() throws NoSuchAlgorithmException {
        SSLContext sSLContext;
        String str;
        Provider provider;
        if (this instanceof EZW) {
            str = "TLSv1.3";
            provider = ((EZW) this).A00;
        } else if (this instanceof EZU) {
            str = "TLS";
            provider = ((EZU) this).A00;
        } else {
            if (!(this instanceof EZV)) {
                sSLContext = SSLContext.getInstance("TLS");
                C7384Etj.A0U(sSLContext);
                return sSLContext;
            }
            str = "TLS";
            provider = ((EZV) this).A00;
        }
        sSLContext = SSLContext.getInstance(str, provider);
        C7384Etj.A0U(sSLContext);
        return sSLContext;
    }

    public X509TrustManager A05() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManager trustManager;
        if (this instanceof EZW) {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), ((EZW) this).A00);
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            C7384Etj.A0X(trustManagers);
            if (trustManagers.length == 1) {
                trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    if (trustManager == null) {
                        throw BV4.A0a("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    }
                }
            }
            throw A00(trustManagers);
        }
        if (this instanceof EZV) {
            TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
            trustManagerFactory2.init((KeyStore) null);
            TrustManager[] trustManagers2 = trustManagerFactory2.getTrustManagers();
            C7384Etj.A0X(trustManagers2);
            if (trustManagers2.length == 1) {
                trustManager = trustManagers2[0];
                if (trustManager instanceof X509TrustManager) {
                    if (trustManager == null) {
                        throw BV4.A0a("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    }
                }
            }
            throw A00(trustManagers2);
        }
        TrustManagerFactory trustManagerFactory3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory3.init((KeyStore) null);
        TrustManager[] trustManagers3 = trustManagerFactory3.getTrustManagers();
        C7384Etj.A0X(trustManagers3);
        if (trustManagers3.length == 1) {
            trustManager = trustManagers3[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw BV4.A0a("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
            }
        }
        throw A00(trustManagers3);
        return (X509TrustManager) trustManager;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List<LX/Ec1;>;)V */
    public void A08(String str, List list, SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC6776EZk next;
        if (this instanceof EZY) {
            AnonymousClass002.A1A(sSLSocket, 0, list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = AbstractC6773EZh.A00(list).toArray(new String[0]);
            if (array == null) {
                throw BV6.A0h();
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        if (this instanceof EZZ) {
            EZZ ezz = (EZZ) this;
            AnonymousClass003.A0v(sSLSocket, list);
            try {
                ezz.A03.invoke(null, sSLSocket, Proxy.newProxyInstance(EZT.class.getClassLoader(), new Class[]{ezz.A00, ezz.A01}, new Eu3(AbstractC6773EZh.A00(list))));
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw Bb9.A00("failed to set ALPN", e);
            }
        }
        if (this instanceof C6770EZe) {
            AnonymousClass003.A0v(sSLSocket, list);
            Iterator<InterfaceC6776EZk> it = ((C6770EZe) this).A00.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.AQL(sSLSocket)) {
                    break;
                }
            }
            next = null;
        } else {
            if (!(this instanceof C6771EZf)) {
                return;
            }
            AnonymousClass003.A0v(sSLSocket, list);
            Iterator<InterfaceC6776EZk> it2 = ((C6771EZf) this).A00.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (next.AQL(sSLSocket)) {
                    break;
                }
            }
            next = null;
        }
        InterfaceC6776EZk interfaceC6776EZk = next;
        if (interfaceC6776EZk != null) {
            interfaceC6776EZk.A6r(str, list, sSLSocket);
        }
    }

    public final void A09(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this instanceof EZZ) {
            try {
                ((EZZ) this).A04.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw Bb9.A00("failed to remove ALPN", e);
            }
        }
    }

    static {
        EZT ezz;
        if (BV8.A1W()) {
            Iterator itA0n = AnonymousClass002.A0n(AbstractC5302Dfl.A00);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                String str = (String) entryA0l.getValue();
                Logger logger = Logger.getLogger(strA0t);
                if (AbstractC5302Dfl.A01.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(BV4.A1U(str) ? Level.FINE : Log.isLoggable(str, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(CHY.A00);
                }
            }
            if (C6771EZf.A01) {
                ezz = new C6771EZf();
            } else {
                ezz = C6770EZe.A02 ? new C6770EZe() : null;
                C7384Etj.A0X(ezz);
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName()) && EZU.A02) {
            ezz = new EZU();
        } else if ("BC".equals(Security.getProviders()[0].getName()) && EZV.A02) {
            ezz = new EZV();
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName()) && EZW.A02) {
            ezz = new EZW();
        } else if (EZY.A00) {
            ezz = new EZY();
        } else {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                C7384Etj.A0U(property);
            } catch (NumberFormatException unused) {
            }
            if (Integer.parseInt(property) < 9) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName(AnonymousClass006.A0y("$Provider", "org.eclipse.jetty.alpn.ALPN", C60O.A0w()), true, null);
                    Class<?> cls3 = Class.forName(AnonymousClass006.A0y("$ClientProvider", "org.eclipse.jetty.alpn.ALPN", C60O.A0w()), true, null);
                    Class<?> cls4 = Class.forName(AnonymousClass006.A0y("$ServerProvider", "org.eclipse.jetty.alpn.ALPN", C60O.A0w()), true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    C7384Etj.A0U(method);
                    C7384Etj.A0U(method2);
                    C7384Etj.A0U(method3);
                    C7384Etj.A0U(cls3);
                    C7384Etj.A0U(cls4);
                    ezz = new EZZ(cls3, cls4, method, method2, method3);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                }
            }
            ezz = new EZT();
        }
        A01 = ezz;
        A00 = BV5.A1B(C6859EbH.class);
    }

    public static IllegalStateException A00(Object[] objArr) {
        String string = Arrays.toString(objArr);
        C7384Etj.A0U(string);
        return new IllegalStateException(C7384Etj.A0J("Unexpected default trust managers: ", string));
    }

    public final String toString() {
        return C3cI.A0Y(this);
    }
}

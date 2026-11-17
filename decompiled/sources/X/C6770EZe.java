package X;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.EZe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6770EZe extends EZT {
    public static final boolean A02;
    public final List<InterfaceC6776EZk> A00;
    public final C6779EZo A01;

    @Override // X.EZT
    public final AbstractC6792Ea1 A06(X509TrustManager x509TrustManager) {
        C7384Etj.A0Y(x509TrustManager, 0);
        try {
            return new C6768EZc(new X509TrustManagerExtensions(x509TrustManager), x509TrustManager);
        } catch (IllegalArgumentException unused) {
            return super.A06(x509TrustManager);
        }
    }

    @Override // X.EZT
    public final InterfaceC6781EZq A07(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        C7384Etj.A0Y(x509TrustManager, 0);
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new EWV(declaredMethod, x509TrustManager);
        } catch (NoSuchMethodException unused) {
            return super.A07(x509TrustManager);
        }
    }

    static {
        boolean z = false;
        if (BV8.A1W() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        A02 = z;
    }

    public C6770EZe() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        C6784EZt c6784EZt;
        Method method;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName(AnonymousClass006.A0y(".OpenSSLSocketImpl", "com.android.org.conscrypt", C60O.A0w()));
        } catch (Exception e) {
            EZT.A01("unable to load android socket classes", 5, e);
            c6784EZt = null;
        }
        if (cls == null) {
            throw BV4.A0a("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
        }
        if (Class.forName(AnonymousClass006.A0y(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt", C60O.A0w())) == null) {
            throw BV4.A0a("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
        }
        C7384Etj.A0U(Class.forName(AnonymousClass006.A0y(".SSLParametersImpl", "com.android.org.conscrypt", C60O.A0w())));
        c6784EZt = new C6784EZt(cls);
        List listA0F = BFI.A0F(new InterfaceC6776EZk[]{c6784EZt, new C6775EZj(C6772EZg.A05), new C6775EZj(C6769EZd.A00), new C6775EZj(C6767EZb.A00)});
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0F) {
            if (((InterfaceC6776EZk) obj).AP7()) {
                arrayListA0h.add(obj);
            }
        }
        this.A00 = arrayListA0h;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = method3;
            method2 = method3;
        }
        this.A01 = new C6779EZo(method3, method2, method);
    }
}

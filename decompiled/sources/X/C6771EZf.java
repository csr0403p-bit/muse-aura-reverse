package X;

import android.net.http.X509TrustManagerExtensions;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.EZf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6771EZf extends EZT {
    public static final boolean A01 = AnonymousClass002.A1L(BV8.A1W() ? 1 : 0);
    public final List<InterfaceC6776EZk> A00;

    @Override // X.EZT
    public final AbstractC6792Ea1 A06(X509TrustManager x509TrustManager) {
        C7384Etj.A0Y(x509TrustManager, 0);
        try {
            return new C6768EZc(new X509TrustManagerExtensions(x509TrustManager), x509TrustManager);
        } catch (IllegalArgumentException unused) {
            return super.A06(x509TrustManager);
        }
    }

    public C6771EZf() {
        List listA0F = BFI.A0F(new InterfaceC6776EZk[]{BV8.A1W() ? new C6766EZa() : null, new C6775EZj(C6772EZg.A05), new C6775EZj(C6769EZd.A00), new C6775EZj(C6767EZb.A00)});
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0F) {
            if (((InterfaceC6776EZk) obj).AP7()) {
                arrayListA0h.add(obj);
            }
        }
        this.A00 = arrayListA0h;
    }
}

package X;

import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.util.Locale;

/* renamed from: X.6tK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6tK {
    public Uri A00;
    public String A01;
    public String A02;

    public static C6tK A00(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            return null;
        }
        if ((!scheme.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP) && !scheme.equalsIgnoreCase("https")) || uri.getHost() == null) {
            return null;
        }
        C6tK c6tK = new C6tK();
        c6tK.A00 = uri;
        String host = uri.getHost();
        C1H.A00(host);
        Locale locale = Locale.ENGLISH;
        c6tK.A01 = host.toLowerCase(locale);
        String scheme2 = uri.getScheme();
        C1H.A00(scheme2);
        c6tK.A02 = scheme2.toLowerCase(locale);
        return c6tK;
    }
}

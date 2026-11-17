package X;

import android.net.Uri;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6tJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6tJ {
    public static final Set<String> A00;
    public static final Set<String> A01;
    public static final Set<String> A02;

    public static boolean A01(C6tK c6tK, String str) {
        String str2 = c6tK.A01;
        return str2.equals(str) || str2.endsWith(FGI.A0M(".", str));
    }

    static {
        HashSet hashSetA13 = C60O.A13();
        A01 = hashSetA13;
        hashSetA13.add("dev");
        hashSetA13.add("intern");
        hashSetA13.add("alpha");
        hashSetA13.add("beta");
        hashSetA13.add("latest");
        hashSetA13.add("prod");
        HashSet hashSetA132 = C60O.A13();
        A00 = hashSetA132;
        hashSetA132.add(ErrorReportingConstants.APP_NAME_KEY);
        hashSetA132.add("developers");
        hashSetA132.add("partners");
        HashSet hashSetA133 = C60O.A13();
        A02 = hashSetA133;
        hashSetA133.add("our");
        hashSetA133.add("tools");
        hashSetA133.add("fiddle");
        hashSetA133.add("interngraph");
    }

    public static boolean A00(Uri uri) {
        String fragment;
        Uri uriBuild;
        C6tK c6tKA00 = C6tK.A00(uri);
        if (c6tKA00 == null || !A01(c6tKA00, AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX) || !c6tKA00.A02.equals("https") || c6tKA00.A01.startsWith("apps") || (!c6tKA00.A00.getPathSegments().isEmpty() && C60Q.A0n(c6tKA00.A00.getPathSegments(), 0).equalsIgnoreCase("apps"))) {
            return false;
        }
        C6tK c6tKA002 = C6tK.A00(uri);
        if (c6tKA002 == null || !A01(c6tKA002, AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX) || (fragment = uri.getFragment()) == null || !fragment.startsWith("!/") || (uriBuild = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getHost()).path(fragment.substring(1)).build()) == null || uriBuild.equals(uri)) {
            return true;
        }
        return A00(uriBuild);
    }
}

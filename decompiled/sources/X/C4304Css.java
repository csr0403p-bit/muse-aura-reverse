package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.Css, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4304Css extends AbstractC4308Csw {
    public final String A00;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4304Css(String str, Set set) {
        C7384Etj.A0Y(str, 0);
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundleA0N.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundleA0N.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundleA0N2 = BV6.A0N();
        bundleA0N2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundleA0N2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        bundleA0N2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        super(bundleA0N, bundleA0N2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", set, 100, false, true);
        this.A00 = str;
        if (!AbstractC4343Ctl.A00(str)) {
            throw C60O.A0i("requestJson must not be empty, and must be a valid JSON");
        }
    }
}

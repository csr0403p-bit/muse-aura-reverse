package X;

import android.os.Bundle;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig;

/* renamed from: X.Csv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4307Csv extends AbstractC4404CvH {
    public final String A00;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4307Csv() {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", AuraCredentialManagerConfig.GOOGLE_CLIENT_ID);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundleA0N.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        Bundle bundleA0N2 = BV6.A0N();
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", AuraCredentialManagerConfig.GOOGLE_CLIENT_ID);
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundleA0N2.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        super(bundleA0N, bundleA0N2, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", A3q.A00, 2000, true, true);
        if ("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL".length() <= 0) {
            throw C60O.A0i("type should not be empty");
        }
        this.A00 = AuraCredentialManagerConfig.GOOGLE_CLIENT_ID;
        if (AuraCredentialManagerConfig.GOOGLE_CLIENT_ID.length() <= 0) {
            throw C60O.A0i("serverClientId should not be empty");
        }
    }
}

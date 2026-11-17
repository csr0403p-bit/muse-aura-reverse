package X;

import android.os.Bundle;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig;

/* renamed from: X.Cst, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4305Cst extends AbstractC4404CvH {
    public final String A00;
    public final String A01;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4305Cst(String str) {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", AuraCredentialManagerConfig.GOOGLE_CLIENT_ID);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str);
        bundleA0N.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundleA0N.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundleA0N.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundleA0N.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        Bundle bundleA0N2 = BV6.A0N();
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", AuraCredentialManagerConfig.GOOGLE_CLIENT_ID);
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str);
        bundleA0N2.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundleA0N2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundleA0N2.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundleA0N2.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundleA0N2.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        super(bundleA0N, bundleA0N2, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", A3q.A00, 2000, true, false);
        if ("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL".length() <= 0) {
            throw C60O.A0i("type should not be empty");
        }
        this.A00 = AuraCredentialManagerConfig.GOOGLE_CLIENT_ID;
        this.A01 = str;
        if (AuraCredentialManagerConfig.GOOGLE_CLIENT_ID.length() <= 0) {
            throw C60O.A0i("serverClientId should not be empty");
        }
    }
}

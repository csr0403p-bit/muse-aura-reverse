package X;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;

/* renamed from: X.Csu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4306Csu extends C4402CvF {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public static final C4306Csu A02(Bundle bundle) throws GoogleIdTokenParsingException {
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            C7384Etj.A0X(string);
            C7384Etj.A0X(string2);
            return new C4306Csu(uri, string, string2, string3, string4, string5, string6);
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4306Csu(Uri uri, String str, String str2, String str3, String str4, String str5, String str6) {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundleA0N.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundleA0N.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundleA0N);
        if ("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL".length() <= 0) {
            throw C60O.A0i("type should not be empty");
        }
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = uri;
        if (str.length() <= 0) {
            throw C60O.A0i("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw C60O.A0i("idToken should not be empty");
        }
    }
}

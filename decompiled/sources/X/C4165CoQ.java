package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.CoQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4165CoQ {
    public static C4165CoQ A02;
    public static final Lock A03 = new ReentrantLock();
    public final SharedPreferences A00;
    public final Lock A01 = new ReentrantLock();

    public static final String A01(C4165CoQ c4165CoQ, String str) {
        Lock lock = c4165CoQ.A01;
        lock.lock();
        try {
            return c4165CoQ.A00.getString(str, null);
        } finally {
            lock.unlock();
        }
    }

    public final GoogleSignInAccount A02() {
        String strA01;
        String strA012 = A01(this, "defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strA012) && (strA01 = A01(this, FGI.A0U("googleSignInAccount", ":", strA012))) != null) {
            try {
                if (!TextUtils.isEmpty(strA01)) {
                    JSONObject jSONObjectA19 = BV4.A19(strA01);
                    String strOptString = jSONObjectA19.optString("photoUrl");
                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                    long j = Long.parseLong(jSONObjectA19.getString("expirationTime"));
                    HashSet hashSetA13 = C60O.A13();
                    JSONArray jSONArray = jSONObjectA19.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSetA13.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String strOptString2 = jSONObjectA19.optString("id");
                    String strOptString3 = jSONObjectA19.has("tokenId") ? jSONObjectA19.optString("tokenId") : null;
                    String strOptString4 = jSONObjectA19.has("email") ? jSONObjectA19.optString("email") : null;
                    String strOptString5 = jSONObjectA19.has("displayName") ? jSONObjectA19.optString("displayName") : null;
                    String strOptString6 = jSONObjectA19.has("givenName") ? jSONObjectA19.optString("givenName") : null;
                    String strOptString7 = jSONObjectA19.has("familyName") ? jSONObjectA19.optString("familyName") : null;
                    String string = jSONObjectA19.getString("obfuscatedIdentifier");
                    CRy.A05(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(uri, strOptString2, strOptString3, strOptString4, strOptString5, null, string, strOptString6, strOptString7, BV4.A0t(hashSetA13), 3, j);
                    googleSignInAccount.A00 = jSONObjectA19.has("serverAuthCode") ? jSONObjectA19.optString("serverAuthCode") : null;
                    return googleSignInAccount;
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions A03() {
        String strA01;
        String strA012 = A01(this, "defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strA012) && (strA01 = A01(this, FGI.A0U("googleSignInOptions", ":", strA012))) != null) {
            try {
                Parcelable.Creator<GoogleSignInOptions> creator = GoogleSignInOptions.CREATOR;
                if (!TextUtils.isEmpty(strA01)) {
                    JSONObject jSONObjectA19 = BV4.A19(strA01);
                    HashSet hashSetA13 = C60O.A13();
                    JSONArray jSONArray = jSONObjectA19.getJSONArray("scopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSetA13.add(new Scope(1, jSONArray.getString(i)));
                    }
                    String strOptString = jSONObjectA19.has("accountName") ? jSONObjectA19.optString("accountName") : null;
                    return new GoogleSignInOptions(!TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObjectA19.has("serverClientId") ? jSONObjectA19.optString("serverClientId") : null, jSONObjectA19.has("hostedDomain") ? jSONObjectA19.optString("hostedDomain") : null, null, BV4.A0t(hashSetA13), BV4.A0u(), 3, jSONObjectA19.getBoolean("idTokenRequested"), jSONObjectA19.getBoolean("serverAuthRequested"), jSONObjectA19.getBoolean("forceCodeForRefreshToken"));
                }
                return null;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public C4165CoQ(Context context) {
        this.A00 = BV4.A07(context, "com.google.android.gms.signin");
    }

    public static C4165CoQ A00(Context context) {
        CRy.A03(context);
        Lock lock = A03;
        lock.lock();
        try {
            C4165CoQ c4165CoQ = A02;
            if (c4165CoQ == null) {
                c4165CoQ = new C4165CoQ(context.getApplicationContext());
                A02 = c4165CoQ;
            }
            return c4165CoQ;
        } finally {
            lock.unlock();
        }
    }
}

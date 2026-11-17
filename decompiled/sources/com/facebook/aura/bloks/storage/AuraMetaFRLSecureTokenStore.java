package com.facebook.aura.bloks.storage;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BzK;
import X.C06G;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4oT;
import X.C5198DdA;
import X.C7384Etj;
import X.C7BY;
import X.C9X;
import X.CFK;
import X.F0C;
import X.FGI;
import android.util.Base64;
import com.facebook.aura.hatchlockcrypto.HatchPassphraseEncryptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class AuraMetaFRLSecureTokenStore {
    public static final String ENCRYPTED_PREFIX = "enc1:";
    public static final String JSON_KEY_COUNT = "count";
    public static final String JSON_KEY_EXPIRATION = "expirationTimestamp";
    public static final String KEY_ALIAS = "hatch_meta_frl_token_store";
    public static final String PREF_KEY_E2E_CLEARED = "e2e_cleared";
    public static final String PREF_KEY_FRL_CATEGORY_COUNT_PREFIX = "frl_category_count_";
    public static final String PREF_KEY_META_ACCOUNT_ACCESS_TOKEN = "meta_account_access_token";
    public static final String PREF_KEY_META_ACCOUNT_COOKIE = "meta_account_cookie";
    public static final String PREF_KEY_META_ACCOUNT_ID = "meta_account_id";
    public static final String PREF_KEY_REFRESH_TOKEN = "hatch_refresh_token";
    public static final String TAG = "AuraMetaFRLSecureTokenStore";
    public static String cachedFrlFingerprint;
    public static String fingerprintedSealedToken;
    public static final AuraMetaFRLSecureTokenStore INSTANCE = new AuraMetaFRLSecureTokenStore();
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final F0C prefs$delegate = AbstractC5321DgF.A03(AuraMetaFRLSecureTokenStore$prefs$2.INSTANCE);

    public final class CategoryCountData extends C06G {
        public final int count;
        public final long expirationTimestamp;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CategoryCountData) {
                    CategoryCountData categoryCountData = (CategoryCountData) obj;
                    if (this.count != categoryCountData.count || this.expirationTimestamp != categoryCountData.expirationTimestamp) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CategoryCountData copy$default(CategoryCountData categoryCountData, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = categoryCountData.count;
            }
            if ((i2 & 2) != 0) {
                j = categoryCountData.expirationTimestamp;
            }
            return new CategoryCountData(i, j);
        }

        public final int component1() {
            return this.count;
        }

        public final long component2() {
            return this.expirationTimestamp;
        }

        public final CategoryCountData copy(int i, long j) {
            return new CategoryCountData(i, j);
        }

        public final int getCount() {
            return this.count;
        }

        public final long getExpirationTimestamp() {
            return this.expirationTimestamp;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.expirationTimestamp, this.count * 31);
        }

        public CategoryCountData(int i, long j) {
            this.count = i;
            this.expirationTimestamp = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final synchronized void clear() {
        BzK bzKA03 = BzK.A03(prefs$delegate);
        bzKA03.Aae(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN);
        bzKA03.Aae(PREF_KEY_META_ACCOUNT_ID);
        bzKA03.Aae(PREF_KEY_META_ACCOUNT_COOKIE);
        bzKA03.Aae(PREF_KEY_REFRESH_TOKEN);
        C3cI.A1H(bzKA03, PREF_KEY_E2E_CLEARED);
    }

    public final synchronized String frlFingerprint() {
        String str;
        str = null;
        String string = F0C.A04().getString(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN, null);
        if (string == null) {
            fingerprintedSealedToken = null;
            cachedFrlFingerprint = null;
        } else {
            if (!string.equals(fingerprintedSealedToken)) {
                fingerprintedSealedToken = string;
                cachedFrlFingerprint = fingerprint(string);
            }
            str = cachedFrlFingerprint;
        }
        return str;
    }

    public final synchronized int getCategoryCount(String str) {
        int i;
        i = 0;
        C7384Etj.A0Y(str, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA0M = FGI.A0M(PREF_KEY_FRL_CATEGORY_COUNT_PREFIX, str);
        CategoryCountData categoryData = getCategoryData(strA0M);
        if (categoryData != null) {
            if (categoryData.expirationTimestamp <= jCurrentTimeMillis) {
                BzK bzKA03 = BzK.A03(prefs$delegate);
                bzKA03.Aae(strA0M);
                bzKA03.apply();
            } else {
                i = categoryData.count;
            }
        }
        return i;
    }

    public final synchronized int increaseCategoryCount(String str, long j) {
        int i;
        C7384Etj.A0Y(str, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA0M = FGI.A0M(PREF_KEY_FRL_CATEGORY_COUNT_PREFIX, str);
        CategoryCountData categoryData = getCategoryData(strA0M);
        i = 1;
        if (categoryData != null && categoryData.expirationTimestamp > jCurrentTimeMillis) {
            i = 1 + categoryData.count;
        }
        saveCategoryData(strA0M, new CategoryCountData(i, j));
        return i;
    }

    public final boolean replaceSealedMetaCredentials(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        synchronized (this) {
            F0C f0c = prefs$delegate;
            String string = ((C4oT) f0c.getValue()).getString(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN, null);
            String string2 = ((C4oT) f0c.getValue()).getString(PREF_KEY_META_ACCOUNT_ID, null);
            BzK bzKA03 = BzK.A03(f0c);
            bzKA03.AYr(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN, str);
            bzKA03.AYr(PREF_KEY_META_ACCOUNT_ID, str2);
            if (bzKA03.A0B(0)) {
                return zA1a;
            }
            BzK bzKA032 = BzK.A03(f0c);
            if (string == null) {
                bzKA032.Aae(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN);
            } else {
                bzKA032.AYr(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN, string);
            }
            if (string2 == null) {
                bzKA032.Aae(PREF_KEY_META_ACCOUNT_ID);
            } else {
                bzKA032.AYr(PREF_KEY_META_ACCOUNT_ID, string2);
            }
            if (!bzKA032.A0B(0)) {
                CFK.A04(TAG, "failed to restore previous FRL credentials after replacement failure");
            }
            return false;
        }
    }

    public final boolean replaceSealedRefreshToken(String str) {
        boolean zA0B;
        synchronized (this) {
            BzK bzKA03 = BzK.A03(prefs$delegate);
            if (str == null) {
                bzKA03.Aae(PREF_KEY_REFRESH_TOKEN);
            } else {
                bzKA03.AYr(PREF_KEY_REFRESH_TOKEN, str);
            }
            zA0B = bzKA03.A0B(0);
        }
        return zA0B;
    }

    public final String sealForReplacement(String str) {
        C7384Etj.A0Y(str, 0);
        String strSeal = seal(str);
        if (strSeal == null || !str.equals(unseal(strSeal))) {
            return null;
        }
        return strSeal;
    }

    public final void setMetaAccountCookie(String str) {
        C7384Etj.A0Y(str, 0);
        writeSecret(PREF_KEY_META_ACCOUNT_COOKIE, str);
    }

    public final synchronized void setMetaAccountId(String str) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA03 = BzK.A03(prefs$delegate);
        bzKA03.AYr(PREF_KEY_META_ACCOUNT_ID, str);
        bzKA03.apply();
    }

    public final String unsealRefreshToken(String str) {
        C7384Etj.A0Y(str, 0);
        return str.startsWith(ENCRYPTED_PREFIX) ? unseal(str) : str;
    }

    private final String getCategoryKey(String str) {
        return FGI.A0M(PREF_KEY_FRL_CATEGORY_COUNT_PREFIX, str);
    }

    private final String seal(String str) {
        try {
            return FGI.A0M(ENCRYPTED_PREFIX, Base64.encodeToString(HatchPassphraseEncryptor.INSTANCE.encrypt(KEY_ALIAS, C3cG.A1S(str)), 2));
        } catch (Throwable th) {
            CFK.A08(TAG, "failed to encrypt stored credential", th);
            return null;
        }
    }

    private final String unseal(String str) {
        try {
            byte[] bArrDecode = Base64.decode(C7BY.A0K(ENCRYPTED_PREFIX, str), 2);
            HatchPassphraseEncryptor hatchPassphraseEncryptor = HatchPassphraseEncryptor.INSTANCE;
            C7384Etj.A0X(bArrDecode);
            return BV4.A0o(hatchPassphraseEncryptor.decrypt(KEY_ALIAS, bArrDecode));
        } catch (Throwable th) {
            CFK.A08(TAG, "failed to decrypt stored credential; treating as absent", th);
            return null;
        }
    }

    private final void writeSecret(String str, String str2) {
        BzK bzKA03;
        String strSeal = str2 != null ? seal(str2) : null;
        synchronized (this) {
            if (str2 == null || strSeal != null) {
                bzKA03 = BzK.A03(prefs$delegate);
                bzKA03.AYr(str, strSeal);
            } else {
                bzKA03 = BzK.A03(prefs$delegate);
                bzKA03.Aae(str);
            }
            bzKA03.apply();
        }
    }

    public final String getMetaAccountCookie() {
        return readSecret(PREF_KEY_META_ACCOUNT_COOKIE);
    }

    public final String getRefreshToken() {
        return readSecret(PREF_KEY_REFRESH_TOKEN);
    }

    public final void setMetaAccessToken(String str) {
        writeSecret(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN, str);
    }

    private final String fingerprint(String str) {
        byte[] bArrA1T = C3cH.A1T(str);
        int length = bArrA1T.length;
        char[] cArr = new char[length * 2];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArrA1T[i];
            int i3 = i2 + 1;
            int i4 = i2 * 2;
            char[] cArr2 = HEX_DIGITS;
            cArr[i4] = cArr2[(b & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b & 15];
            i++;
            i2 = i3;
        }
        return new String(cArr);
    }

    private final CategoryCountData getCategoryData(String str) {
        String string = F0C.A04().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObjectA19 = BV4.A19(string);
            return new CategoryCountData(jSONObjectA19.getInt(JSON_KEY_COUNT), jSONObjectA19.getLong(JSON_KEY_EXPIRATION));
        } catch (Exception unused) {
            return null;
        }
    }

    private final C4oT getPrefs() {
        return F0C.A04();
    }

    private final void migrateToSealed(String str, String str2) {
        String strSeal = seal(str2);
        if (strSeal != null) {
            synchronized (this) {
                F0C f0c = prefs$delegate;
                if (C7384Etj.areEqual(C4oT.A00((C4oT) f0c.getValue(), str), str2)) {
                    BzK bzKA03 = BzK.A03(f0c);
                    bzKA03.AYr(str, strSeal);
                    bzKA03.apply();
                }
            }
        }
    }

    private final String readSecret(String str) {
        String string = F0C.A04().getString(str, null);
        if (string == null) {
            return null;
        }
        if (string.startsWith(ENCRYPTED_PREFIX)) {
            return unseal(string);
        }
        migrateToSealed(str, string);
        return string;
    }

    private final void saveCategoryData(String str, CategoryCountData categoryCountData) throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        jSONObjectA18.put(JSON_KEY_COUNT, categoryCountData.count);
        jSONObjectA18.put(JSON_KEY_EXPIRATION, categoryCountData.expirationTimestamp);
        BzK bzKA03 = BzK.A03(prefs$delegate);
        bzKA03.AYr(str, jSONObjectA18.toString());
        bzKA03.apply();
    }

    public final String getMetaAccessToken() {
        C5198DdA c5198DdAA00;
        return (!C9X.A04() || F0C.A04().getBoolean(PREF_KEY_E2E_CLEARED, false) || (c5198DdAA00 = C9X.A00()) == null || c5198DdAA00.A00 == null) ? readSecret(PREF_KEY_META_ACCOUNT_ACCESS_TOKEN) : c5198DdAA00.A02;
    }

    public final String getMetaAccountId() {
        C5198DdA c5198DdAA00;
        return (!C9X.A04() || F0C.A04().getBoolean(PREF_KEY_E2E_CLEARED, false) || (c5198DdAA00 = C9X.A00()) == null || c5198DdAA00.A00 == null) ? C4oT.A00(F0C.A04(), PREF_KEY_META_ACCOUNT_ID) : c5198DdAA00.A03;
    }

    public final boolean hasRefreshToken() {
        return F0C.A04().contains(PREF_KEY_REFRESH_TOKEN);
    }

    public final String sealedRefreshToken() {
        return C4oT.A00(F0C.A04(), PREF_KEY_REFRESH_TOKEN);
    }
}

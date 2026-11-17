package com.facebook.aura.network.sandbox;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.BzK;
import X.C4oT;
import X.C5322DgG;
import X.F0C;
import com.facebook.aura.gateway.JarvisProtocolKt;

/* loaded from: classes2.dex */
public final class HatchDeveloperOverrides {
    public static final String ATOD_TOKEN_KEY = "atod_token";
    public static final HatchDeveloperOverrides INSTANCE = new HatchDeveloperOverrides();
    public static final String SIGNUP_NAME_COLLECTION_OVERRIDE_KEY = "signup_name_collection_override";
    public static volatile String cachedAtodToken;
    public static volatile Boolean cachedSignupNameCollectionOverride;
    public static final F0C prefs$delegate;

    public final void setAtodToken(String str) {
        BzK bzKA9q;
        String strA0l;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        cachedAtodToken = str2;
        C4oT c4oT = (C4oT) prefs$delegate.getValue();
        if (c4oT == null || (bzKA9q = c4oT.A9q()) == null) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        bzKA9q.AYr(JarvisProtocolKt.ATOD_TOKEN_QUERY_PARAM, str2);
        bzKA9q.commit();
    }

    static {
        String strA0l;
        String string;
        C5322DgG c5322DgGA03 = AbstractC5321DgF.A03(HatchDeveloperOverrides$prefs$2.INSTANCE);
        prefs$delegate = c5322DgGA03;
        C4oT c4oT = (C4oT) c5322DgGA03.getValue();
        Boolean boolValueOf = null;
        if (c4oT == null || (string = c4oT.getString(JarvisProtocolKt.ATOD_TOKEN_QUERY_PARAM, null)) == null || (strA0l = AnonymousClass002.A0l(string)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        cachedAtodToken = strA0l;
        C4oT c4oT2 = (C4oT) prefs$delegate.getValue();
        if (c4oT2 != null && c4oT2.contains(SIGNUP_NAME_COLLECTION_OVERRIDE_KEY)) {
            boolValueOf = Boolean.valueOf(c4oT2.getBoolean(SIGNUP_NAME_COLLECTION_OVERRIDE_KEY, false));
        }
        cachedSignupNameCollectionOverride = boolValueOf;
    }

    private final C4oT getPrefs() {
        return (C4oT) prefs$delegate.getValue();
    }

    public final String getAtodToken() {
        return cachedAtodToken;
    }

    public final Boolean getSignupNameCollectionOverride() {
        return null;
    }

    public final void setSignupNameCollectionOverride(Boolean bool) {
    }
}
